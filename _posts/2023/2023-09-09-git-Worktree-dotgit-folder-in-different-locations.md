---
layout: post
published: true
title: "Git: Worktree & .git folder in different locations"
author: GF
excerpt: "Store your files in a cloud-synced folder, and the .git folder in a safe location."
date: '2023-09-09 17:35:00'
categories:
- Informatique
tags:
- linux
- dev
- cloud
permalink:  /2023/09/09/git-worktree-and-dotgit-folder-in-different-locations/
---

# Worktree & dotgit folder in different locations

You don't want to put a git repository in a Dropbox/iCloud/GoogleDrive/OneDrive/(WhatEverDrive) synced folder. Git has locked filed, they can't de synchronized properly and this seriously messes up the repository. Data gets corrupted and, in the end, lost.

But I need it. I want my [Obsidian.md](https://www.obsidian.md) notes on iCloud or Dropbox, because I use Obsidian Mobile. At the same time, I want my vault to be on a private GitHub repo.

Here's the solution.

First, leave your vault in its synced folder, e.g. `~/Dropbox/obsidian/myvault`.

Then, setup a git repository in a safe location outside of the scope of the sync services, e.g. `~/git/obsidian`.

Edit the git configuration file at `~/git/obsidian/.git/config` adding a single line with the `worktree` keyword and the path to the vault :

```.git/config
[core]
  worktree = $HOME/Dropbox/obsidian/myvault
  ...
```
