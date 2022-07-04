package userInput

fun main() {

    // Create a program that asks a user's birth year.
    // Then prints out the user's estimated age.

    print("What year were you born?: ")
    val birthYear = readLine()?:""
    val year = birthYear.toInt()
    val age = 2022 - year
    println("Your age is either ${age - 1} or $age")

}