fun main(args: Array<String>) {

    var student = Student4("kotlin", 12, 100)
    println(student.name)

}

class Student4(name: String, rolNum: Int) {
    var name: String = ""
    var age: Int = 0
    var rolNum: Int = 0
    var classs: Int = 0

    init {
//        println(name)
        this.name = name
        this.rolNum = rolNum
    }

    constructor(name: String, age: Int, rolNum: Int) : this(name, rolNum) {
        this.age = age
    }

}

//
//public class myClass {
//
//    public myClass(name:String,age:int,email:String) {
//        this(age, email)
//        this.name = name;
//    }
//    public myClass(age:int,email:String) {
//        this.age = age;
//        this.email = email;
//    }
//
//}