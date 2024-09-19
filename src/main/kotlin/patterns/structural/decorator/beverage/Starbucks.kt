package patterns.structural.decorator.beverage


fun main() {


    val beverage = Tea()

    val teaWithMilk = MilkBeverageDecorator(beverage)
    val teaWithMilkSugar = SugarBeverageDecorator(teaWithMilk)


    println(beverage.prepare())

    println(teaWithMilk.prepare())
    println(teaWithMilkSugar.prepare())
}