fun main(args: Array<String>) {

    var x = 0

    while (x <= 10) {

        println("x is $x")
        x++
    }


    var x1 = 0
    do {
        println("DO Some Work here $x1")
        x1++
    } while (x1 <= 10)

    var x2 = 0

    while (x2 <= 10) {

        if (x2 == 8)
            break

        println("x2 value $x2")
        x2++

    }
    println("")



}