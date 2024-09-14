package patterns.behavioral.command

class SmartDoor(
    private val name: String
) {


    fun lock() = println("Door locked")

    fun unlock() = println("Door unlocked")
}