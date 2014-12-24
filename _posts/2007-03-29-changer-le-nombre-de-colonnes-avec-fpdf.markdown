---
layout: post
status: publish
published: true
title: Changer le nombre de colonnes avec FPDF
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
excerpt: "Il existe de nombreuses API pour générer des documents PDF à la volée depuis
  un script PHP. L'API <a href=\"http://www.fpdf.org/\">FPDF</a> présente de très
  nombreux avantages: lègère, puissance, très facile d'utilisation, opensource, gratuite.
  Cependant, on peut rencontrer un problème lors de la rédaction du code qui génèrera
  le PDF: comment mélanger des pages qui affichent le texte sur plusieurs colonnes
  avec des pages qui affichent le texte sur une seule colonne ? Voici la réponse.\r\n\r\n"
wordpress_id: 118
wordpress_url: http://www.valhalla.fr/index.php/2007/03/29/changer-le-nombre-de-colonnes-avec-fpdf/
date: '2007-03-29 18:30:06 +0200'
date_gmt: '2007-03-29 17:30:06 +0200'
categories:
- Web
tags:
- Internet
- programmation
- Web
---
<p>Il existe de nombreuses API pour générer des documents PDF à la volée depuis un script PHP. L'API <a href="http://www.fpdf.org/">FPDF</a> présente de très nombreux avantages: lègère, puissance, très facile d'utilisation, opensource, gratuite. Cependant, on peut rencontrer un problème lors de la rédaction du code qui génèrera le PDF: comment mélanger des pages qui affichent le texte sur plusieurs colonnes avec des pages qui affichent le texte sur une seule colonne ? Voici la réponse.</p>
<p><a id="more"></a><a id="more-118"></a></p>
<p>Sur <a href="http://www.fpdf.org/">le site de FPDF</a>, on peut trouver un tutoriel montrant comment disposer le texte de la page sur plusieurs colonnes. Pour reprendre cet exemple, le code à rajouter est le suivant:</p>
<p><span class="Code"><br />
/* Définit la colonne courante */<br />
function SetCol($col)<br />
{<br />
    //Positionnement sur une colonne<br />
    $this->col=$col;<br />
    $x=10+$col*65;<br />
    $this->SetLeftMargin($x);<br />
    $this->SetX($x);<br />
}<br />
</span></p>
<p><span class="Code"><br />
/* Pour placer les annexes sur 3 colonnes lorsque c'est nécessaire */<br />
function AcceptPageBreak()<br />
{<br />
    //Méthode autorisant ou non le saut de page automatique<br />
    if($this->col&lt;2)<br />
    {<br />
        //Passage à la colonne suivante<br />
        $this->SetCol($this->col+1);<br />
        //Ordonnée en haut<br />
        $this->SetY(60);<br />
        //On reste sur la page<br />
        return false;<br />
    }<br />
    else<br />
    {<br />
        //Retour en première colonne<br />
        $this->SetCol(0);<br />
        //Ordonnée en haut<br />
        $this->SetY(60);<br />
        //Saut de page<br />
        return true;<br />
    }<br />
}<br />
</span></p>
<p>La fonction AcceptPageBreak() est appelée à chaque fois que le curseur atteint le bas de la page. Le code ci-dessus a pour effet de rediriger l'appel de AcceptPageBreak() vers la fonction SetCol() et d'effectuer un petit test: est-ce qu'on en est à la troisième colonne ? Si oui, passer à la page suivante. Sinon, aller à la prochaine colonne, en restant sur la même page.</p>
<p>L'idée principale du mécanisme est la suivante: si AcceptPageBreak() renvoie TRUE, le curseur passe à la page suivante. Si elel renvoie FALSE, le curseur reste sur la même page.</p>
<p>Or, dans l'exemple précédent, AcceptPageBreak() est surchargée. Cela signifie qu'elle n'admet qu'une seule implémentation, ce qui a pour conséquence d'imposer la même politique (une seule colonne ou 3 colonnes) dans tout le document.</p>
<p>Comment, dès lors, faire pour indiquer que l'on veut telle ou telle page sur 3 colonne et telle autre page sur une seule colonne ?</p>
<p>Voici l'astuce:</p>
<p>1) Renommer la fonction AcceptPageBreak() ci-dessus, pour l'appeler, par exemple, PageBreak().</p>
<p>2) Créer une variable de classe appelée par exemple $colonnes</p>
<p>3) Créer une nouvelle fonction AcceptPageBreak(), et la défini ainsi:</p>
<p><span class="Code"><br />
/* Fonction appelée à chaque changement de page */<br />
function AcceptPageBreak()<br />
{<br />
	// Mettre la variable $colonnes à TRUE pour répartir le texte sur 3 colonnes.<br />
	if($this->colonnes)<br />
		return $this->PageBreak();<br />
	else<br />
		return $this->AutoPageBreak; // appel à la méthode parent<br />
}<br />
</span></p>
<p>3) Dans le code, changer la valeur de la variable $colonnes.</p>
<p>Imaginons que nous ayons créer un nouvel objet FPDF de cette manière:</p>
<p><span class="Code">$pdf = new FPDF();</span></p>
<p>il suffira alors d'écrire:</p>
<p><span class="Code"><br />
$pdf->colonnes = TRUE;</p>
<p>// tout ce qui se situe ici sera sur 3 colonnes<br />
</span></p>
<p><span class="Code"><br />
$pdf->colonnes = FALSE;</p>
<p>// tout ce qui se situe ici sera sur 1 colonne<br />
</span></p>
