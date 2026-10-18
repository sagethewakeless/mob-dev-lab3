// Polkovnikov Sergey
package task9

class SmsNotification(payload: String, val phone: String) : Notification(payload) {
    override fun render(): String = "SMS to $phone: ${body()}"
}
