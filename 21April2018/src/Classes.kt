fun main(args: Array<String>) {

    var personObj1 =  Person1()
    personObj1.name  =  "Kotlin"
    println(personObj1.name)

}
class Person1{
     var name :String = ""
    constructor()
    constructor(name2: String){
        this.name = name2
    }
}