package patterns.behavioral.observer.design

import patterns.behavioral.observer.model.Product

class ProductSubject : BehaviouralSubject<Product> {
    private val observers = mutableSetOf<Observer<Product>>()
    override fun subscribe(observer: Observer<Product>) {
        observers.add(observer)
    }

    override fun unsubscribe(observer: Observer<Product>) {
        observers.remove(observer)
    }

    override fun notifyAll(t: Product) = observers.forEach { it.update(t) }

}