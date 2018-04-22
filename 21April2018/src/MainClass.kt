
fun main(args: Array<String>) {

    println("HelloWorld")
    simpleFunction(23)
    println(max(10,20))

}
fun max(a:Int,b:Int):Int{
    if (a>b){
        return a
    } else {
        return b
    }
}

fun simpleFunction(a:Int){
    println("Value of Int is $a")
}