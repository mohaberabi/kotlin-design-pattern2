package patterns.structural.decorator.text

open class TextDecorator(
    private val text: Text
) : Text {

    override fun show() = text.show()

}

class BoldTextDecorator(
    private val text: Text
) : TextDecorator(text) {
    override fun show(): String {
        val txt = text.show()
        val boldText = "\u001B[1m$txt\u001B[0m"
        return boldText
    }
}

class ItalicTextDecorator(
    private val text: Text
) : TextDecorator(text) {
    override fun show(): String {
        val txt = text.show()
        val italicText = "\u001B[3m$txt\u001B[0m"
        return italicText
    }
}

class UnderLineTextDecorator(
    private val text: Text
) : TextDecorator(text) {
    override fun show(): String {
        val txt = text.show()
        val underlinedText = "\u001B[4m$txt\u001B[0m"
        return underlinedText
    }
}