package patterns.structural.decorator.beverage

open class BeverageDecorator(
    private val beverage: Beverage
) : Beverage {
    override fun prepare(): String {
        return beverage.prepare()
    }


}


class SugarBeverageDecorator(
    private val beverage: Beverage
) : Beverage, BeverageDecorator(beverage) {


    override fun prepare(): String {
        return super.prepare() + "With Sugar"
    }
}

class MilkBeverageDecorator(
    private val beverage: Beverage
) : Beverage, BeverageDecorator(beverage) {


    override fun prepare(): String {
        return super.prepare() + "With Milk"
    }
}

class LemonBeverageDecorator(
    private val beverage: Beverage
) : BeverageDecorator(beverage), Beverage {

    override fun prepare(): String {
        return super.prepare() + "with lemon"
    }
}