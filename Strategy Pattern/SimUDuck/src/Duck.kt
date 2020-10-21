abstract class Duck {
    open fun quack() {
        println("Duck is quacking")
    }

    fun swim() {
        println("Duck is swimming")
    }

    abstract fun display()

    open fun fly() {
        println("Duck is flying")
    }
}