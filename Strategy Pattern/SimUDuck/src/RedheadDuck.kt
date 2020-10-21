class RedheadDuck : Duck() {
    init {
        flyBehavior = FlyWithWings()
        quackBehavior = Quack()
    }

    override fun display() {
        println("displaying RedheadDuck")
    }
}