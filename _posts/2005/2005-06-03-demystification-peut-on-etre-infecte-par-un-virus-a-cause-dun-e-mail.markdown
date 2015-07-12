---
layout: post
status: publish
published: true
title: 'Démystification: peut-on être infecté par un virus à cause d''un e-mail ?'
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
wordpress_id: 30
wordpress_url: http://localhost/~guillaume/gfblog/wordpress/?p=30
date: '2005-06-03 22:44:56 +0200'
date_gmt: '2005-06-03 20:44:56 +0200'
categories:
- Internet
tags:
- apple
- internet
- sécurité
- linux
- web
- windows
- virus
permalink:  /2005/06/03/demystification-peut-on-etre-infecte-par-un-virus-a-cause-dun-e-mail/
---
<p>On ne peut pas, dans la majorité des cas, être infecté par un virus à cause d'un e-mail, et cela du fait même de la structure des logiciels de gestion d'e-mails. Sous certaines conditions, très restrictives, un e-mails peut toutefois être la source d'une infection virale du système. Cet article propose de voir dans quels cas un e-mails peut être dangereux, et dans quels cas il ne peut pas l'être.</p>
<h2>Comment fonctionnent les virus ?</h2>
<p>La premi&egrave;re chose &agrave; pr&eacute;ciser, c'est la fa&ccedil;on dont fonctionnent les virus qui se transmettent par e-mail. Bien entendu, de nouvelles menaces apparaissent tous les jours et leurs auteurs ne cessent d'inventer de nouveaux moyens de détourner les systèmes de protection (antivirus, filtrage, etc.). Il est donc difficile de faire des généralités et d'affirmer en bloc que <i>tous</i> les logiciels malicieux fonctionnent de telle ou telle manière. On peut cependant classer la plupart des logiciels malicieux en deux cat&eacute;gories: les ex&eacute;cutables et les scripts. (Pour en savoir plus sur les divers types de menaces, v. l'article <a href="http://www.valhalla.fr/2010/03/04/informatique-personnelle-et-securite/#2">Informatique personnelle et sécurité</a>)</p>
<p>Les ex&eacute;cutables sont des fichiers compil&eacute;s, c'est-&agrave;-dire transform&eacute;s en s&eacute;rie de 0 et de 1, qui seront directement interpr&eacute;t&eacute;s par le microprocesseur de votre ordinateur par le biais de votre syst&egrave;me d'exploitation (Windows ou autre). Sous Windows, les ex&eacute;cutables sont tr&egrave;s facilement identifiables, ils se terminent par &quot;.exe&quot;. Attention cependant: tous les ex&eacute;cutables ne sont pas des virus, les ex&eacute;cutables sont des logiciels, et parmi eux il y a des virus. La r&egrave;gle g&eacute;n&eacute;rale est qu'un ex&eacute;cutable ne s'ex&eacute;cute pas tout seul: vous devez l'ex&eacute;cuter vous m&ecirc;me, ou le syst&egrave;me doit l'ex&eacute;cuter &agrave; votre place. Autrement dit, si vous &ecirc;tes infect&eacute; par un virus contenu dans un ex&eacute;cutable, c'est soit parce que vous l'avez activé en double-cliquant dessus, soit que vous en avez autoris&eacute; l'ex&eacute;cution.</p>
<p>Les ex&eacute;cutables d&eacute;pendent directement de votre microprocesseur et de votre syst&egrave;me d'exploitation. Un ex&eacute;cutable Windows ne fonctionne pas sur Linux, ni sur Mac, et vice-versa (attention cependant, ce n'est pas forc&eacute;ment vrai: c'est par exemple faut d'une distribution Linux &agrave; une autre, parce que le syst&egrave;me est fondamentalement le m&ecirc;me). Si vous &ecirc;tes sur Mac, Linux, BSD, Solaris, BeOS, etc... vous ne courrez aucun risque, vous ne pourrez pas ex&eacute;cuter les ex&eacute;cutables Windows, vous ne serez jamais infect&eacute; par un virus Windows. Cependant, vous pourrez contaminer des ordinateurs sous Windows. De toute mani&egrave;re, il n'y a pas de virus sur les syst&egrave;mes pr&eacute;cit&eacute;s, en raison de leur très faible part de marché.</p>
<p>Les scripts sont bien plus vicieux que les ex&eacute;cutables, mais ils sont en r&egrave;gle g&eacute;n&eacute;rale beaucoup moins nocifs (je peux faire un ex&eacute;cutable qui fera fondre votre carte m&egrave;re... avec un script seul ce n'est normalement pas possible). Les scripts sont un code source non compil&eacute; qui est compil&eacute; et ex&eacute;cut&eacute; &agrave; la vol&eacute;e sur votre ordinateur. Les scripts sont habituellement contenus dans un contenant basique d'internet, par exemple une page HTML. </p>
<p>Les scripts peuvent &eacute;galement prendre d'autres formes. Ils peuvent par exemple prendre la forme de macros VBS int&eacute;gr&eacute;es dans un fichier Word ou Excel. Ceux l&agrave; sont particuli&egrave;rement vicieux car on ne soup&ccedil;onne pas qu'un fichier Word puisse contenir des virus... merci Microsoft pour le cadeau ;-) </p>
<h2>Les formats d'e-mails</h2>
<p>Il existe basiquement 2 formats d'e-mails (en fait, il y en a d'autres, mais ils sont marginaux et ne nous int&eacute;ressent pas ici). Le premier est le texte plein (plain text), le second est le HTML. Les messages en texte plein ne peuvent vehiculer que du texte brut, sans mise en forme. Les messages en HTML peuvent v&eacute;hiculer du contenu multim&eacute;dia, et notamment des scripts.</p>
<p>Les messages en texte plein ne sont donc pas dangereux: si un virus est associ&eacute; au message, il sera obligatoirement en pi&egrave;ce attach&eacute;e. Il suffira alors de supprimer cette pi&egrave;ce attach&eacute;e. A l'inverse, les messages en HTML sont dangereux car ils peuvent contenir des scripts enbarqu&eacute;s (&quot;embedded&quot;), c'est &agrave; dire contenus directement dans la source du message et non pas en pi&egrave;ce jointe. Ces scripts sont alors invisibles pour l'utilisateur lambda, et s'ex&eacute;cutent d&egrave;s l'affichage du message (pas besoin de double-cliquer sur un fichier...). Les &quot;virus&quot; qui se transmettent par e-mail sont en fait des &quot;virus de script&quot;. </p>
<h2>Ce que font ces virus</h2>
<p>Les virus c'est de la technologie: &ccedil;a &eacute;volue &agrave; vitesse grand V. Je ne peux pas vous dire ce que font tous ces virus, car chaque jour na&icirc;t un nouveau virus un peu plus vicieux que les pr&eacute;c&eacute;dents.</p>
<p>Cependant, on peut d&eacute;tacher quelques grandes classes de comportements parmi les virus de script: <br />
  - S'autoex&eacute;cuter sur le syst&egrave;me du destinataire.<br />
  - S'implanter sur l'ordinateur du destinataire de mani&egrave;re &agrave; s'auto-ins&eacute;rer dans tous les e-mails qu'il envoie pour infecter sa liste de contacts.<br />
  - S'implanter sur l'ordinateur du destinataire dans le but de r&eacute;aliser une op&eacute;ration pr&eacute;cise.<br />
  - Tout cela &agrave; la fois. <br />
  - Plein d'autres choses tr&egrave;s r&eacute;jouissantes.</p>
