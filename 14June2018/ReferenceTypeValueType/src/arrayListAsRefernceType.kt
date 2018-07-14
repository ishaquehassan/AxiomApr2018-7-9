fun main(args: Array<String>) {
    var arr1= arrayListOf<Int>(1,2,3,5)
    var arr2= arr1
    arr1.add(54)
    arr1.add(12)
    println(arr1)//1,2,3,5,54,12
    println(arr2)//1,2,3,5
}