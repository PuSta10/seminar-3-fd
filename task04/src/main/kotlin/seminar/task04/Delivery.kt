package seminar.task04

abstract class Delivery(inidestination: String){
    var destination: String = inidestination
    private set

    init {
        require(inidestination.isNotBlank())
    }

    fun label(weightKg: Int): String{
        val price = cost(weightKg)
        return "Доставка в $destination: $price руб."
    }

    abstract fun cost(weightKg: Int): Int
}



class Pickup(destination: String)
    : Delivery(destination) {
    override fun cost(weightKg: Int): Int {
        require(weightKg > 0)
        return 0
    }
}

class CourierDelivery(destination: String)
: Delivery(destination) {
    override fun cost(weightKg: Int): Int {
        require(weightKg > 0)
        return 200+weightKg*50
    }
}

class ExpressDelivery(destination: String, distanceKmini: Int)
: Delivery(destination) {
    var distanceKm: Int = distanceKmini
        private set

    init{
        require(distanceKm > 0)
        require(distanceKm <= 10)
    }
    override fun cost(weightKg: Int): Int {
        require(weightKg > 0)
        return 300+weightKg*80+distanceKm*20
    }
}