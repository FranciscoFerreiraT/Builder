¿Cual es la función de este patrón?

Es un patron de diseño creacional.

La principal función de este patron builder es la de permitir construir multiples objetos de una misma clase con diferentes atributos 
Este patrón separa la construccion de un objeto complejo de su representación, pudiendo así contruir diferentes objetos para después devolver el objeto.




 ¿Podríamos combinarlo con el patrón Factory?
Sí, se podría combinar, si su clase en vez de ser una clase concreta, fuese una "interface", podríamos a através del patron "Factory" utilizar diferentes "builders" para implementar diferentes objetos.

