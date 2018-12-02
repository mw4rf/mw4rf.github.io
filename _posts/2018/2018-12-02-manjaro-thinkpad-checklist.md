---
layout: post
published: true
title: "Manjaro Setup on Thinkpad"
author: GF
excerpt: "This is my custom checklist for a clean install and setup of Arch/Manjaro Gnome 3 desktop on Lenovo Thinkpad (X1 Carbon, X270, X280)."
date: '2018-12-02 12:05:00'
categories:
- Informatique
tags:
- Linux
- arch
- manjaro
permalink:  /2018/12/02/manjaro-thinkpad-checklist/
---


<!-- MarkdownTOC autolink="true" -->

- [Install](#install)
- [Configure Hardware](#configure-hardware)
    - [Screen](#screen)
    - [Touchpad](#touchpad)
    - [Battery](#battery)
- [Configure Desktop](#configure-desktop)
    - [Theme & Colors](#theme--colors)
    - [Hide top bar](#hide-top-bar)
    - [Install Apps](#install-apps)
        - [Git over SSH](#git-over-ssh)
        - [Add SSH key to remote servers](#add-ssh-key-to-remote-servers)
        - [Dropbox](#dropbox)
        - [Terminator](#terminator)
        - [LibreOffice](#libreoffice)
        - [Sublime Text & Merge](#sublime-text--merge)
        - [Dracula Color Theme](#dracula-color-theme)
        - [GPaste](#gpaste)

<!-- /MarkdownTOC -->


# Install

The Manjaro ISO is periodically re-generated but it's unlikely your system will be up to date after a fresh install. The last step of the install process is therefore to update the installed system.

```
sudo pacman -Syyu
```

The _build essentials_ might not be _all_ installed. This is pretty easy to fix:

```
sudo pacman -S base-devel
```

One of the strenghts of Arch and Manjaro is the AUR. _Yaourt_ is one of the best wrappers to install softwares from the AUR.

```
sudo pacman -S yaourt
```

# Configure Hardware

## Screen

The X1 Carbon Thinkpad has a HiDPI WQHD screen. Gnome default 100% pixel scaling makes the texts unreadable and the interface elements difficult to click on. However, with the default 200% scale used by Manjaro everything look big, _too_ big. I find a 150% _fractional_ scaling to be the best compromise. The setup is easy with _xrandr_, see [HiDPI on Gnome desktop](/2018/07/14/hidpi-on-gnome-desktop/).

## Touchpad

Enable _Natural Scrolling_ in Settings > Mouse & Touchpad.

## Battery

ThinkPad battery require `tp_smapi` and `acpi_call` kernel modules. 

First, check your kernel version:

```
$ uname -a
Linux X1 4.19.4-1-MANJARO #1 SMP PREEMPT Fri Nov 23 18:23:26 UTC 2018 x86_64 GNU/Linux
```

I'm using a 4.19 kernel. I have to install 'linux419-' modules. 

```
yaourt tp_smapi
yaourt acpi_call

sudo reboot
```

TLPui is a graphical tool to configure TLP (and avoid miconfiguration):

```
sudo pacman -S tlpui
```

# Configure Desktop

## Theme & Colors

Manjaro is green. I hate green. Let's replace that ugly green with a nice blue. And let's use a dark theme... _I see a green Manjaro and I want it painted black! No colors anymore, I want them to turn black!_

```
sudo pacman -S arc-solid-gtk-theme
```

Change it in _gnome_tweak_tools_ (Windows key + tweaks). Use the same app to change _Dash to Dock_ settings (e.g. window counter indicator color, opacity, intellihide, etc.).

Remove animations to speed up everything (Gnome Tweaks > General > Animations).

## Hide top bar

There's an app for that, called... [Hide Top Bar](https://extensions.gnome.org/extension/545/hide-top-bar/) (yes, really).

Use _gnome-tweak-tool_ to configure it:

- **Check** _Show panel when mouse approaches edge of the screen_
- **Uncheck** _Only hide when a window takes the space_

## Install Apps

Apps to install:
- Google Chrome: `yaourt -S google-chrome`
- Dropbox (see below): `yaout -S dropbox nautilus-dropbox`
- 1password: as a Firefox/Chrome extension (now working on Linux !)
- GitHub Desktop: `yaourt -S github-desktop`
- Sublime Text: `yaourt -S sublime-text-dev`
- Emacs: `sudo pacman -S emacs`
- LaTeX: `sudo pacman -S texlive-most`
- [Nerd Fonts](https://github.com/ryanoasis/nerd-fonts): `yaourt -S nerd-fonts-complete`
- Guake **or** Terminator (terminal): `sudo pacman -S guake terminator`
- VLC : `pacman -S vlc`
- GPaste (clipboard manager): `sudo pacman -S gpaste`

### Git over SSH

Generate a new SSH key

```
ssh-keygen
cat ~/.ssh/id_rsa.pub
```

Copy it and add it in GitHub, Bitbucket, Gitlab, etc.

Setup git identity:

```
git config --global user.name <username>
git config --global user.email <usermail>
git config --global core.editor gedit
```

Add some colors. Paste this in `~/.gitconfig` :

```
[color]
  diff = auto
  status = auto
  branch = auto
  interactive = auto
  ui = true
  pager = true
```

### Add SSH key to remote servers

If you want to SSH to remote servers, add your key with this command:

```
ssh-copy-id <server address>
```

### Dropbox

If you have a lot of files in your dropbox, the filesystem can't handle them all by default and the sync will halt. This issue can be fixed with the following commands :

```
su -c "echo 'fs.inotify.max_user_watches = 100000' >> /etc/sysctl.d/99-sysctl.conf"
sudo sysctl --system
```

### Terminator

To use Terminator as a dropdown (Guake-like):

- Setup a shortcut to show/hide the window (right click > Preferences > Keybindings > *full_screen*, set <kbd>F12</kbd>, restart the app (<kbd>Ctrl-Shift-Q</kbd>).
- Find the right size/position for your screen, e.g. `terminator --geometry 1549x400+51+0`
- Create a startup script in `~/.config/autostart/terminator.dekstop`:

```
[Desktop Entry]
Name=Terminator
GenericName=Terminator
Comment=Launch Terminator
Exec=$HOME/.config/autostart/terminator.sh
Terminal=false
Type=Application
X-GNOME-Autostart-enabled=true
```
- Create a startup script in `~/.config/autostart/terminator.sh`:

```
#! /bin/bash
sleep 5
terminator --geometry 1549x400+51+0
```

This is the only way to get the proper geometry: the _sleep 5_ prevents this script from being executed before the HiDPI script.

_Or just use Guake..._

### LibreOffice

![](/public/posts/2018-12-02-manjaro-thinkpad-checklist/libreoffice.png)

Tools > Options (or <kbd>Alt-F12</kbd>), and then:

- LibreOffice > View > Icon style > Sifr Dark
- Libreoffice > Application Colors...

```
Document background: #404552 or #383c4a
Text/Object/Table boundaries: #7c818c
Font color: #bfbfbf
Shadows: uncheck

```

- View > Toolbars > unckeck all
- Right-click on rigt sidebar and _undock_ it.

Some other options:

- Language settins > Languages > Locale setting: your language if not english (for spellchecking)
- LibreOffice > Use Data: your data
- LibreOffice Writer > Formatting Aids > Direct Cursor (free cursor, WordPerfect like)

### Sublime Text & Merge

Install -- [instructions here](https://www.sublimetext.com/docs/3/linux_repositories.html#pacman):

```
curl -O https://download.sublimetext.com/sublimehq-pub.gpg && sudo pacman-key --add sublimehq-pub.gpg && sudo pacman-key --lsign-key 8A8F901A && rm sublimehq-pub.gpg
echo -e "\n[sublime-text]\nServer = https://download.sublimetext.com/arch/stable/x86_64" | sudo tee -a /etc/pacman.conf
sudo pacman -Syu sublime-text
sudo pacman -Syu sublime-merge
```

- Enter Licence
- Tools > Install package control
- <kbd>Shift-Ctrl-P</kbd> > Package control: install package...

```
Git
GitGutter
Ayu
SidebarEnhancements
BracketHighlighter
ColorPicker
Color Highlighter
MarkdownEditing
MarkdownPreview
MarkdownTOC
```

- Set theme: <kbd>Shift-Ctrl-P</kbd> > Ayu

### Dracula Color Theme

[Dracula Color Theme](https://draculatheme.com/)

For **gedit**:

```
wget https://raw.githubusercontent.com/dracula/gedit/master/dracula.xml
mkdir -p $HOME/.local/share/gedit/styles/
mv dracula.xml $HOME/.local/share/gedit/styles/
```

For **Gnome terminal**:

First, create a new default profile in the Terminal (Edit > Preferences).

```
git clone https://github.com/GalaticStryder/gnome-terminal-colors-dracula
cd gnome-terminal-colors-dracula
./install.sh
```

### GPaste

Change the default keyboard shortcut from <kbd>Ctrl-Alt-G</kbd> to <kbd>Ctrl-Alt-V</kbd> in Gnome settings: Windows key > Settings > Devices > Keyboard.





