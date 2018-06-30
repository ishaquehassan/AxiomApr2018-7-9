fun main(args: Array<String>) {
    var student1 = Student2("Kotlin2",12,122)
    println(student1.name)
    println(student1.rollnum)
    println(student1.age)


}
class Student2(name:String,age1:Int,rolnum1:Int){
    var name = name
    var age = age1
    var rollnum = rolnum1

//    init {
//        this.name = name
//        age = age1
//        rollnum = rolnum1
//    }

}