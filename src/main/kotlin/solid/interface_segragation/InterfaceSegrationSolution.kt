package solid.interface_segragation


private interface Eatable {
    fun eat()
}

private interface SoftwareProgrammer {
    fun writeCode()

}

private class HumanSoftwareProgrammer : SoftwareProgrammer, Eatable {
    override fun writeCode() {

        println("Coding")
    }

    override fun eat() {
        println("Eating")
    }

}

private class RobotSoftwareProgrammer : SoftwareProgrammer {
    override fun writeCode() {

        println("Coding")
    }


}