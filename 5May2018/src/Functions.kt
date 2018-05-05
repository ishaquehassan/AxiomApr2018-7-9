fun main(args: Array<String>) {
    myFunction()
    parameterizedFun(10)
    parameterizedFun(10,"Axiom")

}
fun parameterizedFun(a:Int){
    println("value is $a")
}
fun parameterizedFun(abc:Int,name:String){
    println("value is $abc name is $name")
}

fun myFunction():Unit{
    println("MY Function")
}