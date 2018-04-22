fun main(args: Array<String>) {
    var age = 10

    when (age){
        20 -> {
            println("Age is 20.")
        }
        10 -> println("Age is 10.")
        in 1..10 -> println("age matached in range")
        !in 1..10 -> println("age matached in range")
        else -> println("Not Matched")
    }

}