// Polkovnikov Sergey
package task8

open class Assessment(val title: String, val maxPoints: Int) {
    init {
        require(title.isNotBlank()) { "title must not be blank" }
        require(maxPoints > 0) { "maxPoints must be positive" }
    }

    open fun scoreTowardGrade(raw: Int): Double =
        raw.coerceIn(0, maxPoints).toDouble() / maxPoints
}
