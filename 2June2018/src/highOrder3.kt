fun main(args: Array<String>) {

    val myLambda: () -> Unit = hFun()
    hFun1(myLambda)

}

fun hFun(): () -> Unit {
    val lambda = {
        println("return Function")
    }
    return lambda
}

fun hFun1(funName: () -> Unit) {

    println("return Function")
    funName()
}