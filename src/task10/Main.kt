// Polkovnikov Sergey
package task10

fun main() {
    val tickets: List<Ticket> = listOf(
        AdultTicket("A-1", 100),
        ChildTicket("C-1", 60, "G-1"),
        VipTicket("V-1", 30, true),
        ChildTicket("C-2", 40, "G-9")
    )
    println("total=${checkout(tickets)}")
    println("guardians=${childGuardianCodes(tickets).joinToString(", ")}")
}
