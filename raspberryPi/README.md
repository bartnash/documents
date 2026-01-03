# Raspberry Pi

[Raspberry Pi](https://www.raspberrypi.com/) is a computer on a board for doing lots of cool stuff.  
Has grown beyond that to include microcontrollers, preipherals and
a community of projects.

[Documentation](https://www.raspberrypi.com/documentation/)


## Boards

### [Raspberry Pi 5 4GB](https://www.amazon.com/Raspberry-Pi-4GB-2023-Processor/dp/B0CK3L9WD3?ref_=ast_sto_dp)

## Projects

### [Pi-hole](https://docs.pi-hole.net/)
Pi-hole is a [DNS sinkhole](https://en.wikipedia.org/wiki/DNS_sinkhole) for blocking ads and 
other annoying stuff on the internet by blocking DNS queries for their IP address.
[Tutorial](https://www.raspberrypi.com/tutorials/running-pi-hole-on-a-raspberry-pi/)


## Getting Started

### Minimum to boot Pi 5

 - Power supply
 - File system/OS on Micro SD card or USB drive.
 - Optional, micro HDMI cable or adapter.
 - Optional, USB keyboard and mouse.

#### Raspberry Pi Imager
[github repo](https://github.com/raspberrypi/rpi-imager)
[Documentation](https://www.raspberrypi.com/documentation/computers/getting-started.html#raspberry-pi-imager)
Install Raspberry Pi Imager.   For Fedora 42, this can e installed with Software management UI, via Flathub.

#### Micro SD Card
Should be do-able with some sort of USB drive as well.
- Use adapter to mount card on PC.
- Use Imager to write OS to SD Card.
- For headless, enable ssh and configure password login.
    - This didn't seem to actually work for me.  The SD card can be accessed at /?/?
      Add an empty 'ssh' file in the root of bootfs.
      Add userconf.txt to root of bootfs, with single line: `user:passwd`.  Password needs to be encrypted with 'openssl passwd -6'

### Boot it
Insert the SD card and boot it up.
By default, will be visible on network at raspberrypi.local.

``ssh raspberrypi.local``

### Minimal Commands

`` sudo apt-get upgrade `` List available package updates.
`` sudo apt-get update `` Apply all available updates.
`` vcgencmd commands `` List commands available to send to 
`` sudo raspi-config ``  Curses tool for configuring all the stuff



