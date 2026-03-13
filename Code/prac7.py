from luma.led_matrix.device import max7219
from luma.core.interface.serial import spi, noop
from luma.core.render import canvas
from luma.core.legacy import show_message
from luma.core.legacy.font import proportional, LCD_FONT
import time

# Hardware Setup
serial = spi(port=0, device=0, gpio_soi=noop())  # FIX: gpio_soi=noop() suppresses warning about unused GPIO on some luma versions
# Note: For a 4-in-1 module, increase 'cascaded' to 4 and adjust 'block_orientation'
device = max7219(serial, cascaded=1)

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
    """Draws the 8x8 matrix sprite onto the device buffer."""
    with canvas(device) as draw:
        for y, row in enumerate(matrix):
            for x in range(8):
                if (row >> (7 - x)) & 1:  # FIX: changed (row >> (7-x)) to correctly extract each bit from MSB to LSB
                    draw.point((x, y), fill="white")

print("Program starting...")

# --- Main Program Loop ---
while True:
    # 1. Display the Heart
    print("Displaying Heart...")
    draw_sprite(device, HEART)
    time.sleep(2)  # Keep the heart on screen for 2 seconds

    # 2. Display the Scrolling Text
    print("Scrolling Text...")
    # 'show_message' handles the animation and takes control of the device
    show_message(
        device,
        "HELLO",
        fill="white",
        font=proportional(LCD_FONT),
        scroll_delay=0.1
    )
    # The screen will be clear after show_message finishes

    # Optional pause before repeating the sequence
    time.sleep(1)

# Commands
# MAX7219 uses SPI Communication, which is disabled by default
# 1. Run "sudo raspi-config" in the terminal
# 2. Navigate to Interface Options > SPI and select Yes
# 3. Reboot your pi with "sudo reboot"

# sudo apt-get update
# sudo apt-get install -y python3-pip python3-dev libfreetype6-dev libjpeg-dev build-essential
# sudo -H pip3 install --upgrade luma.led_matrix

# ================== CONNECTION GUIDE ==================
# Connect the MAX7219 module to the Raspberry Pi 3B's GPIO pins as follows:
# VCC -> Pin 2 or 4 (5V)
# GND -> Pin 6 (Ground)
# DIN -> Pin 19 (GPIO 10 / MOSI)
# CS  -> Pin 24 (GPIO 8 / CE0)
# CLK -> Pin 23 (GPIO 11 / SCLK)