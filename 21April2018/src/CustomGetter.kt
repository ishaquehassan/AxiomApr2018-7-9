fun main(args: Array<String>) {

    var rectObj = Rectagle(10,20)
    println(rectObj.isSquare)

    println(rectObj.heigt)



}
class Rectagle{

    val heigt:Int = 0
    val width:Int = 0

    constructor(height:Int,width:Int)

    val isSquare: Boolean
    get()  {
        return heigt==width
    }
}