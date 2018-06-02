fun main(args: Array<String>) {
    val lambda1:(a:Int)-> Unit =  {
        println(it +  10 )
    }
    hFun1(lambda1)
}
fun hFun1(funName:(a:Int)->Unit){
    funName(10)
}