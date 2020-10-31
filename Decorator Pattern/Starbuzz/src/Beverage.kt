abstract class Beverage {
    open var description = "Unknown beverage"
    var hasMilk = false
    var hasSoy = false
    var hasMocha = false
    var hasWhip = false


    open fun getCost(): Float {
        var cost = 0f

        if (hasMilk) cost += 0.10f

        if (hasSoy) cost += 0.20f

        if (hasMocha) cost += 0.30f

        if (hasWhip) cost += 0.40f

        return cost

    }
}