<h2>Le support des virus de script</h2>
<p>On r&eacute;sume pour que &ccedil;a soit bien compris. Certains messages sont &eacute;crits en HTML, ces messages sont susceptibles de contenir des scripts nocifs. Ces scripts nocifs s'ex&eacute;cutent sur l'ordinateur du destinataire du message infect&eacute; lorsque le message est ouvert.</p>
<p>Il existe actuellement 2 grandes mani&egrave;res de g&eacute;rer ses e-mails: un client et un webmail. Un client e-mail est un logiciel d&eacute;di&eacute; &agrave; travailler avec des e-mails: Outlook, Eudora, Thunderbird, etc. Un webmail est un logiciel e-mail qui ne s'ex&eacute;cute pas sur l'ordinateur du client (du destinataire), mais sur celui du serveur (ex: Gmail, Hotmail, Caramail, Yahoo!Mail, etc.). Vous acc&eacute;der &agrave; un webmail par l'interm&eacute;diaire d'un navigateur: Internet Explorer, Firefox, Mozilla, Netscape, etc. </p>
<p>Quelle est la diff&eacute;rence, concr&egrave;tement ?<br />
  Le client e-mail (i.e. Outlook) t&eacute;l&eacute;charge les messages sur votre disque dur (par le biais du protocole POP3 ou IMAP) et les sauvegarde pour qu'ils puissent &ecirc;tre consult&eacute;s hors-ligne. Le message entier est donc rapatri&eacute;: texte brut, pi&egrave;ces attach&eacute;es, HTML, scripts et autres r&eacute;jouissances. Il s'affiche sur votre ordinateur ; et s'il contient un script, ce script sera ex&eacute;cut&eacute; sur votre ordinateur. <br />
  Le webmail ne fait qu'afficher le texte brut, voire la pr&eacute;sentation HTML, &agrave; l'&eacute;cran. Rien n'est t&eacute;l&eacute;charg&eacute; sur votre disque dur &agrave; moins que vous le demandiez explicitement (en cliquant sur le bouton &quot;T&eacute;l&eacute;charger la pi&egrave;ce-jointe&quot; par exemple). Les scripts ne peuvent pas s'ex&eacute;cuter sur votre ordinateur. (A nuancer quand m&ecirc;me: Internet Explorer est tellement plein de failles de s&eacute;curit&eacute;, et tous les webmails ne sont pas parfaits, qu'il serait possible de countourner ce principe g&eacute;n&eacute;ral. Il y a une chance sur 1000 &agrave; l'heure actuelle, et encore...). A noter aussi que les webmails int&egrave;grent un antivirus c&ocirc;t&eacute; serveur qui scanne les pi&egrave;ces jointes re&ccedil;ues et vous avertit s'il trouve un virus.</p>
