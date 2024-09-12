package solid.interface_segragation


private interface Programmer {
    fun writeCode()
    fun eat()
}


private class HumanProgrammer : Programmer {
    override fun writeCode() {

        println("Coding")
    }

    override fun eat() {
        println("Eating")
    }

}

private class RobotProgrammer : Programmer {
    override fun writeCode() {

        println("Coding")
    }

    override fun eat() {

        // roobot never eats , so why did implement the method it will never ever use

    }

}