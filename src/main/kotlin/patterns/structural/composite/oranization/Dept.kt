package patterns.structural.composite.oranization


class Dept : Payable {
    private val employees: MutableList<Employee> = mutableListOf()
    private val subDepts: MutableList<Dept> = mutableListOf()


    fun addEmployee(employee: Employee) {
        employees.add(employee)
    }

    fun addDept(dept: Dept) {
        subDepts.add(dept)
    }

    override fun calcualteTotalSalary(): Double {
        val current = employees.sumOf { it.calcualteTotalSalary() }
        val sub = subDepts.sumOf { it.employees.sumOf { empol -> empol.calcualteTotalSalary() } }
        return current + sub
    }
}