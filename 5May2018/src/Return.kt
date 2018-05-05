fun main(args: Array<String>) {

    var returnValue = returnFun(5)
    println("REturn value is $returnValue")
    println(returnFun(10))
}
fun returnFun(a:Int):Int{
    println("My Value is $a")
    return a+5
}