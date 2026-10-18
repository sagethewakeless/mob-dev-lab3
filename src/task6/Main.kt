// Polkovnikov Sergey
package task6

import task3.Bike
import task3.Car
import task3.Vehicle

fun main() {
    val v: Vehicle = Car("Volvo", 4)
    println(v.info())
    printFleet(listOf(v, Bike("Trek", 18)))
}
