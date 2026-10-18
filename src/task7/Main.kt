// Polkovnikov Sergey
package task7

import task3.Bike
import task3.Car
import task3.Vehicle

fun main() {
    val bike: Vehicle = Bike("X", 3)
    val c = bike as? Car
    println(c)
    println(doorsOrZero(bike))
    println(doorsOrZero(Car("Volvo", 4)))
    // val crash = bike as Car
}