<p>Autrement dit, si vous utilisez un webmail, vous ne pouvez pas &ecirc;tre victime d'un script v&eacute;rol&eacute;. Vous pouvez attraper un virus si vous t&eacute;l&eacute;chargez et ex&eacute;cutez en local sur votre syst&egrave;me un ex&eacute;cutable ou un script contenant un virus, mais &ccedil;a sera tout &agrave; fait intentionnel.</p>
<p>Si vous utilisez un client e-mail du type Outlook, vous courrez d'&eacute;normes risques. Changez imm&eacute;diatement de client e-mail (Thunderbird est d&eacute;j&agrave; plus s&eacute;curis&eacute;), de syst&egrave;me d'exploitation (Linux est gratuit...), ou utilisez un webmail... ou un bon antivirus !</p>
<h2>R&eacute;capitulatif</h2>
<div align="center">
<table width="70%"  border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#000000">
<tr>
<td colspan="2" bgcolor="#CCCCCC">
<div align="center"></div>
<div align="center">R&eacute;sum&eacute; des risques encourus selon le type d'utilisation de l'e-mail. </div>
</td>
<td width="20%" bordercolor="#000000" bgcolor="#CCCCCC">
<div align="center">WEBMAIL<br />
          (ex: hotmail) </div>
</td>
<td width="28%" bordercolor="#000000" bgcolor="#CCCCCC">
<div align="center">Client e-mail <br />
          (ex: Outlook) </div>
</td>
</tr>
<tr bordercolor="#000000">
<td width="25%" rowspan="2" bgcolor="#CCCCCC">
<div align="center">Message texte plein </div>
</td>
<td width="27%" bgcolor="#CCCCCC">
<div align="center">Pi&egrave;ce-jointe</div>
</td>
<td bgcolor="#00FF00">
<div align="center" >(1)</div>
</td>
<td bgcolor="#00FF00">
<div align="center" >(1)</div>
</td>
</tr>
<tr>
<td bordercolor="#000000" bgcolor="#CCCCCC">
<div align="center">Script</div>
</td>
<td bordercolor="#000000" bgcolor="#00FF00">
<div align="center" >(2)</div>
</td>
<td bordercolor="#000000" bgcolor="#00FF00">
<div align="center" >(2)</div>
</td>
</tr>
<tr bordercolor="#000000">
<td rowspan="2" bgcolor="#CCCCCC">
<div align="center">Message HTML </div>
</td>
<td bgcolor="#CCCCCC">
<div align="center">Pi&egrave;ce-jointe</div>
</td>
<td bgcolor="#00FF00">
<div align="center" >(1)</div>
</td>
<td bgcolor="#00FF00">
<div align="center" >(1)</div>
</td>
</tr>
<tr>
<td bordercolor="#000000" bgcolor="#CCCCCC">
<div align="center">Script</div>
</td>
<td bordercolor="#000000" bgcolor="#00FF00">
<div align="center" >(2)</div>
</td>
<td bordercolor="#000000" bgcolor="#FF0000">
<div align="center" >(DANGER)</div>
</td>
</tr>
</table>
<p align="justify">(1): Absolument aucun danger, il vous suffit de supprimer le fichier suspect en &eacute;vitant de (&eacute;ventuellement, le t&eacute;l&eacute;charger) le lancer en double-cliquant dessus.<br />
    (2): Absolument aucun danger, le script appara&icirc;tra comme une pi&egrave;ce jointe, il suffira de le supprimer. <br />
    (DANGER): il n'y a qu'une seule hypoth&egrave;se dans laquelle le danger est r&eacute;el. </p>
