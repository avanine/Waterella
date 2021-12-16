Feature: Käyttäjä pystyy lisäämään uuden kirjan

  Scenario: Lisää kirja
    Given Kirja luodaan nimellä Tuoteseloste
    Then kirjan nimen tulee olla Tuoteseloste

  Scenario: Lisää kuvaus
    Given Given Kirja luodaan nimellä Tuoteseloste
    When kuvaus "kirjan kuvaus" lisätään
    Then kirjan kuvaus tulee olla "kirjan kuvaus"
