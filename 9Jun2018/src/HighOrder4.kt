val x = 12

fun main(args: Array<String>) {

    println(::x.get())
    println(::x.name)

    highFun(::myFun)

    val mylist = arrayOf(1, 2, 3, 4, 5, 6, 7)

    val filter = mylist.filter(::isODD)
    print(filter)
}

fun isODD(x: Int) = x % 2 != 0 

fun myFun() {
    println("Simple Fun")
}

fun highFun(funName: () -> Unit) {

    funName()
}