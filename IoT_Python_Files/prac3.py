# ============================================================
# PRACTICAL 3 — LED + Button Control
# Aim: GPIO: Light the LED with Python with/without a
#      button using Raspberry Pi
# ============================================================
# WIRING:
#   GPIO23 (Pin 16)  →  One leg of button
#   GND (Pin 9)      →  Other leg of button
#   GPIO24 (Pin 18)  →  LED long leg (+)
#   LED short leg    →  220 Ohm resistor  →  GND (Pin 6)
# ============================================================
# HOW TO RUN:
#   1. Connect hardware as above
#   2. Open this file in Thonny
#   3. Press the green Play button (F5)
#   4. Press the physical button — LED turns ON
#   5. Release button — LED turns OFF
#   6. Press red Stop button when done
# ============================================================

import RPi.GPIO as GPIO
import time

GPIO.setwarnings(False)                             # Suppresses "GPIO already in use" warnings
GPIO.setmode(GPIO.BCM)                              # Use BCM GPIO numbering

GPIO.setup(23, GPIO.IN, pull_up_down=GPIO.PUD_UP)  # Button → GPIO23
GPIO.setup(24, GPIO.OUT)                            # LED → GPIO24

try:
    while True:
        button_state = GPIO.input(23)
        if button_state == False:   # False = LOW = button pressed
            GPIO.output(24, True)   # LED ON
            print("Button Pressed...")
            time.sleep(0.2)
        else:
            GPIO.output(24, False)  # LED OFF

except:                             # Catches Ctrl+C and any other exception
    GPIO.cleanup()                  # Safely resets all GPIO pins

# Expected Output:
# Button Pressed...
# Button Pressed...
# (prints every 0.2 seconds while button is held)
