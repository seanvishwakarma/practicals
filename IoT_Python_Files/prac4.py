# ============================================================
# PRACTICAL 4 — Stepper Motor Control
# Aim: PWM to manage stepper motor speed using Raspberry Pi
# ============================================================
# WIRING:
#   GPIO23 (Pin 16)  →  ULN2003 IN1
#   GPIO24 (Pin 18)  →  ULN2003 IN2
#   GPIO25 (Pin 22)  →  ULN2003 IN3
#   GPIO22 (Pin 15)  →  ULN2003 IN4
#   5V supply        →  ULN2003 VCC  (MUST be 5V, not 3.3V)
#   GND              →  ULN2003 GND
# ============================================================
# HOW TO RUN:
#   1. Connect hardware as above
#   2. Open this file in Thonny
#   3. Press the green Play button (F5)
#   4. Motor rotates continuously
#   5. Press red Stop button when done
# ============================================================

import RPi.GPIO as GPIO
import time

GPIO.setwarnings(False)
GPIO.setmode(GPIO.BCM)

# Motor control pins
IN1 = 23
IN2 = 24
IN3 = 25
IN4 = 22

GPIO.setup(IN1, GPIO.OUT)
GPIO.setup(IN2, GPIO.OUT)
GPIO.setup(IN3, GPIO.OUT)
GPIO.setup(IN4, GPIO.OUT)

# Half-step sequence for 28BYJ-48 stepper motor
step_sequence = [
    [1, 0, 0, 0],
    [1, 1, 0, 0],
    [0, 1, 0, 0],
    [0, 1, 1, 0],
    [0, 0, 1, 0],
    [0, 0, 1, 1],
    [0, 0, 0, 1],
    [1, 0, 0, 1]
]

pins = [IN1, IN2, IN3, IN4]

try:
    print("Motor running... Press Stop to quit")
    while True:
        for step in step_sequence:
            for i in range(4):
                GPIO.output(pins[i], step[i])
            time.sleep(0.001)

except KeyboardInterrupt:
    print("Stopped")

finally:
    GPIO.cleanup()
    print("GPIO cleaned up")
