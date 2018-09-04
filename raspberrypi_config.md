# Raspberry PI (NOOBS) configuration

## Display
Sharp LS059T1SX01 1080x1920 with an HDMI to MIPI board ([aliexpress](https://www.aliexpress.com/item/5-9-1080P-LS059T1SX01-1080-1920-LCD-screen-display-with-HDMI-MIPI-driver-board-with-MIPI/32812546407.html)).

This display is unforgiving and requires specific HDMI settings or it will display black.
These timings were calculated from the display's edid data (`tvservice --dumpedid edid.dat && edidparser edid.dat`). Edit `/boot/config.txt` and add:
```
disable_overscan=1

# Use custom DMT mode
hdmi_group=2
hdmi_mode=87

max_framebuffer_width=1080
max_framebuffer_height=1920
hdmi_timings=1080 0 60 10 50 1920 0 4 2 4 0 0 0 60 0 114352500 3
```

## Starting the dashboard
On startup, launch chromium in fullscreen mode (press alt+f4 to exit). Edit `/home/pi/.config/lxsession/LXDE-pi/autostart` and add:
```
@/usr/bin/chromium-browser --kiosk --incognito https://pr.gg/dashboard
```

To disable screen blanking, edit `/home/pi/.config/lxsession/LXDE-pi/autostart` and add:
```
@xset s noblank
@xset s off
@xset s -dpms
```

To hide the cursor, run `sudo apt-get install unclutter` and then edit `/home/pi/.config/lxsession/LXDE-pi/autostart` and add:
```
@unclutter -idle 0.1 -root
```

To restart once every night, edit `/etc/crontab` and add:
```
0 0 * * * root reboot
```

