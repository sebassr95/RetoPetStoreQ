# language: es

Característica: Autenticacion en el aplicativo de PetStore
  Yo como usuario de petstore
  Quiero realizar la autenticación en el aplicativo
  Para comprar los productos ofrecidos en la web

  @autenticacionExitosa
  Esquema del escenario: Autenticacion exitosa
    Dado que el usuario se encuentra en el home del aplicativo
    Cuando el realiza la autenticacion en el aplicativo con datos validos
      | userId   | password   |
      | <userId> | <password> |
    Entonces deberia quedar autenticado en el aplicativo

    Ejemplos:
      | userId       | password |
      | sebasqvision | Todo1199 |

  @autenticacionFallida
  Esquema del escenario: Autenticación fallida usuario no existe
    Dado que el usuario se encuentra en el home del aplicativo
    Cuando el realiza la autenticacion en el aplicativo con datos invalidos
      | userId   | password   |
      | <userId> | <password> |
    Entonces deberia visualizar el mensaje de error

    Ejemplos:
      | userId      | password     |
      | holaqvision | prueba999995 |

  @autenticacionFallida
  Esquema del escenario: Autenticación fallida clave de usuario incorrecta
    Dado que el usuario se encuentra en el home del aplicativo
    Cuando el realiza la autenticacion en el aplicativo con datos invalidos
      | userId   | password   |
      | <userId> | <password> |
    Entonces deberia visualizar el mensaje de error

    Ejemplos:
      | userId | password          |
      | sebasqvision | incorrecta123 |