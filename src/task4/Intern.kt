// Polkovnikov Sergey
package task4

class Intern(name: String, baseSalary: Int, val mentor: String) :
    Employee(name, baseSalary) {
    init {
        require(mentor.isNotBlank()) { "mentor must not be blank" }
    }

    override fun pay(): Int = super.pay() / 2
}
