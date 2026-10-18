// Polkovnikov Sergey
package task9

open class Notification(private val payload: String) {
    protected fun body(): String = payload

    open fun render(): String = body()
}
