---
layout: post
status: publish
published: true
title: 'Ubuntu 12.10 : Checklist d''installation'

  
  



excerpt: "Un peu plus de 2 mois après sa sortie, la dernière version d'Ubuntu (12.10
  Quantal Quetzal) devrait être suffisamment stable pour remplacer la LTS précédente
  (11.04 Precise Pangolin). Pas de mise à jour ou de migration pour moi, j'ai été
  marqué à vie par le passage à Windows Millenium et, depuis, je ne réalise plus que
  des <em>fresh install </em>avec formatage préalable<em>.</em> Problème: après l'installation,
  il faut réinstaller ses logiciels et, surtout, rétablir leur configuration, afin
  de retrouver notre environnement habituel. D'où cette check-list, pour mémoire,
  de l'installation d'Ubuntu 12.10 sur un laptop Lenovo X220 2012 (SSD).\r\n\r\n"
wordpress_id: 886
date: '2013-01-08 08:42:52 +0100'
date_gmt: '2013-01-08 06:42:52 +0100'
categories:
- Informatique
tags:
- Linux
permalink:  /2013/01/08/ubuntu-12-10-checklist-installation/
---
<p>Un peu plus de 2 mois après sa sortie, la dernière version d'Ubuntu (12.10 Quantal Quetzal) devrait être suffisamment stable pour remplacer la LTS précédente (11.04 Precise Pangolin). Pas de mise à jour ou de migration pour moi, j'ai été marqué à vie par le passage à Windows Millenium et, depuis, je ne réalise plus que des <em>fresh install </em>avec formatage préalable<em>.</em> Problème: après l'installation, il faut réinstaller ses logiciels et, surtout, rétablir leur configuration, afin de retrouver notre environnement habituel. D'où cette check-list, pour mémoire, de l'installation d'Ubuntu 12.10 sur un laptop Lenovo X220 2012 (SSD).</p>
<p><a id="more"></a><a id="more-886"></a></p>
<p><a href="http://pix.toile-libre.org/upload/original/1357627576.png"><img alt="" src="http://pix.toile-libre.org/upload/original/1357627576.png" width="394" height="222" /></a></p>
<h1>Installation</h1>
<p>Comme d'habitude, tout se passe bien avec la clé USB créée avec l'ISO téléchargée depuis les serveurs officiels. La procédure n'a pas changé : 1) suivre les indications sur la page de téléchargement pour créer la clé USB bootable ; 2) booter sur la clé USB ; 3) cliquer sur "Suivant" jusqu'à ce que tout soit fini.</p>
<p>Quelques notes, toutefois :</p>
<ul>
<li>L'option visant à conserver les documents personnels n'est pas viable car elle conserve aussi des paquets et des fichiers de configuration, ce qui débouche sur un système à la stabilité douteuse.</li>
<li>L'alignement pour les SSD est automatique.</li>
<li>Par défaut, <code>/</code> et <code>/home</code> ne sont plus séparés</li>
<li>Par défaut, une partition <code>swap</code> est créée, dont l'utilité est contestable vu la quantité de RAM installée sur les ordinateurs modernes (ici, SWAP = RAM = 6 GB)</li>
<li>Si la langue est l'anglais, le clavier chargé est qwerty. Or, Ubuntu demande la connexion à un réseau Wifi avant le changement de clavier. Il faut donc taper le mot de passe en qwerty.</li>
</ul>
<h1>Configuration Post-Installation</h1>
<h2>SSD</h2>
<p>Le système de fichiers par défaut est ext4. La fonction TRIM, nécessaire aux disques SSD, n'est pas activée par défaut.</p>
<p>Éditer <code>/etc/fstab</code> et rajouter <code>discard,noatime</code> à la ligne de chaque partition <em>ext4</em>.</p>
<p>Pour réduire les accès en lecture/écriture au disque, placer <code>/tmp</code> en <code>tmpfs</code>:</p>
<pre>tmpfs      /tmp            tmpfs        defaults,size=1g           0    0</pre>
<h2>UID 501</h2>
<p>Partager un volume entre plusieurs OS est une véritable galère. Mon disque externe doit être accessible en lecture et en écriture par Mac OS X, Linux et Windows. Comment faire ? Je passe ici la discussion sur le meilleur système de fichiers (non, ce n'est pas NTFS, car il ne reconnaît pas les bundles créés par OS X), pour indiquer le choix : HFS+ non journalisé. Il s'agit du format natif des Mac ; des drivers sont disponibles pour Windows (Apple Bootcamp en lecture et Paragon en lecture/écriture). Sous Linux, le paquet hfsplus permet de lire et d'écrire sur ces volumes (dès lors qu'ils ne sont pas journalisés). Cependant, outre le format, un autre élément peut empêcher l'écriture : les permissions UNIX. Il faut en effet que l'utilisateur Linux ait le même identifiant (UID) que l'utilisateur Mac, faute de quoi le droit d'écriture sur le volume lui sera refusé. Le problème ne se pose pas avec Windows, qui ignore les permissions UNIX. Sous Linux, à moins d'utiliser le volume en tant que root, ce qui n'est pas pratique (et peu sûr...), il faut utiliser le même UID que sur Mac. L'UID du premier utilisateur d'un Mac (le premier compte créé lors de l'installation) est 501. Les comptes Ubuntu débutent avec l'UID 1000. Il s'agit donc ici de modifier l'UID du premier compte créé sur la nouvelle installation d'Ubuntu, et de le fixer à 501.</p>
<p>1) Créer un utilisateur temporaire, soit en cherchant <strong>User Accounts</strong> dans Unity, soit avec la commande <code>sudo useradd -d /home/tempuser -m -s /bin/bash -G admin tempuser &amp;&amp; sudo passwd tempuser</code>. <strong>Désactiver la connexion automatique</strong>, le cas échéant.</p>
<p>2) Relancer la machine (une déconnexion de session ne suffit généralement pas, car certains services appartenant à l'utilisateur sont toujours actifs, ce qui interdit l'usage de la commande usermod), se connecter avec l'utilisateur temporaire, et exécuter les commandes suivantes :</p>
<pre>sudo usermod --uid 501 yourusername
sudo chown -R 501:yourusername /home/yourusername</pre>
<p>3) Éditer le fichier <strong>/etc/login.defs</strong> et chercher une ligne avec <code>UID_MIN=1000</code> ; remplacer par <code>UID_MIN=500</code></p>
<h2>Dropbox</h2>
<p>Lorsqu'on a beaucoup de dossiers et de fichiers dans sa Dropbox, la configuration par défaut ne permet pas au système de tous les prendre en compte. Conséquence : la daemon Dropbox ne peut plus "surveiller" tout le contenu du répertoire partagé afin de repérer les modifications.</p>
<p>Solution: éditer le fichier <strong>/etc/sysctl.conf</strong> en ajoutant la ligne:</p>
<pre>fs.inotify.max_user_watches=100000</pre>
<h2>Fingerprint</h2>
<p>Le Lenovo X220 est équipé d'un lecteur d'empreintes digitales. Pour le faire fonctionner sous Ubuntu :</p>
<pre>sudo add-apt-repository ppa:fingerprint/fingerprint-gui
sudo apt-get update
sudo apt-get install fingerprint-gui policykit-1-fingerprint-gui libbsapi</pre>
<p>À noter que, pour ce qui est de Quantal Quetzal, il ne sera pas possible d'installer Gnome-Shell et le lecteur d'empreintes en même temps. En effet, avec policykit-1-fingerprint-gui, Gnome Shell ne démarre pas. Pour faire démarrer Gnome Shell, il faut installer policykit-1-gnome, qui est en conflit avec policykit-1-fingerprint-gui.</p>
<h1>Logiciels essentiels</h1>
<h2>Mise à jour</h2>
<p><code>sudo apt-get update &amp;&amp; sudo apt-get upgrade</code></p>
<h2>Logiciels depuis les dépôts officiels</h2>
<p>Voici une bonne grosse commande qui installe : Restricted Extras (codecs propriétaires), d'autres codecs, VLC, des outils d'archivage (Zip, RAR, etc.), Gnome Tweak Tool, CCSM (configuration compiz), Synaptic, Gparted, Chromium (Firefox est tellement lent au démarrage...), et l'extension pour Nautilus 'open in terminal' :</p>
<pre>    sudo apt-get install ubuntu-restricted-extras gstreamer0.10-plugins-ugly gstreamer0.10-ffmpeg libxine1-ffmpeg gxine mencoder libdvdread4 totem-mozilla icedax tagtool easytag id3tool lame nautilus-script-audio-convert libmad0 mpg321 p7zip-rar p7zip-full unace unrar zip unzip sharutils rar uudeview mpack lha arj cabextract file-roller vlc gnome-tweak-tool compizconfig-settings-manager compiz-plugins-extra synaptic gparted chromium-browser nautilus-open-terminal</pre>
<h2>Logiciels depuis les PPA</h2>
<p>Encore une commande à rallonge qui installe Ubuntu Tweaks, RadioTray, Shutter, le Lens Unity calculatrice et Sublime Text 2 :</p>
<pre>sudo add-apt-repository ppa:tualatrix/ppa &amp;&amp; sudo add-apt-repository ppa:eugenesan/ppa &amp;&amp; sudo add-apt-repository ppa:shutter/ppa &amp;&amp; sudo add-apt-repository ppa:scopes-packagers/ppa &amp;&amp; sudo add-apt-repository ppa:webupd8team/sublime-text-2 &amp;&amp; sudo apt-get update &amp;&amp; sudo apt-get install ubuntu-tweak radiotray shutter unity-lens-utilities unity-scope-calculator sublime-text</pre>
<p>Après ces installation, il est préférable de désactiver ces PPA (en ouvrant Software Sources depuis Unity et en décochant les cases correspondantes dans l'onglet Sources), afin d'éviter que soient installés des paquets non désirés lors des mises à jour du système.</p>
<h2>Logiciels à télécharger</h2>
<p>Dropbox et Google Chrome.</p>
<h1>Vie privée</h1>
<p>Pour ceux qui seraient soucieux de préserver leur vie privée, voici quelques réglages à effectuer.</p>
<h3>Unity-Amazon</h3>
<div>
<p>Dans les préférences système, la section <strong>Privacy</strong> permet de désactiver les résultats de recherche d'Amazon dans le Dash d'Unity.</p>
<p>Alternativement : <code>sudo apt-get remove unity-lens-shopping</code></p>
<h3>Crash reports</h3>
<div>
<p>Ubuntu aime bien <em>call home</em> pour envoyer des rapports d'erreur lors d'un plantage de logiciel, même si le logiciel ne provient pas des dépôts officiels. Il aime tellement cela qu'il le fait même sur une <em>fresh install</em>…</p>
<p>Pour désactiver cela:<br />
<code>sudo gedit /etc/default/apport</code><br />
Rechercher la ligne: <code>enabled=1</code>, à remplacer par <code>enabled=0</code><br />
Désactiver le service : <code>sudo service apport stop</code></p>
</div>
<h3>Startup items</h3>
<div>
<p>Tous les logiciels au démarrage ne sont pas affichés dans la fenêtre Gnome dédiée à cet effet (<strong>Startup Applications</strong>). Pour <em>tout</em> afficher :</p>
<pre>sudo sed -i 's/NoDisplay=true/NoDisplay=false/g' /etc/xdg/autostart/*.desktop</pre>
</div>
<h1>Configuration Unity/Gnome</h1>
<h2>Bureaux virtuels</h2>
<p>Dans <strong>CCSM</strong> :</p>
<ul>
<li><strong>Expo</strong> : réduire <em>Zoom time</em></li>
</ul>
</div>
<ul>
<li><strong>Desktop Wall</strong> : désactiver <em>live preview</em>, réduire <em>wall sliding duration</em></li>
</ul>
<h3 id="raccourcis_clavier">Raccourcis clavier</h3>
<p>Ubuntu adopte la philosophie Apple, <em>faites comme j'ai prévu que vous fassiez et pas autrement</em>, mais la mise en oeuvre ne suit pas… ainsi, les raccourcis clavier définis dans les préférences système sont réinitialisés à chaque boot du système ! Certains raccourcis doivent être <em>hardcodés</em> ou que sais-je…</p>
<p>Ainsi, mes 4 bureaux virtuels ne sont plus assignés aux touches F1/F2/F3/F4 du clavier après un redémarrage. Pour contourner le problème, il faut créer un script <code>~/.fix_shortcuts</code> avec le contenu suivant (qui est à adapter en fonction de vos besoins, bien entendu) :</p>
<pre>#!/bin/bash
gsettings set org.gnome.desktop.wm.keybindings switch-to-workspace-1 "['F1']"
gsettings set org.gnome.desktop.wm.keybindings switch-to-workspace-2 "['F2']"
gsettings set org.gnome.desktop.wm.keybindings switch-to-workspace-3 "['F3']"
gsettings set org.gnome.desktop.wm.keybindings switch-to-workspace-4 "['F4']"</pre>
<p>Rendre le script exécutable : <code>chmod +x ~/.fix_shortcuts</code>, puis l'ajouter dans les <em>startup applications</em> (chercher <em>démarrage</em> dans le shell unity).</p>
<h3 id="skin">Skin !</h3>
<p>Sur le Screenshot ci-dessus : thème FlatStudio pour Gnome 3.6, icônes Malyx-Ex, police Roboto Light 11.</p>
<p>Thème GTK3 : <strong>FlatStudio</strong> – Icones : <strong>Malys-Ex</strong></p>
<pre>    sudo add-apt-repository ppa:noobslab/themes
    sudo add-apt-repository ppa:noobslab/icons
    sudo apt-get update
    sudo apt-get install flatstudio malyx-ex</pre>
<p>Alternativement : Icones <strong>Clarity</strong> : <a title="http://gnome-look.org/content/show.php?content=135654" href="http://gnome-look.org/content/show.php?content=135654" rel="nofollow">http://gnome-look.org/content/show.php?content=135654</a> (configuration : <code>gksu change-theme</code>)<br />
Alternativement : Icones <strong>Awoken</strong> : <a title="http://gnome-look.org/content/show.php?content=126344" href="http://gnome-look.org/content/show.php?content=126344" rel="nofollow">http://gnome-look.org/content/show.php?content=126344</a></p>
<p>Police <strong>Roboto</strong> : <a title="http://www.fontsquirrel.com/fonts/roboto" href="http://www.fontsquirrel.com/fonts/roboto" rel="nofollow">http://www.fontsquirrel.com/fonts/roboto</a></p>
<p><strong>Installation</strong> : copier les fichiers TTF → <code>sudo cp *.ttf /usr/share/fonts/truetype/</code></p>
<p>Polices Microsoft : <code>sudo apt-get install ttf-mscorefonts-installer</code></p>
<h1 id="troubleshooting">Troubleshooting</h1>
<h2 id="volumes_externes_illisibles">Volumes externes illisibles</h2>
<div>
<p>Avec un message d'erreur stupide, <code>The location is not a folder</code>, il est impossible d'afficher les volumes externes dans Nautilus.</p>
<p><strong>Solution</strong>: <code>chmod 755 /media/USERNAME</code></p>
</div>
<h2 id="volumes_externes_read-only">Volumes externes read-only</h2>
<div>
<p>Impossible d'écrire sur les volumes externes avec Nautilus, qui les considère <em>read-only</em>. Pourtant, des commandes comme <code>cp</code> fonctionnent.</p>
<p>V. <a title="https://bugs.launchpad.net/ubuntu/+source/nautilus/+bug/1021375" href="https://bugs.launchpad.net/ubuntu/+source/nautilus/+bug/1021375" rel="nofollow">https://bugs.launchpad.net/ubuntu/+source/nautilus/+bug/1021375</a></p>
<p><strong>Solution</strong>: c'est un bug de Nautilus 3.4. Canonical a snobé Nautilus 3.6, le considérant comme une régression, sans pour autant corriger de tels bugs critiques dans 3.4. Mieux vaut un logiciel moins complet (3.6) mais fonctionnel ! La solution est donc d'installer Nautilus 3.6 depuis le PPA Gnome-3.</p>
<pre>    sudo add-apt-repository ppa:gnome3-team/gnome3
    sudo apt-get update &amp;&amp; sudo apt-get install nautilus
    sudo add-apt-repository -r ppa:gnome3-team/gnome3
    killall nautilus</pre>
</div>
<h2 id="boot_en_low_graphics">Boot en low graphics</h2>
<div>
<p>Bug affectant les cartes Intel. Il provient de <em>lightdm</em>.</p>
<p>v. <a title="https://bugs.launchpad.net/ubuntu/+source/linux/+bug/1070150" href="https://bugs.launchpad.net/ubuntu/+source/linux/+bug/1070150" rel="nofollow">https://bugs.launchpad.net/ubuntu/+source/linux/+bug/1070150</a></p>
<ul>
<li>
<div><strong>Solution 1 (fix)</strong>: installer et utiliser <em>gdm</em> en lieu et place de <em>lightdm</em>.</div>
</li>
<li>
<div><strong>Solution 2 (workaround)</strong>: quand le bug se produit, <kbd>CTRL</kbd>+<kbd>ALT</kbd>+<kbd>F1</kbd> et <code>sudo service lightdm restart</code></div>
</li>
</ul>
</div>
<h2 id="lancement_des_logiciels_avec_privileges_impossible_depuis_unity">Lancement des logiciels avec privilèges impossible depuis Unity</h2>
<div>
<p>Les logiciels qui nécessitent des privilèges ne sont plus lancés depuis le <em>dash</em> Unity, mais on peut les lancer dans le terminal avec <code>gksudo</code>.</p>
<p><strong>Solution</strong>: reboot.</p>
</div>
<h2 id="bookmarks_nautilus_absents_des_dialogs_opensave">Bookmarks Nautilus absents des dialogs open/save</h2>
<div>
<p>Les signets de Nautilus (barre latérale) ne s'affichent pas dans les boîtes de dialogue ouvrir/enregistrer sous.</p>
<p><strong>Solution</strong>:</p>
<pre>    rm ~/.gtk-bookmarks
    ln -s ~/.config/gtk-3.0/bookmarks ~/.gtk-bookmarks</pre>
</div>
