class Student3(var name:String = "Java",var age:String="")

fun main(args: Array<String>) {
    var student = Student3()
    println(student.name)
    var student2 = Student3("Kotlin")
    println(student2.name)
    var student3 = Student3("20")
    println(student3.name)
    println(student3.age)



}