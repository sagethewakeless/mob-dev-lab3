// Polkovnikov Sergey
package task6

import task3.Vehicle

fun printFleet(fleet: List<Vehicle>) {
    for (vehicle in fleet) {
        println(vehicle.info())
    }
}
