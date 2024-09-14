package patterns.behavioral.command

class SmartTv(
    private val name: String
) {
    fun turnOn() = println("Tv off")

    fun turnOff() = println("TV off")

}