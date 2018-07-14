class Truck(name: String, brand: String, model: Int, color: String)
    : Vehicle(name, brand, model, color) {
    override fun service() {
        println("Truck's Cleaning")
    }
}