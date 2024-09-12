package patterns.behavioral.iterator

interface Iterator<T> {


    fun next(): T?

    fun hasNext(): Boolean

}