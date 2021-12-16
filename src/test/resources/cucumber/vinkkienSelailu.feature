Feature: Käyttäjä pystyy selaamaan vinkkejä

  Scenario: Listaa vinkit
    Given Podcast luodaan nimella podcast
    When Toinen Podcast lisätään nimellä podcast2
    Then Listauksen tulostus toimii