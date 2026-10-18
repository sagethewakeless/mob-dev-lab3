// Polkovnikov Sergey
package task3

class Bike(brand: String, val gears: Int) : Vehicle(brand) {
    init {
        require(gears >= 1) { "gears must be at least 1" }
    }

    override fun info(): String = "Bike $brand, gears=$gears"

    override fun maxSpeedKmh(): Int = 40
}
