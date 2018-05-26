fun main(args: Array<String>) {

    hFun({
        println("Lambda")
    })
    hFun2 ({
        println("In Lambda Body")
        //Last expression is returning expression
        12
    })
    myFun(12)
}
fun myFun(a:Int){

}

fun hFun2(function: () -> Int){
    val a = function()
    println(a)
}

fun hFun(function: () -> Unit) {
    function()
}

