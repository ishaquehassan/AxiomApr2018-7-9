fun IntArray.swap(index1: Int, index2: Int) {

    var temp = this[index1]
    this[index1] = this[index2];
    this[index2] = temp
}

fun main(args: Array<String>) {
    var arr = intArrayOf(3, 4, 5)

    for (i in arr) {
        print("$i \t")
    }
    println()
    arr.swap(0, 1)


    println(45 minus 23)


    var a = 25
    var b = 24

    println(a - b)


}

 infix fun Int.minus(x: Int) = this + x

