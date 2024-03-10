# language: es

Característica: Registro en el aplicativo de PetStore
  Yo como usuario
  Quiero registrar una cuenta en el aplicativo web
  Para poder realizar las compras

  @registroExitoso
  Esquema del escenario: Registro exitoso
    Dado que el usuario se encuentra en el home del aplicativo
    Cuando el decide registrar sus datos
      | userId   | password   | confirmarPassword   | firstName   | lastName   | email   | phone   | addresOne   | addresTwo   | city   | state   | zip   | country   |
      | <userId> | <password> | <confirmarPassword> | <firstName> | <lastName> | <email> | <phone> | <addresOne> | <addresTwo> | <city> | <state> | <zip> | <country> |
    Entonces deberia quedar registrado en el aplicativo

    Ejemplos:
      | userId        | password | confirmarPassword | firstName | lastName | email             | phone | addresOne | addresTwo | city     | state  | zip    | country |
      | sebasqvision8 | Todo1199 | Todo1199          | Sebas     | Salda    | prueba1@testq.com | 3333  | Calle 1   | Calle 2   | Medellin | Itagui | 055412 | Nueva   |

  @registroFallido
  Esquema del escenario: Registro fallido usuario ya existe
    Dado que el usuario se encuentra en el home del aplicativo
    Cuando el decide registrar los datos de un usuario ya registrado
      | userId   | password   | confirmarPassword   | firstName   | lastName   | email   | phone   | addresOne   | addresTwo   | city   | state   | zip   | country   |
      | <userId> | <password> | <confirmarPassword> | <firstName> | <lastName> | <email> | <phone> | <addresOne> | <addresTwo> | <city> | <state> | <zip> | <country> |
    Entonces deberia generarse error sin permitir el registro

    Ejemplos:
      | userId        | password | confirmarPassword | firstName | lastName | email             | phone | addresOne | addresTwo | city     | state  | zip    | country |
      | sebasqvision2 | Todo1199 | Todo1199          | Sebas     | Salda    | prueba2@testq.com | 3333  | Calle 1   | Calle 2   | Medellin | Itagui | 055412 | Nueva   |

  @registroFallido
  Esquema del escenario: Registro fallido con datos incompletos
    Dado que el usuario se encuentra en el home del aplicativo
    Cuando decide registrar su usuario con datos incompletos
      | userId   | password   | confirmarPassword   | firstName   | lastName   | email   | phone   | addresOne   | addresTwo   | city   | state   | zip   | country   |
      | <userId> | <password> | <confirmarPassword> | <firstName> | <lastName> | <email> | <phone> | <addresOne> | <addresTwo> | <city> | <state> | <zip> | <country> |
    Entonces deberia generarse error sin permitir el registro

    Ejemplos:
      | userId | password | confirmarPassword | firstName | lastName | email             | phone | addresOne | addresTwo | city     | state  | zip    | country |
      | sebas  | Todo1199 | Todo1199          | @@@@      | Salda    | prueba2@testq.com | 3333  | Calle 1   | Calle 2   | Medellin |        |        |         |
      | sebas  | Todo1199 | Todo1199          |           | #####    | &&&&&&&&          | 3333  | Calle 1   | Calle 2   | Medellin | Itagui | 055412 | Nueva   |
