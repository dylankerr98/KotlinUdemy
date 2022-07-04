package userInput

fun main() {

    // User input can come from many sources, one way is from the command line.

    // In Kotlin the readLine() function is used to get this input.

    print("Please enter your name: ")
    val userName = readLine()?:""
    println("Your name is: $userName")

}

