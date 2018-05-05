fun main(args: Array<String>) {

    val c:Char = 'a'

    myfun("Axiom","Kotlin")
    myfun("Axiom","Kotlin",10)
    myfun(age = 20)
    myfun(email = "asd@g.com",firstName = "abc",age = 21,lastName = "def")

    myfun1(lastName = "def",age = 0,firstName = "abc")
}

fun myfun(firstName:String= "",lastName:String= "",age:Int= 0,email:String= ""){

}
fun myfun1(firstName:String,lastName:String,age:Int){

}