package patterns.structural.flyweight.word

class TextElementDataStore {


    val chars = mutableMapOf<String, TextElement>()


    fun getTextElement(
        c: Char,
        color: Color?,
        font: Font?
    ): TextElement {
        val key = "$c-${color?.hex}-${font?.width}"
        return chars.getOrPut(key) { CharacterTextElement(character = c, color = color, font = font) }
    }
}