// Polkovnikov Sergey
package task7

import task3.Car
import task3.Vehicle

fun doorsOrZero(v: Vehicle): Int {
    return if (v is Car) v.doors else 0
}
