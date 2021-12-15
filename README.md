# Waterella
![Github Actions](https://github.com/joonakauranen/Waterella/workflows/Java%20CI%20with%20Gradle/badge.svg)
[![codecov](https://codecov.io/gh/joonakauranen/Waterella/branch/main/graph/badge.svg?token=D2Q0ZC7BPH)](https://codecov.io/gh/joonakauranen/Waterella)

# Lukuvinkkikirjasto

Lukuvinkkikirjaston avulla erilaiset linkit ja muut muistiinpanot pysyvät järjestyksessä.

# Backlog, Testikattavuusraportti ja CI
- Projektin [backlog](https://docs.google.com/spreadsheets/d/1YS67ZnjvREJ0vO-hO_yopbMLsdOGx-G40kil7iPHx0M/edit#gid=7)
- Projektin [testikattavuusraportti](https://app.codecov.io/gh/joonakauranen/Waterella)
- Projektin [CI](https://github.com/joonakauranen/Waterella/actions)

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

- Lataa JAR-tiedosto [täältä](https://github.com/joonakauranen/Waterella/releases/tag/v0.5)
- Suorita komento _java -jar Waterella-1.0-SNAPSHOT.jar_ kansiossa jossa JAR-tiedosto on

