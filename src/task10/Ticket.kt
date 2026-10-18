// Polkovnikov Sergey
package task10

open class Ticket(val code: String, val basePrice: Int) {
    init {
        require(code.isNotBlank()) { "code must not be blank" }
        require(basePrice >= 0) { "basePrice must not be negative" }
    }

    open fun price(): Int = basePrice
}
