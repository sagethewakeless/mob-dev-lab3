// Polkovnikov Sergey
package task5

open class Parcel(val id: String, val weightKg: Double) {
    init {
        require(id.isNotBlank()) { "id must not be blank" }
        require(weightKg.isFinite() && weightKg > 0.0) { "weightKg must be positive" }
    }

    open fun shippingCost(): Double = weightKg * 2.0
}
