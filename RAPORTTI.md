 # OhTu raportti – Waterella

		Joona Kauranen, Marike Puranen, Andreas Katsaras, Joel Heusala

Tässä raportissa käsitellään Ohjelmistotuotanto-kurssin miniprojektiosuutta. Raportissa käsitellään projektin kulkua ensin sprinttikohtaisesti ja raportin lopuksi yleisemmin. Yksittäisten sprinttien osalta keskitytään prosessiin kulkuun, projektityöskentelyn sujuvuuteen sekä teknisiin näkökulmiin.

## Ensimmäinen sprintti

Miniprojektiosuus ja ensimmäinen sprintti alkoivat osaltamme nopealla ja formaalilla tutustumiskierroksella. Tutustumisen jälkeen aloimme perehtyä toteutettavana olevaan ohjelmistoon. Hahmottelimme ohjelmiston käyttötarkoitusta ja asiakastapaamisen yhteydessä erottelimme sieltä perustoiminnallisuuden, joka toteutettaisiin Java-ohjelmoinnin osalta aluksi melko suoraviivaisesti.

Scrum ohjelmistotuotannon mallina vaati myös hieman tutustumista. Aloitimme backlogin rakenteeseen tutustumisella, backlogin organisoimisella, user storyjen taskeiksi jakamisella ja asiakkaan toiveiden mukaisesti toteutettavien toiminnallisuuksien läpikäymisellä.

Sprinttiin valittujen user storyjen tekninen toteutus onnistui hyvin ja asiakkaalle pystyttiin esittelemään ensimmäisen sprintin suunnitelmaa vastaava ohjelma.

Toteutukseen käytettiin Javaa, testaamiseen Junit-testauskehikkoa ja CI/CD-putkena toimi Github Actions.

## Toinen sprintti

Scrumiin ja uuden sprintin aloittamiseen liittyvät vaiheet sujuivat toisen sprintin alussa sujuvasti. Retrospektiivissä totesimme ensimmäisen sprintin menneen pääosin suunnitelmien mukaan, mainitsemisen arvoisia vaikeuksia ei ensimmäisen sprintin aikana ollut tullut esiin.

Asiakastapaamisessa asiakas toivoi toiminnallisuuden osalta muutamia lisäominaisuuksia ja pieniä muutoksia jo toteutettuun toiminnallisuuten. Lisäksi asiakas toivoi ohjelmiston siirtyvän tekstikäyttöliittymästä graafiseen käyttöliittymään.

Teknisellä tasolla asiakkaan toiveet vaativat ulkoisen tietokannan integroimista ja ensimmäisessä sprintissä luodun toiminnallisuuden päälle rakennettavaa uutta käyttöliittymää. Tässä vaiheessa user storyt jaettiin sopiviin teknisiin taskeihin.

Uuden toiminnallisuuden toteuttamiseen käytettäviksi teknologioiksi valittiin Javan lisäksi JavaScript-kirjasto React ja MongoDB-tietokantaohjelmisto.

Tässä sprintissä haasteelliseksi osoittautui tietokannan, selainpuolen ja palvelinpuolen yhteensovittaminen. Työajan puitteissa teknologioihin tutustuminen eteni hyvin ja kaikki toiminnallisuus saatiin aloitettua, mutta kokonaisuutta ei onnistuttu toteuttamaan Definition of Donen määrittelemällä tavalla. Näin ollen päätettiin osaa sprintin user storyistä ei esitellä asiakkaalle.

Asiakkeella näkyvä uusi toiminnallisuus esiteltiin siis vielä tässä vaiheessa tekstikäyttöliittymää käyttäen.

## Kolmas sprintti

Kolmas sprintti koostui pääasiassa edellisessä sprintissä määriteltyjen user storyjen loppuun saattamisesta. Tämän lisäksi testikattavuutta paranneltiin ja viimeisen sprintin ollessa kyseessä myös Github repositorio viimeisteltiin asianmukaiseen kuntoon.

Scrumiin liittyvät vaiheet suoritettiin paljolti aiemmilta kahdelta sprintiltä tutulla tavalla. Tosin tällä viikolla tapasimme muutaman kerran “daily” scrumin merkeissä. Ei kuitenkaan päivittäin.

Suurin tämän sprintin sisältämä työ muodostui tietokannan, selainpuolen ja palvelinpuolen toimivaksi kokonaisuudeksi yhdistämisestä. Edellisen sprintin tapaan edellä mainittu ohjelmiston eri teknisten osien yhteen liittäminen aiheutti myös tämän sprintin suurimmat haasteet, mutta viimeisen sprintin ja miniprojektiosion lopuksi pystyttiin demotilaisuudessa esittelemään toimiva kokonaisuus.

## Yleistä projektista

Keskeisimpiä projektiin liittyviä oppimiskokemuksia syntyi paljon kurssin yhteydessä esiteltyyn ohjelmistotuotantomalliin Scrumiin liittyen. Hyvää harkoitusta tuli myös tiimityöskentelystä, kommunikoinnista ja muusta tekniseen toteutukseen liittyvästä, mutta kuitenkin jokseenkin siitä eroavista käytännöistä.

Aikaa projektiin oli suhteellisen vähän, joten teknologioihin tutustuminen vei ohjelmiston toiminnallisten vaatimusten suppeuteen nähden huomattavasti aikaa. Tähän suhteuttaen myös scrumin melko yksityiskohtainen noudattaminen oli aikaa vievää. Tämä toki oli tietoinen päätös ja liittyi kurssin oppimistavoitteisiin.

Kaiken kaikkiaan tiimityöskentelyn voidaan todeta toimineen hyvin. Vaatimusten mukainen ohjelmisto saatiin toteutettua kurssilla käytössä ollutta ohjelmistotuotantomallia noudattaen.

Eniten haasteita aiheutti ohjelmiston eri osien yhtäaikainen työstäminen eri teknologioita käyttäen.
