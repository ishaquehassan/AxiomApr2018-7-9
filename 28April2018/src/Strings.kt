fun main(args: Array<String>) {
    var a = "Kotlin"
    println("$a\tHello")
    println("$a\n AXIOM ")

    a = a + " Kamran"
    println(a)
    for (c in a){
        println("$c")
    }
    println("value at index 2 ${a.get(2)}")
    println("value at index 0 ${a.get(0)}")
    println('K' in a)

    var myst:String = "Hello WOrld \n Hi \t Bye   ('')"

    val text = """
    >            Tell me and I forget.
    t Teach me and I \t remember.
    >Involve me and I learn.
    >(Benjamin Franklin)
    """.trimMargin("t")

    println(text)
    val text1 = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()

    println(text1)

}