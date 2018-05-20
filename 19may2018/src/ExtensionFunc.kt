fun String.getlength(a:Int,b:Int,c:Int):Int{
    println("PARAMAS $a $b $c")
    return this.length
}
fun IntArray.getSize():Int{
    return this.size
}

infix fun Int.myPlus(a:Int):Int{
    return a
}
var name = ""
    get() {
        return field
    }
    set(value) {
        field = value+"0000"

    }
val String.applyPrefix:String
    get() {

        return "123 "+this
    }

fun main(args: Array<String>) {

     name = "KOTLIN"

    println(name.applyPrefix)


    val a = name.getlength(2,3,4)

    var array = intArrayOf(2,23,21,214,123,123,123,213,213)
    array.getSize()
    var myint = 2
    var myint2 = 4
    val i = myint + myint2
    myint.plus(myint2)

    if (true or false){

    }

    myint.myPlus(4)

    myint myPlus 4



}