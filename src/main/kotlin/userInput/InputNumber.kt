package userInput

fun main() {

    // Input is read as a String which can be converted into integers.

    // The readLine() command can return nothing (null).

    // ?:"" should be used so null is never returned, it returns an empty String instead.
    print("Input a number: ")
    val userInput = readLine()?:""
    println("You wrote: ${userInput.toInt()}")

}
