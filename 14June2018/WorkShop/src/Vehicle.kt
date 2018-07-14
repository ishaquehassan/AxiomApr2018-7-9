open class Vehicle {
    var name: String = ""
    var brand: String = ""
    var model: Int = 0
    var color: String = ""

    constructor(name: String, brand: String, model: Int, color: String) {
        this.name = name
        this.brand = brand
        this.model = model
        this.color = color
    }

    open fun service() {
        println("Vehicle's service")
    }
}