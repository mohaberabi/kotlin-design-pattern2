package patterns.behavioral.memento.usecase.word

import patterns.behavioral.memento.domain.Memento
import patterns.behavioral.memento.domain.MementoHistory

class MicrosoftWord(
    private val editor: Memento<String> = TextEditor(),
    private val history: MementoHistory<String> = TextEditorHistory()
) {


    fun write(data: String) {
        editor.write(data)
        val saved = editor.save()
        history.save(saved)
    }

    fun undo() {
        val previous = history.undo()
        editor.restore(previous)
    }

    fun redo() {
        val redo = history.redo()
        editor.restore(redo)
    }

    fun data() = editor.data()
}

private fun main() {

    val word = MicrosoftWord()


    word.write("mohab")
    println(word.data())
    word.undo()
    println(word.data())
    word.redo()
    println(word.data())
    word.undo()
    println(word.data())
    word.write("loser1")
    println(word.data())
    word.write("loser2")
    println(word.data())

    word.write("loser3")
    println(word.data())
    word.undo()
    println(word.data())
    word.redo()
    println(word.data())
}