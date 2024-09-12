package patterns.behavioral.memento.domain

import patterns.behavioral.memento.domain.model.MementoNode


interface Memento<T> {
    fun write(data: T)
    fun save(): MementoNode<T>
    fun restore(memo: MementoNode<T>?)
    fun data(): T?
}