// Polkovnikov Sergey
package task4

class Accountant(name: String, baseSalary: Int, val bonusPercent: Int) :
    Employee(name, baseSalary) {
    init {
        require(bonusPercent in 0..100) { "bonusPercent must be in 0..100" }
    }

    override fun pay(): Int {
        val base = super.pay()
        return base + base * bonusPercent / 100
    }

    override fun describe(): String = "Accountant " + super.describe()
}
