abstract class Beverage {
    open var description = "Unknown beverage"

    abstract fun getCost(): Float
}