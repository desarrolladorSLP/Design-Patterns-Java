# Observer (Behavioral)
>Define una manera para notificar eventos a varias clases

## Problema
Existe una relación entre un componente que genera eventos y n objetos que podrían 
estar interesados en ser informados sobre dichos eventos.

## Solución
1. Crear una una interfaz Observador que implementarán las clases interesadas en ser informadas
  de los eventos generados por las clases observadas. La clase contendrá un único método update que 
  será llamado por las clases observadas
2. Crear una clase abstracta que será extendida por las clases observadas. Esta clase contendrá:
   * Una lista de los observadores registrados 
   * Método para registrar nuevos observadores
   * Método para eliminar observadores registrados
   * Método que iterando sobre la lista de observadores registrados, notificará uno a uno 
   de los observadores llamando al método creado por la interfaz Observer

## Estructura general
![Observer General Diagram](observer.jpg)


## Actores
* Observer
* Observable
      
## Algunos usos conocidos
 - Swing
 - QT
 - Angular



## Referencias

https://sourcemaking.com/design_patterns/observer


