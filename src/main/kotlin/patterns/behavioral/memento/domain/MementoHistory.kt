package patterns.behavioral.memento.domain

import patterns.behavioral.memento.domain.model.MementoNode

interface MementoHistory<T> {
    fun save(memo: MementoNode<T>)
    fun undo(): MementoNode<T>?
    fun redo(): MementoNode<T>?
}