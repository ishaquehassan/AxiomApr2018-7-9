open class Human {
    var name: String = ""
    var age: Int = 0
    var gender: String = ""
    open fun eat() {
        println("Human is Eating")
    }
}

fun main(args: Array<String>) {

    var human = Human()
    human.name = "Kotlin"
    println("name of human ${human.name}")
    var student = Student()
    student.name = "Jawwad"
    println("name of student ${student.name}")
    student.eat()

    var s1:Human = Student()
    s1.eat()
    s1.name = "java"
    println("${s1.name}")
    var s2 = s1 as Student
    s2.name =  "Java 2"
    println(s2.name)
    s2.eat()
}

class Student : Human() {
    var id: String = ""
    var classs: String = ""

    override fun eat(){
        println("Student is eating")
    }

}