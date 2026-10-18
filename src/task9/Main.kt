// Polkovnikov Sergey
package task9

fun main() {
    val items: List<Notification> = listOf(
        Notification("System started"),
        EmailNotification("Your order has shipped", "user@example.com"),
        SmsNotification("Your code is 4821", "+996555000111")
    )
    sendAll(items)
}
