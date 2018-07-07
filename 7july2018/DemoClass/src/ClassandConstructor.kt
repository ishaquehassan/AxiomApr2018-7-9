class Student(clas:String){
    var name: String= ""
    var age:Int = 0
    var clas:String = ""
    var rollnum:Int = 0
    init {
        this.clas = clas

    }
    constructor(name:String, age:Int,clas:String):this(clas){
        this.name = name
        this.age = age
    }
    constructor(name:String, age:Int,clas:String,rollnum:Int):this(name,age,clas){
        this.rollnum = rollnum
    }


    fun printValues(){
        println("$name $age $clas  $rollnum")
    }

}

fun main(args: Array<String>) {



    var student1:Student =Student("Kotlin", 1,"Android",121)
//    student1.name = "Murtaza"
//    student1.age = 20
//    student1.clas = "Android"

    student1.printValues()

    println(student1.name)
    println(student1.age)
    println(student1.clas)

//    var student2 = Student()
//
//    println(student2.name)
//    println(student2.age)
//    println(student2.clas)

}
