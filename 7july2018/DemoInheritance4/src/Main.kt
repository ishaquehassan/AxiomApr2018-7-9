open class Human{
    var name:String = ""
    var age :Int = 0

}
class Student : Human(){
    var subject:String =""
}

fun main(args: Array<String>) {
//    var a:String  = "10"
//    var b:Int = a.toInt()

    var human = Human()

//    var human1 = human
    var student1:Human = Student()
    var teacher:Human = Teacher()

    var student2 =  student1 as Student
    var st2 = teacher as Student


    student1.name = "Kotlin"

    println(student1.name)
    println(student2.name)
    println(teacher.name)
}
class Teacher :Human(){

}