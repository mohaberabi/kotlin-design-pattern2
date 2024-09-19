package patterns.structural.decorator.beverage

class Milk : Beverage {
    override fun prepare(): String {

        return "Preparing Milk Beverage"
    }
}