# Waterella
![Github Actions](https://github.com/joonakauranen/Waterella/workflows/Java%20CI%20with%20Gradle/badge.svg)
[![codecov](https://codecov.io/gh/joonakauranen/Waterella/branch/main/graph/badge.svg?token=D2Q0ZC7BPH)](https://codecov.io/gh/joonakauranen/Waterella)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

# Lukuvinkkikirjasto

Lukuvinkkikirjaston avulla erilaiset linkit ja muut muistiinpanot pysyvät järjestyksessä.

# Backlog, Testikattavuusraportti, CI, Lisenssi ja Hyväksymiskriteerit
- Projektin [backlog](https://docs.google.com/spreadsheets/d/1YS67ZnjvREJ0vO-hO_yopbMLsdOGx-G40kil7iPHx0M/edit#gid=7)
- Projektin [testikattavuusraportti](https://app.codecov.io/gh/joonakauranen/Waterella)
- Projektin [CI](https://github.com/joonakauranen/Waterella/actions)
- Projektin [lisenssi](https://github.com/joonakauranen/Waterella/blob/main/LICENSE.txt)
- Projektin [hyväksymiskriteerit](https://github.com/joonakauranen/Waterella/tree/main/src/test/resources/cucumber)

# Definition of done
- User storyt on dokumentoitu backlogiin
- Testit menevät läpi ja uusin versio läpäisee CI:n
- Koodityyli on yhtenäistä
- Luokat ja muuttujat on nimetty järkevästi
- Luokkakohtaista yksikkötestausta tehty
- Ohjelman toiminta on riittävän sujuvaa käyttäjän näkökulmasta

# Asennus- ja käyttöohjeet
Ohjelmaa käytetään komentoriviltä. Seuraava komento luo koneellesi kansion _Waterella_:

```
git clone git@github.com:joonakauranen/Waterella.git
```

Siirtymällä kansioon ja antamalla komennon

```
gradle run
```

pääset käyttämään ohjelmaa.

# Releases
# 1.0
- [Release 1.0](https://github.com/joonakauranen/Waterella/releases/tag/v1.0)
# 0.5
- Lataa JAR-tiedosto [täältä](https://github.com/joonakauranen/Waterella/releases/tag/v0.5)
- Suorita komento _java -jar Waterella-1.0-SNAPSHOT.jar_ kansiossa jossa JAR-tiedosto on

