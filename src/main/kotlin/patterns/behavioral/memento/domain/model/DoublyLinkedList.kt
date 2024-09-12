package patterns.behavioral.memento.domain.model

class DoublyLinkedList<T> {


    private var _head: DoubleLinkedNode<T>? = null

    private var _tail: DoubleLinkedNode<T>? = null


    fun addHead(t: T): DoubleLinkedNode<T> {
        val added = DoubleLinkedNode(t)
        if (_head == null) {
            _head = added
            _tail = _head
        } else {
            added.next = _head
            _head?.prev = added
            _head = added
        }
        return added
    }


    fun addTail(t: T): DoubleLinkedNode<T> {
        val added = DoubleLinkedNode(t)
        if (_head == null) {
            _head = added
            _tail = _head
        } else {
            added.prev = _tail
            _tail?.next = added
            _tail = _tail?.next
        }
        return added
    }

    fun remove(
        node: DoubleLinkedNode<T>?,
    ) {
        if (node == _head) {
            val next = _head?.next
            _head = next
            _head?.prev = null

        } else {
            val prev = node?.prev
            val next = node?.next
            prev?.next = next
            next?.prev = prev

        }

    }

    fun isEmpty() = _head == null
    val head get() = _head
}