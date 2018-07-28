fun main(args: Array<String>) {
    var testClss = TestClass("Kotlin", 12)
    var testClss1 = testClss
    testClss1.name1 = "Asd"

    println(testClss.name1)
    println(testClss1.name1)
    println(testClss.age)
    println(testClss.toString())
    println(testClss.equals(testClss1))

}

data class TestClass(var name: String, var age: Int) {
    var name1 = "JAVA"
}