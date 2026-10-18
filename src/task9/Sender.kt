// Polkovnikov Sergey
package task9

fun sendAll(items: List<Notification>) {
    for (item in items) {
        println(item.render())
    }
}
