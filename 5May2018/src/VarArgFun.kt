fun main(args: Array<String>) {
    val intArrayOf = intArrayOf(1, 2, 4, 6, 5)
//    myFun(1,2,3,4,5,67)
    myFun(*intArrayOf)
    myFun1(1,2,3,45,6, b="B")
}

//fun myFun2(myArray:arr){
//
//}

fun myFun(vararg a:Int){
    for (i in a) {
        println("i = $i")
    }
}
fun myFun1(vararg a:Int,b:String){
    for (i in a) {
        println("i = $i")
    }
    println("B = $b")
}