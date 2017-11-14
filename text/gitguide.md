## Oppsett av mappe med noen filer
* `mkdir web-prosjekt` lager mappe
* `cd web-prosjekt` går inn i mappe
* `touch index.html styles.css scripts.js` lager filer
* `code .` åpner current directory

## Sett opp git og link til github
* `git init` lager git filer
* trykk + new repository (uten ekstra filer) på github
* kopier https lenken og mos den inn som dette:
* `git remote add origin url-til-github-https` linker prosjektet til github
* `touch .gitignore` lager gitignore fil
* 'git add .` lager en versjon av alt som ligger i current directory (utenom det som ligger i .gitignore, seff)
* `git commit -m “initial commit”` lager commit med en melding
* `git push origin master` pusher alt til github

## Branching
* `git checkout -b navbar` lager ny branch kalt navbar og går dit
* `git checkout -` går tilbake til forrige branch 
* `git log` viser oversikt over commits (det står sikkert "commit d886ebf24045e603871a2f264934900c70937465" - da er den lange stringen den man bruker til å.... 
* `git checkout d886ebf24045e603871a2f264934900c70937465` går til branch d886ebf24045e603871a2f264934900c70937465 
* `git checkout navbar` går til branch navbar 

## Samarbeide
1. `git pull origin master` henter siste versjon fra remote (f.eks github)
2. hvis det kommer noe i pullen så gjør en ny commit:
`git add . && git commit -m “melding om commit”` lager commit lokalt
3. `git push origin master` dytter lokal commit til remote

Er det merge conflict; gå i filen, fiks feilen og start fra 1

## Annet
* `cmd + k` fjerner alt fra terminalen
* chill terminal program **Hyper**

