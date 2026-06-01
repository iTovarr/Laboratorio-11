# Reflexión sobre TDD

¿Qué hubiera pasado si hubiera escrito el código de CartService completo antes de escribir las pruebas?

Si hubiera implementado toda la lógica antes de las pruebas, habría perdido los beneficios fundamentales del TDD:

1.  Seguridad de diseño: Escribir las pruebas primero me obliga a pensar en cómo quiero que se use la clase antes de decidir cómo implementarla. Esto genera un diseño más limpio y orientado al cliente de la clase.
2.  Detección temprana de errores: Sin las pruebas, habría escrito código con posibles errores de lógica o de manejo de excepciones (como los casos nulos o los límites) que solo habría descubierto manualmente, lo cual es lento y propenso a errores.
3.  Documentación viva: Las pruebas actúan como una especificación ejecutable. Escribirlas después del código suele resultar en pruebas escritas "para cubrir" lo que ya se hizo, en lugar de pruebas que dictan el comportamiento correcto del sistema.
4.  Menor confianza en la refactorización: Sin un conjunto robusto de pruebas que verifiquen el comportamiento paso a paso, cualquier cambio posterior para mejorar el código se vuelve arriesgado, ya que no tengo la garantía de que el comportamiento base no se rompió.