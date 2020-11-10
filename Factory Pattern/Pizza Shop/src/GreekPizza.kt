class GreekPizza : Pizza() {
    override fun prepare() {
        println("Preparing GreekPizza...")
    }

    override fun bake() {
        println("Baking GreekPizza...")
    }

    override fun cut() {
        println("Cutting GreekPizza...")
    }

    override fun box() {
        println("Boxing GreekPizza...")
    }
}
