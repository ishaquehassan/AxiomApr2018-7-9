fun main(args: Array<String>) {
    var variableA:String = "Hello"
    val variableB = "Kotlin"

    variableA = "Kotlin"
//    variableB  = " Kotlin"

    var anyTypeVar : Any = "Kotlin"
    println(anyTypeVar)
    anyTypeVar  = 1
    println(anyTypeVar)

    println("Value of AnyTypeVar is $anyTypeVar")

    var personObj = Person("HELLO")
    println(personObj.name)


}

class Person(val name: String)