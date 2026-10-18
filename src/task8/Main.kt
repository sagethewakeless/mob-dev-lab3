// Polkovnikov Sergey
package task8

fun main() {
    val raw = 22
    val items: List<Assessment> = listOf(
        Assessment("Midterm", 20),
        Quiz("Quiz 1", 20, 0.1),
        Project("Final Project", 20, 0.25)
    )
    for (item in items) {
        val score = item.scoreTowardGrade(raw)
        println("${item.title}: %.2f".format(score))
    }
}
