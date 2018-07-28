fun main(args: Array<String>) {

//    var item=InventoryItem()
    var mobile=Mobile("moto",1000.0,"E4")
    mobile.sellItem()
    mobile.buyItem()
}

abstract class InventoryItem(var name: String, var price: Double) {

    abstract var category:String
    abstract fun buyItem()
    abstract fun sellItem()
    fun viewPrice() {
        println("the price is $price")
    }
}

class Mobile(name: String, price: Double, var model: String) : InventoryItem(name, price) {
    override var category: String=""

    override fun sellItem() {
    println("mobile sold")
    }

    override fun buyItem() {
        println("mobile purchased")

    }

}