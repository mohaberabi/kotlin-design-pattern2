package patterns.behavioral.command

class SmartLight(
    private val name: String
) {


    fun turnOn() = println("Light on")
    fun turnOff() = println("Light off")
}