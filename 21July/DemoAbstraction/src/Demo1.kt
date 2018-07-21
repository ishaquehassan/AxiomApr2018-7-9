fun main(args: Array<String>) {
//    var person = Person() //Cannot create object
    var pakistani = Pakistani()
    pakistani.playing()
    pakistani.eat()

    var obj:Person = Pakistani()
    println(obj.playing())

    var pakistan1:Pakistani = obj as Pakistani //??????

}

abstract class Person(){
    abstract var name:String
    var age:Int = 0

    abstract fun eat()
    open fun playing(){
        println("I am in Person Class")
    }
}
abstract class Person1():Person(){
    abstract override var name:String
}
class Pakistani:Person1(){
    override var name: String = "Kotlin"
    override fun eat() {
        println("$name is eating")
    }

    override fun playing() {
        println("Pakistan is Playing")
    }

}