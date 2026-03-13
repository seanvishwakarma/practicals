# ============================================================
# PRACTICAL 5 — LDR Light Sensor
# Aim: Use different types of sensors (LDR) with
#      Raspberry Pi
# ============================================================
# WIRING:
#   LDR Module VCC       →  3.3V (Pin 1)
#   LDR Module GND       →  GND (Pin 6)
#   LDR Module OUT (DO)  →  GPIO15 (Pin 10)
#   GPIO12 (Pin 32)      →  220 Ohm resistor  →  LED long leg (+)
#   LED short leg (-)    →  GND (Pin 6)
# ============================================================
# HOW TO RUN:
#   1. Connect hardware as above
#   2. Open this file in Thonny
#   3. Press the green Play button (F5)
#   4. Shell prints every 1 second
#   5. Cover sensor with hand → LED ON
#   6. Uncover sensor → LED OFF
#   7. Press red Stop button when done
# ============================================================

import RPi.GPIO as GPIO
import time

GPIO.setmode(GPIO.BCM)

LIGHT_SENSOR_PIN = 15   # LDR DO pin → GPIO15 (Pin 10)
LED_PIN = 12             # LED → GPIO12 (Pin 32)

GPIO.setup(LIGHT_SENSOR_PIN, GPIO.IN, pull_up_down=GPIO.PUD_UP)
GPIO.setup(LED_PIN, GPIO.OUT)

try:
    while True:
        light_state = GPIO.input(LIGHT_SENSOR_PIN)

        if light_state == GPIO.LOW:   # LOW = light detected
            GPIO.output(LED_PIN, GPIO.LOW)
            print("Light is present, turn off the LED")
        else:                          # HIGH = dark / no light
            GPIO.output(LED_PIN, GPIO.HIGH)
            print("Light is not present, turn on the LED")

        time.sleep(1)                 # Check every 1 second

except KeyboardInterrupt:
    GPIO.cleanup()

# Expected Output:
# Light is present, turn off the LED
# Light is present, turn off the LED
# Light is not present, turn on the LED   <- covered sensor
# Light is present, turn off the LED      <- uncovered sensor
