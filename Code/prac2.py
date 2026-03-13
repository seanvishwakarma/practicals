from gpiozero import LED
import time
led = LED(4) 
for _ in range(10):
    led.on()
    print("Led On")
    time.sleep(0.5)
    led.off()
    print("Led Off")
    time.sleep(0.5)

# CONNECTION GUIDE:
# LED long leg (Anode +)  ----> GPIO4 (Pin 7 on Raspberry Pi)
# LED short leg (Cathode -) ---> Resistor (220Ω or 330Ω)
# Other side of resistor -----> GND (Pin 6 on Raspberry Pi)