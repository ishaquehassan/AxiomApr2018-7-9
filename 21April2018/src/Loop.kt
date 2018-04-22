fun main(args: Array<String>) {

    var arrayList = arrayListOf<Any>()
    arrayList.add("Kotlin1")
    arrayList.add(12)
    arrayList.add("Kotlin3")
    arrayList.add(123)
    arrayList.add("Kotlin5")
    arrayList.add("Kotlin6")

    for((a,v) in arrayList.withIndex()){
        println("Index = $a , value = $v")
    }

    for (variable in arrayList) {
        println(variable)
    }
    for (a in 1..10){
        println(a)
    }
    var userinput = 20

//    var steps = 0

    for (a in userinput..100 step 4){
//        steps = 4
        println(a)
    }

    for (a in 100 downTo 0 step 5){
        println(a)
    }




}