package stringsAndVariables

fun main() {

    // A variable is like a container for data.

    /*
    There are two different keywords for declaring variables is Kotlin.

    var - is used for variables that are mutable (changeable).
    val - is used for variables that are immutable (unchangeable).

    If you try to change a val variable an error will be thrown.
    */

    // Once a val is created it cannot be changed.
    val myCar = "Bora"
    println(myCar)

    // A var can be updated at any time.
    var age = 24
    println(age)
    age = 25
    println(age)

    // Variables can also be used to create new variables.
    val newAge = age + 1
    println(newAge)

    // Variable type cannot be changed and will throw an error.

}