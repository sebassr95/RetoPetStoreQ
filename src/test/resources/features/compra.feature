# language: es

Característica: Compra en el aplicativo de PetStore
  Yo como usuario
  Quiero comprar animales en el aplicativo web
  Para poder tener los animales deseados

  @compraExitosa
  Esquema del escenario: Compra exitosa mediante el tipo de animal
    Dado que el usuario se encuentra en el home del aplicativo
    Cuando el decide comprar un animal
      | userId   | password   | animalType   | productId   | itemId   | quantity   | cardType   | cardNumber   | expiryDate   | firstNameBillingAddress   | lastNameBillingAddress   | addresOneBillingAddress   | addresTwoBillingAddress   | cityBillingAddress   | stateBillingAddress   | zipBillingAddress   | countryBillingAddress   |
      | <userId> | <password> | <animalType> | <productId> | <itemId> | <quantity> | <cardType> | <cardNumber> | <expiryDate> | <firstNameBillingAddress> | <lastNameBillingAddress> | <addresOneBillingAddress> | <addresTwoBillingAddress> | <cityBillingAddress> | <stateBillingAddress> | <zipBillingAddress> | <countryBillingAddress> |
    Entonces deberia visualizar el mensaje de compra exitosa

    Ejemplos:
      | userId        | password | animalType | productId | itemId | quantity | cardType         | cardNumber          | expiryDate | firstNameBillingAddress | lastNameBillingAddress | addresOneBillingAddress | addresTwoBillingAddress | cityBillingAddress | stateBillingAddress | zipBillingAddress | countryBillingAddress |
      | sebasqvision2 | Todo1199 | FISH       | FI-FW-02  | EST-21 | 5        | MasterCard       | 4440 6542 2541 5245 | 12/2024    | Sebas                   | Ruiz                   | Calle 1                 | Calle 23223             | Itagui             | Los naranjos        | 12345             | Colombia              |
      | sebasqvision2 | Todo1199 | DOGS       | K9-DL-01  | EST-9  | 1        | American Express | 9999 1111 4444 6666 | 04/2028    | Aristoteles             | Marcotulio             | Diagonal 20 num 32-33   | Transversal 23 num 11   | Medellin           | Robledo             | 9999              | Colombia              |

  @compraExitosa
  Esquema del escenario: Compra exitosa mediante la busqueda del nombre del animal
    Dado que el usuario se encuentra en el home del aplicativo
    Cuando el decide comprar un animal buscandolo mediante su nombre
      | userId   | password   | nameAnimal   | productId   | itemId   | quantity   | cardType   | cardNumber   | expiryDate   | firstNameBillingAddress   | lastNameBillingAddress   | addresOneBillingAddress   | addresTwoBillingAddress   | cityBillingAddress   | stateBillingAddress   | zipBillingAddress   | countryBillingAddress   |
      | <userId> | <password> | <nameAnimal> | <productId> | <itemId> | <quantity> | <cardType> | <cardNumber> | <expiryDate> | <firstNameBillingAddress> | <lastNameBillingAddress> | <addresOneBillingAddress> | <addresTwoBillingAddress> | <cityBillingAddress> | <stateBillingAddress> | <zipBillingAddress> | <countryBillingAddress> |
    Entonces deberia visualizar el mensaje de compra exitosa

    Ejemplos:
      | userId        | password | nameAnimal | productId | itemId | quantity | cardType | cardNumber          | expiryDate | firstNameBillingAddress | lastNameBillingAddress | addresOneBillingAddress | addresTwoBillingAddress | cityBillingAddress | stateBillingAddress | zipBillingAddress | countryBillingAddress |
      | sebasqvision2 | Todo1199 | Angelfish  | FI-SW-01  | EST-2  | 3        | Visa     | 4440 6542 2541 5245 | 11/2024    | Arnulfo                 | Perea Ruiz             | Calle 1                 | Calle 23223             | Itagui             | Los naranjos        | 12345             | Colombia              |

  @compraFallida
  Esquema del escenario: Compra fallida - agregar una cantidad de 0 productos del animal seleccionado
    Dado que el usuario se encuentra en el home del aplicativo
    Cuando el decide agregar una cantidad de cero para el producto seleccionado
      | userId   | password   | animalType   | productId   | itemId   | quantity   |
      | <userId> | <password> | <animalType> | <productId> | <itemId> | <quantity> |
    Entonces deberia visualizar el carrito vacio

    Ejemplos:
      | userId        | password | animalType | productId | itemId | quantity |
      | sebasqvision2 | Todo1199 | CATS       | FL-DSH-01 | EST-15 | 0        |

  @removerProductoDelCarrito
  Esquema del escenario: Remover el producto agregado en el carrito de compras
    Dado que el usuario se encuentra en el home del aplicativo
    Cuando el decide remover el producto agregado en el carrito de compras
      | userId   | password   | animalType   | productId   | itemId   |
      | <userId> | <password> | <animalType> | <productId> | <itemId> |
    Entonces deberia visualizar el carrito vacio

    Ejemplos:
      | userId        | password | animalType | productId | itemId |
      | sebasqvision2 | Todo1199 | REPTILES   | RP-SN-01  | EST-12 |
