fun main(args: Array<String>) {
    var abc = 12
//    abc = "kamran"

    var myName:Any = "abc"
    myName = 5
    myName = true
//    println(myName.length)

    when(myName){
        is String ->{
            println(myName.length)
            println(myName.get(0))
        }
        is Int -> {
            println("Value is ${myName+5} ")
        }
        is Double -> println("Value is $myName")
        is Long -> println("Value is $myName")
        else -> println("Value is $myName")
    }
//    println(myName.length)
}
