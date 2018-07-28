
fun main(args: Array<String>) {
    var box = Box(1.0, 1.0, 1.0)

    var sq = Square(1.0, 1.0)
    println(sq.length)


//    var interfaces2D=
}


abstract class Geometry(var length: Double, var width: Double) {}
class Box(var height: Double, length: Double, width: Double)
    : Geometry(length, width), IThreeD, ITwoD {
    override fun getArea(): Double {
        return length * width

    }

    override fun getVolume(): Double {
        return length * width * height
    }
}

class Square(length: Double, width: Double)
    : Geometry(length, width), ITwoD {



    override fun getArea(): Double {
        return length * width
    }
}

interface IThreeD {
    fun getVolume(): Double
    fun getVolume2() {}
}

interface ITwoD {
    fun getArea(): Double
}