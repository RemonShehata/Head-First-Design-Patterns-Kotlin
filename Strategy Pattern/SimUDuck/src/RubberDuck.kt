class RubberDuck : Duck() {
    init {
        flyBehavior = FlyNoWay()
        quackBehavior = Squeak()
    }

    override fun display() {
        println("displaying RubberDuck")
    }
}