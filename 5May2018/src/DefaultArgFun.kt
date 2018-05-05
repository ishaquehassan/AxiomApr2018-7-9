fun main(args: Array<String>) {

    var age = 12
    defargFun(19,15)
    defLastArg(18)
    arg(20)

}

fun defargFun(a:Int = 10,b:Int){
    println("Value of a is $a b = $b")
}
fun defLastArg(firstArg:Int,secArg:Int = 19){
    println("Value of a is $firstArg b = $secArg")
}
fun arg(a:Int = 10,b:Int = 20,name:String = "Axiom"){
    println("value of a $a b = $b name = $name")
}
fun arg(){
    println("WithoUtArgFun")
}