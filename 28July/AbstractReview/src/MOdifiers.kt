fun main(args: Array<String>) {
    var modifiers = Modifiers()
    println(modifiers.name)
    println(modifiers.name3)

}

open class Modifiers() {
    var name: String = "K0"
    private var name1: String = "K1"
    protected var name2: String = "K2"
    internal var name3: String = "K3"

    
}

class CHildClass : Modifiers() {
    init {
        println(name)
        println(name2)
        println(name3)
    }
}
