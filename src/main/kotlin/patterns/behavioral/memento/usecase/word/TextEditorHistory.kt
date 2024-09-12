package patterns.behavioral.memento.usecase.word

import patterns.behavioral.memento.domain.MementoHistory
import patterns.behavioral.memento.domain.model.MementoNode
import patterns.behavioral.memento.domain.model.StringMemo
import java.util.*

class TextEditorHistory : MementoHistory<String> {


    private val memos = Stack<StringMemo>()
    private var lastSaved: StringMemo? = null

    override fun save(memo: MementoNode<String>) {
        memos.push(memo)
        lastSaved = memo
    }

    override fun undo(): StringMemo? {
        val top = memos.pop()
        lastSaved = top
        return if (memos.isNotEmpty()) {
            val removed = memos.pop()
            removed
        } else {
            null
        }
    }

    override fun redo(): MementoNode<String>? {
        lastSaved?.let {
            memos.push(it)
        }

        return memos.peek()
    }
}