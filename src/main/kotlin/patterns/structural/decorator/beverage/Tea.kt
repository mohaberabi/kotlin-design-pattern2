package patterns.structural.decorator.beverage

class Tea : Beverage {
    override fun prepare(): String {
        return "Preparing Tea"
    }
}