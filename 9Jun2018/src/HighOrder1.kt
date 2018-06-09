fun main(args: Array<String>) {

    val myvarName: () -> Unit = hFun()
    myvarName()

}

private fun hFun(): () -> Unit {
    var name: String = "KOtlin"

    val myFun: () -> Unit = {
        var a = 10
        var b = 10
        println("sum of a and b ${a + b}")
        println("MyLambda Function")
    }
//    myFun()
    return myFun
}