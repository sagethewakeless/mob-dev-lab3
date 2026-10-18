// Polkovnikov Sergey
package task10

class VipTicket(code: String, basePrice: Int, val loungeAccess: Boolean) :
    Ticket(code, basePrice) {
    override fun price(): Int = super.price() + if (loungeAccess) 50 else 20
}
