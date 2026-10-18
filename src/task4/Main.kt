// Polkovnikov Sergey
package task4

fun main() {
    val staff: List<Employee> = listOf(
        Employee("Anna", 1000),
        Accountant("Boris", 1200, 10),
        Intern("Vera", 800, "Anna")
    )
    for (e in staff) {
        println(e.describe())
    }
    println("total=${staff.sumOf { it.pay() }}")
}
