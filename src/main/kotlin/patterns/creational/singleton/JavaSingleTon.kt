package patterns.creational.singleton

class JavaSingleTon private constructor() {


    companion object {
        @Volatile
        private var instance: JavaSingleTon? = null

        fun getInstance(): JavaSingleTon {
            synchronized(this) {
                if (instance == null) {
                    instance = JavaSingleTon()
                }
            }
            return instance!!
        }
    }

    fun iamSingle() {
        println("Iam Single ")
    }


}

fun main() {


    JavaSingleTon.getInstance().iamSingle()
}