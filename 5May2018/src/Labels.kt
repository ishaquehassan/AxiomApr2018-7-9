fun main(args: Array<String>) {

//    abc@for (i in 1..10){
//        if ( i == 5){
//            continue@abc
//        }
//        println("Value of i is $i")
//    }

//    for (i in 1..5){
//        println("value of outer loop $i")
//        loop@for (a in 1..5){
//            if (a == 3) break@loop
//
//            println("value of inner loop $a")
//        }
//    }

    for (i in 1..5){
        println("value of outer loop $i")
        loop@for (a in 1..5){
            if (a == 3) return@loop
            println("value of inner loop $a")
        }
    }

}