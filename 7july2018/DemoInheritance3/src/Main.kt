open class Human{
    var name:String = ""
    var age :Int = 0

}
class Student : Human(){
    var subject:String =""
}

fun main(args: Array<String>) {
    var human = Human()
    var student:Human = Student()
    var teacher:Human = Teacher()

    human.name = "Kotlin"

//    cannot call bcz of ref
//    student.subject = "Android"

    println(human.name)
    println(student.name)

    println(teacher.name)


}
class Teacher :Human(){

}