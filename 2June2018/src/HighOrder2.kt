fun main(args: Array<String>) {
//    var myInt: Int = 12
//    var myInt2: Int = 15

//    val sum: Int = hFun3(myInt, 12)
//    val lambda: (Int, Int) -> Unit = { a: Int, b: Int ->
//        println(a)
//        println(b)
//        println(a + b)
//        a + b
//    }
    val lambda1: (Int) -> Int = { z ->
        println(z)
        z * 2
    }
    hFun4(lambda1)
    hFun4({ a ->
        println("a $a")
        a * 3
    })
}

fun hFun4(hello: (a: Int) -> Int) {
    val hello1 = hello(10)
    println("hFun4 $hello1")
}

fun hFun3(a: Int, b: Int): Int {
    println(a)
    println(b)
    println(a + b)
    return a + b

}