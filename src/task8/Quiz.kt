// Polkovnikov Sergey
package task8

class Quiz(title: String, maxPoints: Int, val penaltyIfLate: Double) :
    Assessment(title, maxPoints) {
    init {
        require(penaltyIfLate in 0.0..0.5) { "penaltyIfLate must be in 0.0..0.5" }
    }

    override fun scoreTowardGrade(raw: Int): Double =
        super.scoreTowardGrade(raw) * (1.0 - penaltyIfLate)
}
