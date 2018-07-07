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

    student.name = "Shahzeb"
    student.age = 21
    student.subject = "Android"

    println(human.name)
    println(student.name)
    println(teacher.name)


}
class Teacher :Human(){

}