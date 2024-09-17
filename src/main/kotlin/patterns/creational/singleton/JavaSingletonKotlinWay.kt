package patterns.creational.singleton

class JavaSingletonKotlinWay {

    companion object {
        val instance: JavaSingletonKotlinWay by lazy {
            JavaSingletonKotlinWay()
        }
    }

    fun iamSingle() {
        println("Iam Single ")
    }

}

fun main() {
    JavaSingletonKotlinWay.instance.iamSingle()
}