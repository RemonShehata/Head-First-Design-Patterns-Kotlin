class DecoyDuck : Duck() {
    init {
        flyBehavior = FlyNoWay()
        quackBehavior = MuteQuack()
    }

    override fun display() {
        println("displaying DecoyDuck")
    }
}