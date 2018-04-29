fun main(args: Array<String>) {
    var myArray = Array<Int>(10, init ={0})
    myArray.set(0,0)
    myArray.set(1,1)
    myArray.set(2,2)
    myArray.set(3,3)
    myArray.set(4,4)
    myArray.set(5,5)
    myArray.set(6,6)
    myArray.set(7,7)

    for (i in myArray) {
        println(i)
    }
}