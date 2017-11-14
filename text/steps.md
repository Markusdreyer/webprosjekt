# Rekkefølge på git
1. `git checkout feature`eller `git checkout master`vil da bytte til respektiv branch.

2. `git pull origin master` eller `git pull origin feature` 
Henter siste versjon av prosjektet fra github.

3. `git add`også hva du skal legge til, feks `index.html`  eller `. ` for å legge til alt innenfor mappen

4. `git commit -m “description of update in english"` commuter endringene til branches du er i.

5. `git push origin master`pusher commit til github. Om man får feilmelding så er det sansynlig at det er fordi man har glemt å pulle siste versjon.
