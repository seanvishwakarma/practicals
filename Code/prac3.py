import RPi.GPIO as GPIO
import time

GPIO.setwarnings(False)  # FIX: added to suppress GPIO already in use warnings
GPIO.setmode(GPIO.BCM)

GPIO.setup(23, GPIO.IN, pull_up_down=GPIO.PUD_UP)  # Button to GPIO23
GPIO.setup(24, GPIO.OUT)                            # LED to GPIO24

try:
    while True:
        button_state = GPIO.input(23)
        if button_state == False:  # FIX: button is active LOW (pull-up resistor), so False = pressed
            GPIO.output(24, True)
            print("Button Pressed...")
            time.sleep(0.2)
        else:
            GPIO.output(24, False)

except:  # FIX: catches KeyboardInterrupt (Ctrl+C) and any other exception cleanly
    GPIO.cleanup()

# ================== CONNECTION GUIDE ==================
# LED CONNECTION
# GPIO24 (Physical Pin 18) ----> LED long leg (Anode +)
# LED short leg (Cathode -) ---> 220Ω / 330Ω Resistor
# Other side of resistor -----> GND (Physical Pin 6)

# BUTTON CONNECTION
# GPIO23 (Physical Pin 16) ----> One leg of Push Button
# Other leg of Push Button ---> GND (Physical Pin 9)