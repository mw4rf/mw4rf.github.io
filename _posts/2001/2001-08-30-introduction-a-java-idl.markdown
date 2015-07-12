---
layout: post
status: publish
published: true
title: Introduction à Java IDL
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
wordpress_id: 62
wordpress_url: http://blog.gfblog.com/index.php/2001/08/30/introduction-a-java-idl/
date: '2001-08-30 11:54:13 +0200'
date_gmt: '2001-08-30 09:54:13 +0200'
categories:
- Java
tags:
- programmation
- serveur
- java
permalink:  /2001/08/30/introduction-a-java-idl/
---
<p>Article de <a href="http://www.sun.com">Sun</a> traduit et adapt&eacute; en fran&ccedil;ais.</p>
<h1>Qu'est-ce que Java IDL ?</h1>
<p>Java IDL est une technologie pour les &quot;objets distribu&eacute;s&quot;, c'est-&agrave;-dire des objets interagissant avec diff&eacute;rentes stations de travail d'un r&eacute;seau. Java IDL est similaire &agrave; RMI (Remote Method Invocation) qui supporte des objets distribu&eacute;s &eacute;crits enti&egrave;rement et exclusivement en langage Java. Cependant, Java IDL permet aux objets d'&ecirc;tre utilis&eacute;s m&ecirc;me s'ils sont &eacute;crits dans un langage diff&eacute;rent de Java, comme C/C++, Cobol, et bien d'autres.</p>
<p>Ceci est possible car Java IDL est bas&eacute; sur l'architecture CORBA (Common Object Request Brokerage Architecture), un standard mondial de l'industrie dans la distribution d'objets sur un r&eacute;seau. Une des composantes de Corba est IDL (Interface Definition Language), langage dit &quot;neutre&quot;. Chaque langage de programmation supportant Corba impl&eacute;mente une IDL, d'o&ugrave; le nom de &quot;Java IDL&quot;, l'impl&eacute;mentation IDL pour Java. Corba et IDL sont issus d'un consortium de trusts mondiaux (notamment IBM, Boeing, etc.) connus sous le nom de OMG (Object Management Group), et le fait que Sun Microsystems soit l'un des membres fondateurs explique que IDL soit si bien adapt&eacute; &agrave; Java.</p>
<p>Pour permettre des interactions entre les objets de diff&eacute;rents programmes d'un r&eacute;seau, Java IDL &quot;fourni&quot; un ORB (Object Request Broker). Un ORB est une biblioth&egrave;que de classes qui permet une communication de bas niveau entre Java IDL et d'autres applications bas&eacute;es sur Corba.</p>
<h1>L'architecture CORBA</h1>
<p>Une interaction entre 2 objets sur un r&eacute;seau a toujours 2 sens: le client et le serveur (entr&eacute;e/sortie su vous pr&eacute;f&eacute;rez). Le serveur cr&eacute;e une &quot;Remote Interface&quot; (c'est &agrave; dire une porte d'entr&eacute;e vers lui), et le client appelle et utilise cette &quot;Remote Interface&quot;. Ceci est globalement la proc&eacute;dure g&eacute;n&eacute;ralis&eacute;e utilis&eacute;e par les standards d'objets distribu&eacute;s comme RMI ou Corba. On notera que les mots &quot;client&quot; et &quot;serveur&quot; d&eacute;signent des interactions au niveau des objets et pas des applications: un logiciel peut &ecirc;tre &agrave; la fois client et serveur selon s'il publie ou re&ccedil;oit tel ou tel objet.</p>
<p>Du c&ocirc;t&eacute; du client, l'application a une r&eacute;f&eacute;rence vers l'objet distribu&eacute;. La r&eacute;f&eacute;rence a une m&eacute;thode &quot;stub&quot; (&quot;stub&quot; signifie le &quot;talon&quot; d'un ticket en anglais) qui est une sorte des rempla&ccedil;ant pour la m&eacute;thode appel&eacute;e &agrave; distance. Le &quot;stub&quot; est install&eacute; dans l'ORB, l'appeler revient donc &agrave; activer les fonctions de communication de l'ORB qui se chargera de la connexion au serveur.</p>
<p>Du c&ocirc;t&eacute; du serveur, l'ORB utilise un &quot;squelette&quot; de code pour traduire l'appel &agrave; distance en un appel de m&eacute;thode sur un objet local. Le squelette se charge de bien traduire la requ&ecirc;te dans le format attendu par l'objet local. Quand la m&eacute;thode finit (&agrave; comprendre: quand elle retourne) le squelette se charge de traduire la valeur de retour ou les erreurs et de les transmettre &agrave; l'ORB qui les transmet &agrave; son tour au client.<br />
  Entre les ORB, la communication est &eacute;tablie gr&acirc;ce &agrave; un protocole sp&eacute;cial: IIOP (Internet Inter-ORB Protocol). IIOP, bas&eacute; sur le standard TCP/IP, d&eacute;finit comment des ORB pour Corba &eacute;changent des informations. Tout comme Corba et IDL, IIOP est un standard d&eacute;finit par l'OMG (Object Management Group).</p>
<p>En plus des possibilit&eacute;s de communication expos&eacute;es plus haut, les ORB bas&eacute;s sur Corba ont des fonctionnalit&eacute;s am&eacute;lior&eacute;es, des services d&eacute;finis par l'OMG. Ceci inclut la recherche d'objets par nom, la persistance d'objets, la possibilit&eacute; d'&eacute;changer des messages, etc. Certains ORB supportent ces fonctions, celui fourni avec Java IDL supporte la recherche d'objets par nom.</p>
<h1>Le processus de d&eacute;veloppement de Java IDL</h1>
<p>1) D&eacute;finir l'interface &agrave; distance<br />
  On d&eacute;finit l'interface &agrave; distance en utilisant le langage de d&eacute;finition de l'interface de l'OMG, c'est &agrave; dire IDL. On utilise IDL plut&ocirc;t que Java car le compilateur idl-to-java travaille &agrave; partir d'un (code) source IDL, g&eacute;n&eacute;rant tous les fichiers &quot;stub&quot; et &quot;squelette&quot; avec le code d'infrastructure n&eacute;cessaire &agrave; la connexion avec l'ORB. En utilisant IDL, on permet aux autres d&eacute;veloppeurs d'impl&eacute;menter des clients et des serveurs dans d'autres langages compatibles Corba. </p>
