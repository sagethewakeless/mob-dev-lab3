// Polkovnikov Sergey
package task3

open class Vehicle(val brand: String) {
    init {
        require(brand.isNotBlank()) { "brand must not be blank" }
    }

    open fun info(): String = "Vehicle $brand"

    open fun maxSpeedKmh(): Int = 0
}
