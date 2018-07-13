---
layout: post
published: true
title: "HiDPI on Gnome destop"
author: GF
excerpt: "High resolution (HiDPI) screens are common in 2018 but unlike OS X and Windows, Linux Gnome destop lacks support for interface (GUI) and text fractional scaling. With the Gnome default of 200% scaling, interface elements are too big. Without it, elements are too small. What we need is fractional scaling : 125%, 150% or 175%. Here’s how to enable fractional scaling on Gnome 3, with Xorg and Wayland, on Ubuntu 18.04 Bionic Beaver or other modern distros."
date: '2018-07-14 00:45:00'
categories:
- Informatique
tags:
- Linux
permalink:  /2018/07/14/hidpi-on-gnome-desktop/
---

# With XOrg (Ubuntu 18.04 default)

The historical X server doesn’t support fractional scaling. However, there’s a tweak described in the [ArchLinux wiki](https://wiki.archlinux.org/index.php/HiDPI#Fractional_Scaling).

## Get the right ratio

First, open a *Terminal* window and test your configuration. Use the *xrandr* command.

```
mw4rf@X1:~$ xrandr
Screen 0: minimum 320 x 200, current 3200 x 1800, maximum 8192 x 8192
eDP-1 connected primary (…)
```

*eDP-1* is the name of my screen, yours may have a different name. To test a new configuration, use *xrandr* with the _scale_ argument :

    xrandr --output eDP-1 --scale 1.25x1.25
    
Increasing the scale make the interface elements _smaller_ : 1.75x1.75 is _smaller_ than 1.25x1.25. Feel free to try a few different settings.

## (Optional) The mouse is stuck ! I can’t reach the right part of the screen !

This is a common issue with the xrandr tweak. Run *xrandr* command again to get your *current* resolution (3200x1800 in the example above).

Then, run *xrandr* one more time with _panning_ option.

    xrandr --output eDP-1 --scale 1.25x1.25  --panning 3200x1800
    
## Make it permanent

First, create a new file *~/.config/autostart/hidpi.sh* :

```
#!/usr/bin/env bash
xrandr --output eDP-1 --scale 1.25x1.25  --panning 3200x1800
```

Create a second file, *~/.config/autostart/hidpi.desktop* :

```
[Desktop Entry]
Name=HiDPI-Configuration
GenericName=HiDPI-Configuration
Comment=Configure HiDPI Fractional Scaling
Exec=~/.config/autostart/hidpi.sh
Terminal=false
Type=Application
X-GNOME-Autostart-enabled=true
```

Save both files, *log out* and log back in. 

# With Wayland

Wayland is a new server that can be used instead or XOrg. Wayland supports fractional scaling but the feature is still experimental and disabled by default. To enable it, open a *Terminal* and run :

    gsettings set org.gnome.mutter experimental-features "['scale-monitor-framebuffer']"
    
Then, open the *system settings* under *devices* and *displays*, and choose the scale you want. You may have to reboot your computer before being able to pick a franctional scale.
    

