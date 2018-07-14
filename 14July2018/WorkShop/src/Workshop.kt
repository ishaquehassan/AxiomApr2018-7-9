class Workshop {
    var name: String

    constructor(name: String) {
        this.name = name
    }

    fun doService(v: Vehicle) {
        v.service()
        println("${v.name} is Cleaning")
    }

//    fun doCarService(c: Car) {
//        c.service()
//        println("${c.name} is cleaning")
//    }
//
//    fun dotruckService(t: Truck) {
//        println("${t.name} is cleaning")
//
//    }
}