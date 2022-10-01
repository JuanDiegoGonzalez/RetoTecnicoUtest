# Autor: Juan Diego Gonzalez Gomez
@stories
Feature: Technical Challenge Utest
  As an user, I want to create an account at Utest.com website
  @scenario1
  Scenario Outline: Register at Utest.com website
    Given that Juan Diego wants to be a member of the Utest community
    When he goes to the Utest website homepage and fills up the sign up form
      | strFirstName   | strLastName   | strEmailAddress   | strPassword   |
      | <strFirstName> | <strLastName> | <strEmailAddress> | <strPassword> |
    Then he has an account created at Utest.com and he is welcomed to the site
      | strTitle   |
      | <strTitle> |

    Examples:
      | strFirstName | strLastName    | strEmailAddress  | strPassword | strTitle                                                                |
      | Juan Diego   | Gonzalez Gomez | correo@gmail.com | Prueba1234  | Welcome to the world's largest community of freelance software testers! |
