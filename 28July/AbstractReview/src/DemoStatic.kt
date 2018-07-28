fun main(args: Array<String>) {

    StaticClassDemo.name = "JAVA"
    println(StaticClassDemo.name)
    println(StaticClassDemo.box.length)
    println(StaticClassDemo.box.height)
    var staticClassObject = StaticClassDemo.Companion.StaticClass()
    staticClassObject.staticClassMember = 12
    println(staticClassObject.staticClassMember)

}

class StaticClassDemo{

    var name= "Java"
    companion object {
        var name: String = "Kotlin"
        var box = Box(1.0,1.0,1.0)

        class StaticClass{
            var staticClassMember = 0
        }

    }
}
