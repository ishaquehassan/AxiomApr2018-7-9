open class Car(name: String, brand: String, model: Int, color: String)
    : Vehicle(name, brand, model, color) {

    override fun service() {
        println("Car's Cleaning")
    }
}