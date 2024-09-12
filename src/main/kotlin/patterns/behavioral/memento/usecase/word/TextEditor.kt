package patterns.behavioral.memento.usecase.word

import patterns.behavioral.memento.domain.Memento
import patterns.behavioral.memento.domain.model.MementoNode

class TextEditor : Memento<String> {
    private var data: String = ""
    override fun save(): MementoNode<String> = MementoNode(data)
    override fun write(data: String) {
        this.data += data
    }

    override fun data(): String? = data
    override fun restore(memo: MementoNode<String>?) {
        data = memo?.data ?: ""
    }


}