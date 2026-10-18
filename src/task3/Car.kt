// Polkovnikov Sergey
package task3

class Car(brand: String, val doors: Int) : Vehicle(brand) {
    init {
        require(doors >= 2) { "doors must be at least 2" }
    }

    override fun info(): String = "Car $brand, doors=$doors"

    override fun maxSpeedKmh(): Int = 200
}
