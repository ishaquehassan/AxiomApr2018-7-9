fun main(args: Array<String>) {
    println(valueCheck(11))
}
fun valueCheck(a:Int):Int{
    if (a <= 10){
        return a
    } else {
        return 10
    }
    return 0
}