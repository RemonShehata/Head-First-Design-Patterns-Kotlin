class MallardDuck : Duck(), Flyable, Quackable {
    override fun display() {
        println("displaying MallardDuck")
    }

    override fun fly() {
        println("MallardDuck is flying")
    }

    override fun quack() {
        println("MallardDuck is qucking")
    }
}