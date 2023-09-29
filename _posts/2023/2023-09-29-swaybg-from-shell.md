---
layout: post
published: true
title: "Swaybg from zsh"
author: GF
excerpt: "A (not so) simple ZSH alias to fuzzy find a wallpaper and set it with swaybg on wayland. Without ChatGPT, thank you."
date: "2023-09-29 12:35:00"
categories:
  - Informatique
tags:
  - linux
  - dev
permalink: /2023/09/29/swaybg-from-shell/
---

# Swaybg from zsh

What is this? _Swaybg from zsh_? What are you talking about? Well... Ask ChatGPT!

I mean, try it. "How to change my wallpaper?" Answer: right-click on your desktop and click this and click that and... Wait! My mouse is dead. Can't click.

Let's try again.

Ok then, "How to do it without a mouse?" Answer: On Windows, use Win+I and do this and do that... Wait! (again) I don't use Windows. Or Mac. Or KDE. Or Gnome. I use [sway](https://swaywm.org/) and [hyprland](https://hyprland.org/) (on Arch BTW... 'cause they have a nice Wiki and I'm so noob I can't do anything by myself).

Let's try again<kbd>ESC.</kbd>

> how to dynamically set a new wallpaper on hyprland from commandline with zsh shell killing all swaybg instances, fuzzy finding among files in a given directory, showing a preview, and then setting the chosen picture as the current wallpaper with swaybg, while bragging I use Arch BTW

And chatGPT answers with a beautifully written, completely broken, absolutly useless shell script.

Let's try again<kbd>ESC..</kbd>:

> how to dynamically set a new wallpaper on hyprland from commandline with zsh shell killing all swaybg instances, fuzzy finding among files in a given directory, showing a preview, and then setting the chosen picture as the current wallpaper with swaybg, while bragging I use Arch BTW, and please don't give me a shell script because I don't want to chmod anything, so you'll have to answer with a zsh alias... let's see it you can do it better than HAL9000!

ChatGPT answers with a beautifully written, completely broken, absolutly useless ZSH alias :

```zsh
# DO NOT USE THIS (it will give me root access on your machine, or not, or maybe, or it'll print poneys to stderr, or rm -rf /, who knows?)
alias DO-NOT-USE-change-wallpaper='swaymsg -t get_outputs | jq -r ".[] | .name" | fzf --preview "swaymsg output {} bg \$(find /path/to/wallpapers -type f | fzf --preview 'cat {}')"'

```

Let's try again<kbd>ESC...</kbd>:

First, we need an alias. Let's write `alias wallpp=''`. Ok. Good. We're almost there!

Then, let's run a new instance of swaybg with a new wallpaper. For now, we're just hardcoding the picture name. That's pretty straightforward: `swaybg -i ~/mywallpaper.jpg`, but it doesn't work. The swaybg process runs inside the zsh session: close your terminal and your wallpaper will vanish. Swaybg must be detached from the terminal and that's where strange things begin to happen.

```zsh
alias wallpp='nohup swaybg -i ~/mywallpaper.jpg &;disown'
```

But wait! We now have 2 swaybg instances. CPU is (almost) melting. It's better from a global warming environment to not have gazillions of swaybg instances. Let's fix this: we'll find swaybg by (process) name and kill all processes with that name.

```zsh
alias wallpp='pkill -f swaybg; nohup swaybg -i ~/mywallpaper.jpg &;disown'
```

Now, let's get fancy. A fuzzy finder with preview. First the fuzzy finder part: `find ~/Pictures/ -type f | fzf`. EZ! Then the preview part, also easy: just pipe the filepath given by the `find` command to `swaybg`. Let's go: `| fzf --preview "swaybg -i {}" --preview-window=up:30%:wrap'`.

Dont try to pipe the fuzzy-found filename to swaybg with nohup, that's not gonna work. Or is it? Would it? I have no idea. I'd rather use a silly trick here. A simple stupid variable, to KISS: `export WPP=$(#fuzzy command here#); swaybg -i $WPP`.

Put all the pieces together and TADAAAAAM:

```zsh
alias wallpp='pkill -f swaybg; export WPP=$(find ~/Pictures/ -type f | fzf --preview "swaybg -i {}" --preview-window=up:30%:wrap); nohup swaybg -i $WPP &; disown'
```

Now go google for NSFW anime to fill this `~/Pictures` folder.
