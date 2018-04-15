fun main(args: Array<String>) {

    var value1: Int = 10
    var value2: Byte = 20

    var result = value1 + value2
    println(result)

    var myint: Int = value2.toInt()

    var myDouble: Double = value2.toDouble()
    var myFloat: Float = value2.toFloat()
    var myShort: Short = value2.toShort()
    var myLong: Long = value2.toLong()
    println("MY BYTe $value2")
    println("MY double $myDouble")
    println("MY SHort $myShort")
    println("MY Float $myFloat")
    println("MY LONG $myLong")

}