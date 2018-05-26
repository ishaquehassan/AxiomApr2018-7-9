fun main(args: Array<String>) {
    var lmbdaFun: () -> Unit = {
        println("Hello Lambda")

    }


    lmbdaFun()

    var myLambda = {
        println("Hello Lambda")

    }
    var lambda1: (a:Int) -> Unit = { z:Int ->
        println(z)
    }

    lambda1(10)
    var lambda3: (a:Int  , b:Int) -> Unit = {
        a:Int , b:Int ->
        println(a)
        println(b)
        println(a+b)
    }
    lambda3(3 , 4 )

    filter@ var lambda2:(d:Int,b:Int)-> Int = { a:Int,y:Int ->
        var sum = a+y
        if (true){
             return@filter sum
        }
         0
    }


}



