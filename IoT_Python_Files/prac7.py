# ============================================================
# PRACTICAL 7 — 8x8 LED Matrix Display
# Aim: 8x8 LED Grid Control — Matrix LED Programming
#      using MAX7219
# ============================================================
# ONE-TIME SETUP BEFORE RUNNING (do in Terminal, not Thonny):
#   Step 1 — Enable SPI:
#     sudo raspi-config
#     Navigate: Interface Options → SPI → Yes → Finish
#     sudo reboot
#
#   Step 2 — Install luma library (after reboot):
#     sudo apt-get update
#     sudo apt-get install -y python3-pip python3-dev libfreetype6-dev libjpeg-dev build-essential
#     sudo -H pip3 install --upgrade luma.led_matrix
# ============================================================
# WIRING:
#   MAX7219 VCC  →  5V (Pin 2 or Pin 4)
#   MAX7219 GND  →  GND (Pin 6)
#   MAX7219 DIN  →  GPIO10 / MOSI (Pin 19)
#   MAX7219 CS   →  GPIO8 / CE0 (Pin 24)
#   MAX7219 CLK  →  GPIO11 / SCLK (Pin 23)
# ============================================================
# HOW TO RUN:
#   1. Complete one-time setup above first
#   2. Connect hardware as above
#   3. Open this file in Thonny
#   4. Press the green Play button (F5)
#   5. Matrix shows heart shape, then scrolls HELLO
#   6. Repeats forever — press red Stop when done
# ============================================================

from luma.led_matrix.device import max7219
from luma.core.interface.serial import spi, noop
from luma.core.render import canvas
from luma.core.legacy import show_message
from luma.core.legacy.font import proportional, LCD_FONT
import time

serial = spi(port=0, device=0, gpio=noop())
device = max7219(serial, cascaded=1)

# Heart shape pattern (8x8 binary grid)
HEART = [
    0b00000000,
    0b01100110,
    0b11111111,
    0b11111111,
    0b01111110,
    0b00111100,
    0b00011000,
    0b00000000
]

def draw_sprite(device, matrix):
    with canvas(device) as draw:
        for y, row in enumerate(matrix):
            for x in range(8):
                if (row >> (7 - x)) & 1:
                    draw.point((x, y), fill="white")

print("Program starting...")

while True:
    print("Displaying Heart...")
    draw_sprite(device, HEART)
    time.sleep(2)

    print("Scrolling Text...")
    show_message(
        device,
        "HELLO",
        fill="white",
        font=proportional(LCD_FONT),
        scroll_delay=0.1
    )
    time.sleep(1)

# Expected Output:
# Program starting...
# Displaying Heart...
# Scrolling Text...
# Displaying Heart...
# Scrolling Text...
# ...(repeats until Stop is pressed)
