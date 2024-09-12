package solid.openclose.solution

import solid.openclose.violation.Product


class DiscountCalculatorSolution(
    private val strategy: ProductDiscountStrategy,
) {
    fun getDiscount(
        product: Product,
    ) = strategy.getDiscount(product.price)
}