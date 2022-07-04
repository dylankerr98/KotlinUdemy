package userInput

fun main() {

    // Practice 1.
    print("What is your name?: ")
    val userName = readLine()?:""
    println("Welcome, $userName")

    // Practice 2.
    print("Please enter a number: ")
    val number = readLine()?:""
    println("5 x $number = ${number.toInt() * 5}")

}