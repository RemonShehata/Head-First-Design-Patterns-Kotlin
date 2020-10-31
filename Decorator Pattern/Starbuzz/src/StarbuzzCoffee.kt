fun main() {
    val beverage = Espresso()
    println("${beverage.description}  $${beverage.getCost()}")

    var beverage1: Beverage = DarkRoast()
    beverage1 = Mocha(beverage1)
    beverage1 = Mocha(beverage1)
    beverage1 = Whip(beverage1)
    println("${beverage1.description}  $${beverage1.getCost()}")

    var beverage2: Beverage = HouseBlend()
    beverage2 = Soy(beverage2)
    beverage2 = Mocha(beverage2)
    beverage2 = Whip(beverage2)
    println("${beverage2.description}  $${beverage2.getCost()}")

}