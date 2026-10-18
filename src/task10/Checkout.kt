// Polkovnikov Sergey
package task10

fun checkout(tickets: List<Ticket>): Int = tickets.sumOf { it.price() }

fun childGuardianCodes(tickets: List<Ticket>): List<String> {
    val codes = mutableListOf<String>()
    for (t in tickets) {
        if (t is ChildTicket) {
            codes.add(t.guardianCode)
        }
    }
    return codes
}
