fun main(args: Array<String>) {
    val lambda: Int.() -> Unit = {

        println(this)
    }

    val sumFun: Int.(a: Int) -> Unit = {a->

        println(  plus(a) )
    
    }
    10.sumFun(10)

    lambda(10)
    10.lambda()

}

fun myFun1(a: Int) {

}