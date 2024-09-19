package patterns.structural.flyweight.word

import kotlin.Char

data class CharacterTextElement(

    val character: Char,
    val font: Font?,
    val color: Color?,
) : TextElement {
    override fun render(xPos: Int, yPos: Int) {
        println("$character at $xPos,$yPos with $color,$font")
    }
}

class MsWord {

    private val dataStore = TextElementDataStore()
    fun write(
        text: String,
        font: Font? = null,
        color: Color? = null
    ) {
        for (i in text.indices) {
            val textElement = dataStore.getTextElement(
                c = text.toCharArray()[i],
                color = color,
                font = font
            )
            textElement.render(0 + i, 0)
        }
        println(dataStore.chars.size)
    }
}

fun main() {

    val msWord = MsWord()
    msWord.write("mohab", Font(2), Color(0xFF0000))
    msWord.write("mohab", Font(2), Color(0xFF0000))
    msWord.write("basil", Font(2), Color(0xFF0000))

}
