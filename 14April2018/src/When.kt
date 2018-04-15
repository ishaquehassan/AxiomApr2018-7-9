fun main(args: Array<String>) {

    val age: Int = 11

    when (age) {
        5 -> println("vale is 5")
        6 -> println("vale is 6")
        7 -> println("vale is 7")
        8 -> println("vale is 8")
        10 -> {
            println("vale is 10")
            println("vale is 10")
            println("vale is 10")
        }
        else -> println("not matched")
    }
}