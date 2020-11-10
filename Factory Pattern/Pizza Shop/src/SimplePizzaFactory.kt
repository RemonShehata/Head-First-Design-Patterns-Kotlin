class SimplePizzaFactory {
    fun createPizza(type: String): Pizza? {
        val pizza = when (type) {
            "cheese" -> CheesePizza()
            "greek" -> GreekPizza()
            "pepperoni" -> PepperoniPizza()
            else -> null
        }
        return pizza
    }
}
