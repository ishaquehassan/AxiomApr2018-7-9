var name: String = ""
    get() {
        println("you just called name")
        return field
    }
    set(value) {
        println("name is updated")
        field = "Mr $value"
    }

var CNIC : String = "000000"

set(value){
    field = value
    println("cnic is changed to $field")
}

fun main(args: Array<String>) {

    name = "arbaz"
    println(name)

//    CNIC = "33543545"
//    println(CNIC)
}