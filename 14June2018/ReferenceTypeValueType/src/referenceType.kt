fun main(args: Array<String>) {
    var a: Int = 2
    var b = a
    a=5
    println(a)//5
    println(b)//2
    var s1=Student("Kotlin",2)
    var s2 = s1
    s1.name="Java"
    println(s1.name) //Java
    println(s2.name) //Java
    var str1="kotlin"
    var str2=str1
    str1="java"
    println(str1)//java
    println(str2)//

}
class Student(var name:String ,var age:Int){}