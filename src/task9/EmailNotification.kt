// Polkovnikov Sergey
package task9

class EmailNotification(payload: String, val to: String) : Notification(payload) {
    override fun render(): String = "Email to $to: ${body()}"
}