<h2 align="justify">Conseils pour &eacute;viter les virus</h2>
<p align="justify">Si vous avez compris ce qui est expliqu&eacute; ci-dessus, vous devinerez naturellement:<br />
    - Qu'il faut pr&eacute;f&eacute;rer les Webmails aux clients e-mail. Les clients e-mail sont des logiciels complexes qui ne sont plus destin&eacute;s au grand public. Si vous &ecirc;tes un utilisateur exp&eacute;riment&eacute; qui a besoin d'utiliser un client e-mail, vous saurez de toute fa&ccedil;on comment vous prot&eacute;ger des virus.<br />
    - Que les messages au format HTML sont une abomination. En plus de v&eacute;hiculer des virus, ils sont tr&egrave;s lourds (mon dieux, comme c'est horrible de re&ccedil;evoir un message avec plein d'images, de sons, de vid&eacute;os, de machins et de bidules de partout... le contenu doit primer sur le contenant, pas l'inverse !!!). Les HTML est &agrave; banir. Quand vous relevez votre bo&icirc;te aux lettres, la vraie pas la virtuelle, vous avez 1) des lettres toutes b&ecirc;tes dans des enveloppes blanches, 2) plein de brochures de pub plastifi&eacute;es et non biod&eacute;gradables, toutes color&eacute;es et moches. Dans les e-mails c'est pareil: 1) les messages en texte plein, 2) les messages HTML. Les premiers sont lus, les autres finissent syst&eacute;matiquement &agrave; la poubelle.<br />
    - Qu'il ne faut jamais ouvrir un fichier ex&eacute;cutable, sauf si l'on est certain de ce qu'il contient.</p>
<p align="justify">En respectant ces 3 r&egrave;gles, vous n'aurez normalement pas de probl&egrave;me. </p>
<p align="justify">Si n&eacute;anmoins vous &ecirc;tes parano, rajoutez ces conseils:<br />
    - Un antivirus &agrave; jour.<br />
    - R&eacute;flechissez 2 minutes avant de cliquer partout. Les novices 1) ne lisent pas ce qui est &agrave; l'&eacute;cran, 2) le r&eacute;fl&eacute;chissent pas &agrave; ce qui se passe, 3) cliquent partout. Ce genre d'attitude est la meilleure amie du virus. Apprenez et comprenez. Vous saurez ainsi qu'un fichier &quot;.jpg&quot; ne peut pas contenir de virus, mais qu'un &quot;.js&quot; sera dans 99,9% des cas un virus de script. <br />
    - Apprenez &agrave; d&eacute;tecter les messages vehiculant les virus. La plupart se propagent de liste de contacts en liste de contacts. Vous re&ccedil;evrez donc probablement les virus de quelqu'un que vous connaissez. Dans ce cas l'e-mail sera presque &agrave; tous les coups vide de texte, ou avec un texte minimal, sans contexte, et incompr&eacute;hensible. Si vous &ecirc;tes le destinataire premier du message, il prendra la plupart du temps la forme classique des SPAM (du genre &quot;click here for free porn sex&quot;, &quot;click here to buy viagra and save money&quot;). La plupart du temps ces messages sont en anglais. </p>
<p align="justify">Dernier conseil: arr&ecirc;tez la parano. Ce n'est pas compliqu&eacute; de se prot&eacute;ger des virus. Les virus Windows ont tant de succ&egrave;s car la plupart des utilisateurs ne savent pas comment se prot&eacute;ger, les auteurs des virus exploitent cela. La parano est la meilleure amie des virus.</p>
<p align="justify" style="margin-bottom: 0;">Que celui qui a &eacute;t&eacute; infect&eacute; en utilisant un webmail me jette la premi&egrave;re pierre.<br />
    Que celui qui a &eacute;t&eacute; infect&eacute; en utilisant un webmail et en triant sur le volet les pi&egrave;ces-jointes me jette le premier rocher.<br />
    Que celui qui a &eacute;t&eacute; infect&eacute; en utilisant un webmail et en ne t&eacute;l&eacute;chargeant jamais aucune pi&egrave;ce jointe me jette la premi&egrave;re com&egrave;te intersid&eacute;rale. </p>
</p></div>
<p>
&agrave; Paris le 3/06/2005<br />
<br />màj le 11/03/2010</p>
