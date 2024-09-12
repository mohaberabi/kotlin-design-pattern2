package solid.liskov_sub.solution

import solid.liskov_sub.violation.Worker

open class WorkerSolved(
    val hoursWorked: Int = 20
) {
}


class FullTimeWorkerSolved : WorkerSolved(), SalaryCalculator {
    override fun calcSalary(): Double = hoursWorked * 50.0
}

class PartTimeWorkerSolved : WorkerSolved(), SalaryCalculator {
    override fun calcSalary(): Double = hoursWorked * 20.0
}