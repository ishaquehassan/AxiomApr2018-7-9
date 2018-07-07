open class Human{
    var name:String = ""
    var age :Int = 0

}
class Student : Human(){
    var subject:String =""

}

fun main(args: Array<String>) {
    var human = Human()
    var student = Student()
    var teacher = Teacher()

    human.name = "Kotlin"

    println(human.name)
    println(student.name)
    println(teacher.name)


}
class Teacher :Human(){

}