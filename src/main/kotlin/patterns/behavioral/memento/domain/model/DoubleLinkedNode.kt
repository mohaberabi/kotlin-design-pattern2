package patterns.behavioral.memento.domain.model

data class DoubleLinkedNode<T>(
    val data: T,
    var next: DoubleLinkedNode<T>? = null,
    var prev: DoubleLinkedNode<T>? = null,
)
