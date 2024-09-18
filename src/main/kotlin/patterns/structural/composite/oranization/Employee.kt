package patterns.structural.composite.oranization

data class Employee(
    val name: String,
    val id: String,
    val salary: Double
) : Payable {
    override fun calcualteTotalSalary(): Double = salary
}


fun main() {


    val empol = Employee("123", "123", 1000.0)
    val empo2 = Employee("123", "123", 1000.0)


    val dept = Dept()
    dept.addEmployee(empol)
    dept.addEmployee(empo2)
    dept.addDept(dept)

    println(dept.calcualteTotalSalary())

}