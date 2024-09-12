package solid.openclose.solution

interface ProductDiscountStrategy {

    fun getDiscount(price: Double): Double
}


class ElectronicsDiscountStrategy : ProductDiscountStrategy {
    override fun getDiscount(price: Double): Double = price * 0.1
}

class ClothingDiscountStrategy : ProductDiscountStrategy {
    override fun getDiscount(price: Double): Double = price * 0.19
}

class BooksDiscountStrategy : ProductDiscountStrategy {
    override fun getDiscount(price: Double): Double = price * 0.20
}