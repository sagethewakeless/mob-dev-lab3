// Polkovnikov Sergey
package task10

class ChildTicket(code: String, basePrice: Int, val guardianCode: String) :
    Ticket(code, basePrice) {
    init {
        require(guardianCode.isNotBlank()) { "guardianCode must not be blank" }
    }

    override fun price(): Int = super.price() / 2
}
