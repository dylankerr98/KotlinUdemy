package stringsAndVariables

fun main() {

    val dogOneName = "Rocky"
    val dogTwoName = "Gizmo"
    val msg = "My dog's are called $dogOneName & $dogTwoName"
    println(msg)
    println("The string above has a length of ${msg.length}")

    val myCar = "My car won't start"
    println(myCar.substring(3, 6))

    val clientName = "Dylan"
    println("Hello $clientName, welcome to you account")

    val apples = 3
    val oranges = 6
    println("The total number of fruits is ${apples + oranges}")

}