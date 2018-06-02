fun main(args: Array<String>) {

    val mylambda: () -> Unit = {
        println("MyLambda")
    }
    var myInt = 19

    myFun(myInt)
    myFun(19)

    hfun(mylambda)
    hfun({
        println("myLambda Value")
    }
    )


}

fun hfun( funName:() -> Unit ) {

    funName()
//functionName()
}

fun myFun(a:Int) {
    println(a)
}