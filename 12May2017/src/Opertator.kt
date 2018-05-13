fun main(args: Array<String>) {

    var name = "arbaz"

    var name2 = "kamran"


    println(1.compareTo(3))
    println(3.compareTo(1))
    println(1.compareTo(1))

}

operator infix fun String.compareTo(x: String):Int{


    return 0

}