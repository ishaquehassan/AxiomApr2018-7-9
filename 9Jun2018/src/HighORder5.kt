fun main(args: Array<String>) {
    val lambda:(Int,String,Int)-> Int = {a,_,b ->
        a+b
    }

    lambda(12,"",12)
}