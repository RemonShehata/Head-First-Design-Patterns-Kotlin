abstract class Duck {
    protected lateinit var flyBehavior: FlyBehavior
    protected lateinit var quackBehavior: QuackBehavior

    fun swim() {
        println("Duck is swimming")
    }

    abstract fun display()

    fun performQuack() {
        quackBehavior.quack()
    }

    fun performFly() {
        flyBehavior.fly()
    }
}
