
val Any?.empty: Boolean
    get() {
        if (this == null) {
            return true
        } else {
            return false
        }
    }


fun main(args: Array<String>) {

    var name = null
    println(name.empty)
}