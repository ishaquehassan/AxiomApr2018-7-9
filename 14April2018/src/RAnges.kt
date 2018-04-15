fun main(args: Array<String>) {
     var age : Int = 30

    when (age){
        in 1..10 -> println("match in range 1 to 10")
        in 10..20 -> println("match in range 11 to 20")
        !in 10..30 -> println("not in range 10 to 20")
        2,30 -> println("matched given value")
        else -> println("Not matched")
    }

    val myByte:Byte = 50

    when(myByte){
        in 1..150 -> println("found in 1 to 129")
        else -> println("Not matched")
    }
}