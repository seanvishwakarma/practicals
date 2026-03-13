import RPi.GPIO as GPIO
import time

# Define GPIO pins
IN1 = 23
IN2 = 24
IN3 = 25
IN4 = 22

# Setup
GPIO.setmode(GPIO.BCM)
GPIO.setup(IN1, GPIO.OUT)
GPIO.setup(IN2, GPIO.OUT)
GPIO.setup(IN3, GPIO.OUT)
GPIO.setup(IN4, GPIO.OUT)

# Half-step sequence
seq = [
    [1, 0, 0, 0],
    [1, 1, 0, 0],
    [0, 1, 0, 0],
    [0, 1, 1, 0],
    [0, 0, 1, 0],
    [0, 0, 1, 1],
    [0, 0, 0, 1],
    [1, 0, 0, 1]
]

def rotate_motor(delay, steps):
    for _ in range(steps):
        for step in seq:
            GPIO.output(IN1, step[0])
            GPIO.output(IN2, step[1])
            GPIO.output(IN3, step[2])
            GPIO.output(IN4, step[3])
            time.sleep(delay)

try:
    print("Rotating motor clockwise...")
    rotate_motor(0.002, 512)  # One full rotation

    time.sleep(1)

    print("Rotating motor counterclockwise...")
    seq.reverse()  # Reverse direction by reversing the step sequence
    rotate_motor(0.002, 512)

except KeyboardInterrupt:
    print("\nExiting...")
finally:
    GPIO.cleanup()

# ================== CONNECTION GUIDE ==================
# DRIVER BOARD CONNECTIONS (ULN2003 → Raspberry Pi)

# IN1  -> GPIO23 (Physical Pin 16)
# IN2  -> GPIO24 (Physical Pin 18)
# IN3  -> GPIO25 (Physical Pin 22)
# IN4  -> GPIO22 (Physical Pin 15)

# POWER CONNECTIONS

# VCC  -> 5V (Physical Pin 2 or Pin 4 on Raspberry Pi)
# GND  -> GND (Physical Pin 6, 9, 14, etc.)

# MOTOR CONNECTION

# 28BYJ-48 Stepper Motor Cable
# Plug directly into the ULN2003 driver board socket