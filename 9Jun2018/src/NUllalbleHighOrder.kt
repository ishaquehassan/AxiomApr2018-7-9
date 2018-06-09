fun main(args: Array<String>) {
    myFun1({ })
    myFun2{
        println("lambda")
    }
    myFun3(10){}
}

fun myFun3(a:Int,funName: () -> Unit) {
    funName()
}

fun myFun2(funName: () -> Unit) {
    funName()
}

fun myFun1(funName: (() -> Unit)?) {
    funName?.invoke()
}