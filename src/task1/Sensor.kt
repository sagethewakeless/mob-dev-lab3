// Polkovnikov Sergey

package task1

class Sensor(val id: String, var reading: Double) {
    init {
        require(id.isNotBlank()) { "id must not be blank" }
        require(reading.isFinite()) { "reading must be finite" }
    }

    fun update(reading: Double) {
        require(reading.isFinite()) { "reading must be finite" }
        this.reading = reading
    }

    override fun toString(): String = "Sensor(id=$id, reading=$reading)"
}
