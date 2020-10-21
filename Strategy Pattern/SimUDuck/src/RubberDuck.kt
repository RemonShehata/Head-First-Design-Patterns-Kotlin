class RubberDuck : Duck(), Quackable {
    override fun display() {
        println("displaying RubberDuck")
    }

    override fun quack() {
        println("Duck is squeaking")
    }
}