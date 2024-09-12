package patterns.behavioral.memento.domain.model


typealias StringMemo = MementoNode<String>

data class MementoNode<T>(val data: T? = null)