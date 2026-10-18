// Polkovnikov Sergey
package task3

fun main() {
    val car = Car("Volvo", 4)
    val bike = Bike("Trek", 18)
    println(car.info())
    println(car.maxSpeedKmh())
    println(bike.info())
    println(bike.maxSpeedKmh())
}
