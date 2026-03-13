# ============================================================
# PRACTICAL 2 — LED Blink (Auto)
# Aim: Demonstrate Arduino Uno / Raspberry Pi and its
#      pin interfacing with IDE
# ============================================================
# WIRING:
#   GPIO4 (Pin 7)  →  LED long leg (+)
#   LED short leg  →  220 Ohm resistor  →  GND (Pin 6)
# ============================================================
# HOW TO RUN:
#   1. Connect hardware as above
#   2. Open this file in Thonny
#   3. Press the green Play button (F5)
#   4. LED blinks 10 times then stops automatically
# ============================================================

from gpiozero import LED
import time

led = LED(4)          # GPIO4 = Physical Pin 7

for _ in range(10):   # Blinks 10 times
    led.on()
    print("Led On")
    time.sleep(0.5)   # Wait 0.5 seconds
    led.off()
    print("Led Off")
    time.sleep(0.5)   # Wait 0.5 seconds

# Expected Output:
# Led On
# Led Off
# Led On
# Led Off
# ...(repeats 10 times then stops)
