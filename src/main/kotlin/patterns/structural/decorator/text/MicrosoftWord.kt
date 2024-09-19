package patterns.structural.decorator.text

private fun main() {
    val text = NormalText("Hello World")

    println(text.show())

    val bold = BoldTextDecorator(text)
    println(bold.show())
    val italic = ItalicTextDecorator(text)
    println(italic.show())
    val underline = UnderLineTextDecorator(text)
    println(underline.show())

    val italicBold = ItalicTextDecorator(bold)
    println(italicBold.show())
    val underlineItalicBold = UnderLineTextDecorator(italicBold)
    println(underlineItalicBold.show())
}