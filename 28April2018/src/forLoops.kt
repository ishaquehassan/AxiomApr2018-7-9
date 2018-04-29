fun main(args: Array<String>) {

    for ( x  in 1..10){
        println(x)
    }
    for ( x in 1..100 step 10){
        println("step $x")
    }
    for (x in 100 downTo 1){
        println(x)
    }

    for (x in 100 downTo 50 step  5){
        println(x)
    }

    val list = listOf("a","a","a","a","a","a","a")
    for (i in list.indices){
        println("index $i")
    }
    for ((i,v) in list.withIndex() ){
        println("index $i value $v")
    }


}