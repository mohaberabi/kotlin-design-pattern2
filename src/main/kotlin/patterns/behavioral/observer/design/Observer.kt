package patterns.behavioral.observer.design

interface Observer<T> {

    fun update(t: T)

}

interface BehaviouralSubject<T> {
    fun subscribe(observer: Observer<T>)
    fun unsubscribe(observer: Observer<T>)
    fun notifyAll(t: T)
}