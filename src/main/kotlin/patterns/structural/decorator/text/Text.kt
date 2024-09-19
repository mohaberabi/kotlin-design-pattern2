package patterns.structural.decorator.text

interface Text {

    fun show(): String
}

class NormalText(private val value: String) : Text {
    override fun show(): String {
        return value
    }
}