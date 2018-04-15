fun main(args: Array<String>) {
    var age = 10
    var age1:Int ? = null
//    var value:Float = null

    var result = age + (age1 ?:0)

    println(result)

}
