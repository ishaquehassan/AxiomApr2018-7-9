fun main(args: Array<String>) {
    var student1 = Student()
    student1.name = "Kotlin"
    student1.age = 10
    student1.rolNumber = 100
    println(student1.name )
    println(student1.age)
    println(student1.rolNumber)
}

class Student{
    var name :String = ""
    var age :Int = 0
    var rolNumber :Int = 0


}
