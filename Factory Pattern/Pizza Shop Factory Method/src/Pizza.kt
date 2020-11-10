abstract class Pizza {
    var name: String? = null
    var dough: String? = null
    var sauce: String? = null
    var toppings = mutableListOf<String>()
    fun prepare() {
        println("Preparing $name")
        println("Tossing dough...")
        println("Adding sauce...")
        println("Adding toppings: ")
        for (i in toppings.indices) {
            println(" ${toppings[i]}")
        }
    }

    fun bake() {
        println("Bake for 25 minutes at 350")
    }

    open fun cut() {
        println("Cutting the pizza into diagonal slices")
    }

    fun box() {
        println("Place pizza in official PizzaStore box")
    }

    override fun toString(): String {
        val display = StringBuffer()
        display.append("---- $name ----\n")
        display.append("$dough \n")
        display.append("$sauce \n")
        for (i in toppings.indices) {
            display.append("${toppings[i]}")
        }
        return display.toString()
    }
}
