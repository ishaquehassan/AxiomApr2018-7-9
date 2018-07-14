fun main(args: Array<String>) {
    var ws = Workshop("Axiom WorkShop")
    println("Welcome to ${ws.name}")
    var c1 = Car("458 Italia", "Ferrai", 2018, "Red")
    ws.doService(c1)
    var t1: Vehicle = Truck("Shezore", "Hyundai", 2001, "White")
    ws.doService(t1)
    var sp1= SportsCar("Bugatti", "Bugatti", 2018, "White")
    ws.doService(sp1)

}