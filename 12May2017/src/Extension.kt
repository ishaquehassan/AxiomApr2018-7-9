fun main(args: Array<String>) {
    var name = "arbaz"

    var len = name.length

    var address = "karachi"

    println(len)

    name.printThis()

    address.printThis()

    var value = 23;

    println(34.plus(3))

}

fun String.printThis() {
    println(this)
}

fun Int.plus(a: Int) = this + a;
