package solid.liskov_sub.violation


open class Worker(
    val hoursWorked: Int = 20
) {
    open fun salary() = hoursWorked * 10
}


class PartTimeWorker : Worker() {
    override fun salary(): Int = hoursWorked * 20
}

class FullTimeWorker : Worker() {
    override fun salary(): Int = hoursWorked * 50
}