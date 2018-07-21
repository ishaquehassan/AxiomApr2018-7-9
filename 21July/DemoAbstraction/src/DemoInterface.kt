fun main(args: Array<String>) {

    var human = Human()
    human.jugar()
    human.returnFun()

    //cannot create constructor for interface
//    var human1  = Pkistani()

}

//class Human : Person() ,Pkistani,Pkistani {
class Human : Person(), Pkistani {
    //Abstract Class function
    override fun eat() {
        println("Human is eating")
    }

    override fun returnFun(): Int {
        return 10
    }

    override var name: String = "KOtlin"
    override fun jugar() {
        println("Pakistani Jugar")
    }

}

interface Pkistani {
    var name: String
    fun jugar()
    fun returnFun(): Int

}