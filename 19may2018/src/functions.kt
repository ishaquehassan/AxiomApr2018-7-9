fun main(args: Array<String>) {

    val intArrayOf = intArrayOf(1, 2, 3, 23, 23)


    var abc: (Int) -> String = { number ->
        println("Hello ${number }")
        "Hello ${number}"
    }
//    myForEach(intArrayOf, abc)

    myForEach(intArrayOf,{number ->
        val i = number * 2
        println(i)
        i.toString()

    })
//    println(abc(19))
    intArrayOf.forEach {
        println(it)
    }

}

fun myForEach(a: IntArray, userOp: (Int) -> String) {

    for (i in a) userOp(i)

}

fun myFun(a: Int): String {

    return "Hello ${a + 1}"
}