<p>2) Compiler l'interface &agrave; distance<br />
  Quand on lance le compilateur idl-to-java sur le fichier source de d&eacute;finition de l'interface, il g&eacute;n&egrave;re une version en Java de l'interface, comme il g&eacute;n&egrave;re les stubs et les squelettes.</p>
<p>3) Impl&eacute;menter le serveur<br />
  Une fois le compilateur idl-to-java lanc&eacute;, on peut utiliser les squelettes g&eacute;n&eacute;r&eacute;s pour assembler son serveur. En plus d'impl&eacute;menter les m&eacute;thode de l'interface &agrave; distance, le code du serveur inclut un m&eacute;canisme pour lancer l'ORB et attendre une requ&ecirc;te d'un client.</p>
<p>4) Impl&eacute;menter un client<br />
  De m&ecirc;me on utilisera les stubs g&eacute;n&eacute;r&eacute;s par le compilateur comme base pour l'application client. Le code client construit &agrave; partir des stubs lance l'ORB de son c&ocirc;t&eacute; qui recherche une connexion vers le serveur utilisant le service de noms indiqu&eacute; par Java IDL, obtient une r&eacute;f&eacute;rence vers l'objet &agrave; distance et invoque &agrave; distance ses m&eacute;thodes.</p>
<p>5) D&eacute;marrer l'application<br />
Une fois le serveur et le client cr&eacute;&eacute;e, on peut lancer le service de noms, puis d&eacute;marrer le serveur, et enfin lancer le client.</p>
<p>Notes:<br />
  1) Avec Java 1.3, idltojava compiler est remplac&eacute; par idlj compiler<br />
  2) Si vous d&eacute;sirez un exemple concret: HelloWorld! dans la suite de cet article de la FAQ. Article Sun ici.</p>
<p>Traduit et adapt&eacute; de l'anglais par Narcanes, (article original de Jim Inscore Sun Microsystems)<br />
  pour l'association Java-France/Jgflsoft<br />
  www.java-france.com / www.jgflsoft.com<br />
  R&eacute;&eacute;dit&eacute; pour Valhalla GFBLOG. <br />
  Montpellier, 30 ao&ucirc;t 2001.</p>
