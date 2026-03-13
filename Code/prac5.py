import RPi.GPIO as GPIO
import time

# Set the GPIO mode to BCM
GPIO.setmode(GPIO.BCM)

# Define the PIN numbers for the light sensor and the LED
LIGHT_SENSOR_PIN = 15
LED_PIN = 12  # FIX: PDF physical setup uses GPIO 12; ensure LED is connected here via 220Ω resistor

# Set up the light sensor PIN as an input with a pull-up resistor
GPIO.setup(LIGHT_SENSOR_PIN, GPIO.IN, pull_up_down=GPIO.PUD_UP)

# Set up the LED PIN as an output
GPIO.setup(LED_PIN, GPIO.OUT)

try:
    while True:
        # Read the state of the light sensor
        light_state = GPIO.input(LIGHT_SENSOR_PIN)

        # Control the LED based on the light sensor state
        if light_state == GPIO.LOW:
            # Light is present, turn off the LED
            GPIO.output(LED_PIN, GPIO.LOW)
            print('Light is present, turn off the LED')
        else:
            # Light is not present, turn on the LED
            GPIO.output(LED_PIN, GPIO.HIGH)
            print('Light is not present, turn on the LED')

        # Small delay to avoid rapid state changes
        time.sleep(1)

except KeyboardInterrupt:
    # Clean up GPIO settings on program exit
    GPIO.cleanup()

# ================== CONNECTION GUIDE ==================
# LED Connection
# GPIO 12 (Pin 32) -> 220Ω Resistor -> LED Anode (long leg)
# LED Cathode (short leg) -> GND (Pin 6)

# Light Sensor Module Connection
# VCC -> 3.3V (Pin 1)
# GND -> GND (Pin 9)
# OUT -> GPIO 15 (Pin 10)