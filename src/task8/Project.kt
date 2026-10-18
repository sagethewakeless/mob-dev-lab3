// Polkovnikov Sergey
package task8

class Project(title: String, maxPoints: Int, val bonusCap: Double) :
    Assessment(title, maxPoints) {
    init {
        require(bonusCap.isFinite() && bonusCap >= 0.0) { "bonusCap must not be negative" }
    }

    // ratio = capped base ratio + (points over max / max), bonus limited to bonusCap
    override fun scoreTowardGrade(raw: Int): Double {
        val base = super.scoreTowardGrade(raw)
        val extra = (raw - maxPoints).coerceAtLeast(0).toDouble() / maxPoints
        return base + extra.coerceAtMost(bonusCap)
    }
}
