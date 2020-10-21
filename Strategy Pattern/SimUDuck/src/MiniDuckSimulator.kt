fun main() {
    val mallardDuck = MallardDuck()
    mallardDuck.performFly()
    mallardDuck.performQuack()

    val modelDuck = ModelDuck()
    modelDuck.performFly()
    modelDuck.flyBehavior = FlyRocketPowered()
    modelDuck.performFly()
}