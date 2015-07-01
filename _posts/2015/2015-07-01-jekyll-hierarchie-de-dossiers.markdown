---
layout: "post"
published: true
title: "Jekyll: une hiérarchie de dossiers"
author: GF
date: "2015-07-01 23:35"
place: Montpellier
categories:
- Valhalla
- Informatique
tags:
- software
- Web
- programmation
- technique
- Jekyll
comments: true
permalink:  /2015/07/01/jekyll-hierarchie-de-dossiers/
---

Le moteur de sites statiques [Jekyll][1] génère les URL en fonction du nom des fichiers. Ainsi, le fichier _2015-07-01-jekyll-hierarchie-de-dossiers.markdown_ sera visible à l’adresse _/2015/07/01/jekyll-hierarchie-de-dossiers/_. C’est très pratique, jusqu’à ce que le dossier _posts_ contenant les fichiers source soit plein à craquer. C’est alors que l’on songe à classer les fichiers en sous-dossiers, par exemple par année. Et c’est là que les problèmes commencent…

Cette structure par défaut devient vite difficile à gérer :

	_posts/
	      |- 2015-07-01-jekyll-hierarchie-de-dossiers.markdown

Ainsi, la structure suivant est préférable :

	_posts/
	      |- 2015/
	             |- 2015-07-01-jekyll-hierarchie-de-dossiers.markdown

Jekyll associe le nom du fichier à son URL, mais le fichier doit être placé dans le dossier racine _posts_. S’il se trouve dans un sous-dossier, le nom de ce sous-dossier est intégré dans l’URL.

Un exemple permet de comprendre le problème :

	Fichier : /posts/2015-07-01-jekyll-hierarchie-de-dossiers.markdown
	URL : /2015/07/01/jekyll-hierarchie-de-dossiers/

	Fichier : /posts/2015/2015-07-01-jekyll-hierarchie-de-dossiers.markdown
	URL : /2015/2015/07/01/jekyll-hierarchie-de-dossiers/

Si l’on tente de compiler le site en ayant déplacé les fichiers dans des sous-dossiers correspondant à l’année de rédaction, l’on se heurte à un problème de compilation dès lors que le tag _post\_url_ est utilisé.

	Liquid Exception: Could not find post "2010-06-08-les-choix-par-defaut" in tag 'post_url'. Make sure the post exists and the name is correct. in pages/index.md
	jekyll 2.5.3 | Error:  Could not find post "2010-06-08-les-choix-par-defaut" in tag 'post_url'.

Il faut donc commencer par modifier le contenu de ces tags, dans le corps des fichiers, en préfixant l’URL indiquée du nouveau sous-dossier. 

Cependant, il reste le problème de l’URL du fichier, qui fait apparaître l’année en double. Pour le résoudre, j’ai choisi d’utiliser le mot-clé **permalink** dans le _front-matter_ de chaque fichier Markdown. Ainsi, dans le fichier correspondant au présent article, l’on peut lire :

	permalink:  /2015/07/01/jekyll-hierarchie-de-dossiers/

Cela fonctionne parfaitement, mais il faut éditer chaque fichier pour définir un _permalink_ personnalisé, ce qui est extrêmement long et fastidieux lorsqu’on a plusieurs centaines de fichiers…

J’ai donc réalisé le petit script suivant en **Ruby** pour automatiser le processus.

{% highlight ruby %}
############# CLASS DEFINITION #############

class Analyzer
  attr_accessor :ext, :src
  
  def initialize(ext, src)
    @ext = ext
    @src = src + "*" + ext
        
    Dir[@src].each do |filesrc|
      readfile filesrc
    end
  end
  
  def readfile(filesrc)
    # Read file
    begin
        # Open the file and read the lines
        file = File.new(filesrc, "r+")
        lines = IO.readlines(file)
        lines.map.each_with_index do |line,index|
            # Before the last line, add the permalink
            if "#{lines[index+1]}".include? "---"
              lines[index] += "permalink:  #{self.make_permalink(file)}/"
            end
        end
        # Write the line to the file
        lines.each do |line|
          file.puts(line)
        end
        file.close
    rescue => err
        puts "Exception: #{err}"
        err
    end
  end
  
  # Build the permalink :
  # 2015-07-01-foo => /2015/07/01/foo
  def make_permalink(file)
    f = File.basename(file, @ext)
    '/' + f.slice!(0..11).gsub!('-','/') + f
  end
  
end

############# MAIN #############
# Edit here
# First parameter: the file extension, .markdown, .md, .txt...
# Second parameter: the root dir
a = Analyzer.new(".markdown", "_posts/")
{% endhighlight %}

En spécifiant, à la dernière ligne, l’extension des fichiers et le dossier racine, le script modifie chacun des fichiers en ajoutant le permalink correspondant au nom du fichier. L’analyse menée par le script n’est pas récursive, si bien qu’elle doit être lancée _avant_ de déplacer les fichiers dans des sous-dossiers.

[1]:	http://jekyllrb.com/