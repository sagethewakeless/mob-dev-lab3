// Polkovnikov Sergey
package task2

class Counter(start: Int = 0) {
    private var current: Int = start

    fun value(): Int = current

    fun inc(step: Int = 1) {
        require(step > 0) { "step must be positive" }
        current += step
    }

    fun reset() {
        current = 0
    }
}
