class PizzaStore {
    fun orderPizza(): Pizza {
        val pizza = Pizza()
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }
}
