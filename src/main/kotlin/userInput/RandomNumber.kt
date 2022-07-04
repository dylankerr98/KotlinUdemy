package userInput

import kotlin.random.Random

fun main() {

    // Print a random integer (no restraints).
    println(Random.nextInt())

    // Print a random integer from 0 to argument (Non-inclusive).
    println(Random.nextInt(11))

    // Print a random integer from first argument to second argument(Non-inclusive).
    println(Random.nextInt(10, 21))

    // The same can be applied to nextDouble().
}