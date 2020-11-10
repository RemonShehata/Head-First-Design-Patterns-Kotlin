class PizzaStore(private val simplePizzaFactory: SimplePizzaFactory) {
    fun orderPizza(type: String): Pizza? {
        val pizza = simplePizzaFactory.createPizza(type)
        pizza?.prepare()
        pizza?.bake()
        pizza?.cut()
        pizza?.box()
        return pizza
    }
}
