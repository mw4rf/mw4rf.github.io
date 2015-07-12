---
layout: post
status: publish
published: true
title: Don't forward !
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
excerpt: "Depuis l'ère glacière, qui débuta avec l'introduction du fameux symbole
  @ en 1972, il est possible de rediriger (\"forward\") un e-mail que l'on a reçu
  vers une tierce personne. Les premiers logiciels d'e-mail (\"clients SMTP/POP\"),
  tel qu'Eudora ou le vénérable PegasusMail, présentaient déjà le terrible bouton
  \"forward\". Un seul clic sur ce bouton, et l'e-mail reçu était redirigé vers les
  destinataires choisis. De là est née une des plus vicieuses techniques de spam qui
  tend à prendre une ampleur de plus en plus inquiétante...\r\n\r\n"
wordpress_id: 99
wordpress_url: http://www.valhalla-fr.eu/index.php/2006/04/21/dont-forward/
date: '2006-04-21 17:02:07 +0200'
date_gmt: '2006-04-21 15:02:07 +0200'
categories:
- Internet
- Actu & Humeur
tags:
- Internet
- Informatique
- sécurité
- Web
permalink:  /2006/04/21/dont-forward/
---
<p>Depuis l'ère glacière, qui débuta avec l'introduction du fameux symbole @ en 1972, il est possible de rediriger ("forward") un e-mail que l'on a reçu vers une tierce personne. Les premiers logiciels d'e-mail ("clients SMTP/POP"), tel qu'Eudora ou le vénérable PegasusMail, présentaient déjà le terrible bouton "forward". Un seul clic sur ce bouton, et l'e-mail reçu était redirigé vers les destinataires choisis. De là est née une des plus vicieuses techniques de spam qui tend à prendre une ampleur de plus en plus inquiétante...</p>
<p><a id="more"></a><a id="more-99"></a></p>
<p>Que se passe-t-il lorsque l'on clique sur ce traitre de bouton "forward" ? Et bien l'e-mail est redirigé vers les destinataires que l'on spécifie. Le message a été envoyé par A à B, puis redirigé par B vers C. Seulement, l'adresse de A reste visible dans la copie reçue par C. Remarquez, c'est logique, on dira bien dans la vie de tous les jours "tiens, regarde ce truc, c'est Machin qui me l'a envoyé". Néanmoins, ce principe devient vicieux lorsque le message est de nouveau redirigé par C vers D: les adresses de A et B apparaîtront dans la copie que reçoit D. Et ainsi de suite. Conclusion: si Z est une entreprise de spam, et bien les adresses de A, B, C, D... X et Y seront enregistrées (et validées !) pour être spammées à gogo.</p>
<p>Pis encore: le champ CC. Celui là est déjà terrible en soi, puisqu'il permet à chaque destinataire d'un e-mail de voir les adresses des autres destinataires. Mais avec l'effet cumulé du "forward", les résultats sont explosifs. En effet, si un message est envoyé à 100 personnes, et que l'une de ces personnes le redirige bêtement, les adresses des 100 autres seront connues du destinataire final. Imaginez maintenant que parmi les 100 destinataires, non pas 1, mais 50 d'entre eux décident de rediriger l'e-mail. Et qu'ils ne le redirigent pas chacun vers 1 personne, mais chacun vers 50 personnes...</p>
<p>Il suffit qu'à n'importe quel endroit de la chaîne des expéditeurs et destinataires se trouve un spammeur (ou même qu'un spammeur externe à la chaîne intercepte l'e-mail... certaines prestataires d'adresses e-mail ne sont pas tout blancs) pour que tous ceux qui auront eu le malheur d'être dans le carnet d'adresse du crétin qui n'est pas foutu de rediriger un e-mail proprement se fassent spammer ad vitam eternam.</p>
<p>Est-ce inévitable ? Non, heureusement. C'est en fait la faute des logiciels d'e-mail qui se comportent en redirection comme ils le font en réponse: en récopiant le message original accompagné de son en-tête complet. L'en-tête (header) contient des informations techniques sur l'e-mail, comme le chemin qu'il a suivi de l'expéditeur jusqu'au destinataire, ... et les adresses de tous les destinataires. Il suffit donc, après avoir appuyé sur ce vilain bouton "forward", d'effacer manuellement les informations sensibles que le logiciel a recopiées dans le corps du message. Cela étant fait, le destinataire de la redirection ne pourra connaître que l'adresse de la personne qui lui a envoyé l'e-mail. Il ne pourra pas remonter aux échelons supérieurs, et ne saura pas qui a été l'expéditeur d'origine du message. En revanche, il verra la liste des co-destinataires.</p>
<p>Mais il existe également une astuce pour qu'un destinataire ne puisse pas connaître les adresses de ses co-destinataires. A vrai dire, il ne saura même pas s'il est ou non l'unique destinataire de l'e-mail. La mise en oeuvre de cette astuce est très simple: mettre sa propre adresse dans le champ A: ("To:", le destinataire), et inscrire l'adresse des véritables destinataires dans le champ CCi: ("BCC:" pour "Blind Carbon Copy" ou "Copie Carbone/Conforme <i>invisible</i>") au lieu de l'inscrire dans le champ CC: ("Carbon Copy", "Copie Carbone/Conforme" mais non invisible). Peu de gens connaissent cette méthode, alors qu'elle peut être utilisée avec tous les clients e-mail, même les webmails. En outre, elle rend inefficaces certains virus ou vers qui utilisent les failles d'Outlook pour récupérer les adresses du carnet d'adresses et ainsi se propager sur le réseau.</p>
<p>Encore une fois, il faut prendre la peine de s'informer. On ne le répètera jamais assez: les systèmes de protection contre les spams et "malwares" peuvent être de plus en plus efficaces et sophistiqués, il n'en demeure pas moins que la meilleure protection est la compréhension et la "bonne" utilisation des technologies informatiques. Comme on dit... un internaute averti en vaut deux !</p>
