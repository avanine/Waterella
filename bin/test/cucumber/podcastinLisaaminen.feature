Feature: Käyttäjä pystyy lisäämään uuden podcastin

  Scenario: Lisää kirja
    Given Podcast luodaan nimella podcast
    Then Podcastin nimen tulee olla podcast

  Scenario: Lisää kuvaus
    Given Podcast luodaan nimellä podcast
    When kuvaus "podcastin kuvaus" lisätään
    Then podcastin kuvaus tulee olla "podcastin kuvaus"