package stringsAndVariables

fun main() {

    val dogOneName = "Rocky"
    val dogTwoName = "Gizmo"


    // Variables can be easily inserted into a string using templates.
    println("My first dog's name is $dogOneName")
    println("My second dog's name is $dogTwoName")

    // Strings can also contain expressions, they are evaluated and concatenated.
    // Expressions require braces.
    println("I have ${1+1}")

}