fun main(args: Array<String>) {


    val myfun2 = hFun2()
    var mystring = myfun2(19)
    hFun1(hFun2())

    var returnFun =
            myFun( //firstArgument
                    {
                        //ReturningFunction
                        {
                            println(it)
                            it.toString()
                        }
                    }
            )
    println(returnFun())
}

fun myFun(funName: (Int) -> (() -> String)): () -> String {
    return funName(10)
}

fun hFun1(funName: (Int) -> String): String {

    println("hFun 1")

    return funName(10)

}

fun hFun2(): (Int) -> String {

    println("HFUN 2")

    return {
        println("lambda")
        it.toString()
    }
}
