// Polkovnikov Sergey
package task4

open class Employee(val name: String, val baseSalary: Int) {
    init {
        require(name.isNotBlank()) { "name must not be blank" }
        require(baseSalary >= 0) { "baseSalary must not be negative" }
    }

    open fun pay(): Int = baseSalary

    open fun describe(): String = "$name: ${pay()}"
}
