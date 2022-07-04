package stringsAndVariables

import java.util.*

fun main() {

    val myName = "dylan"

    // Return the length of a string.
    println(myName.length)

    // Capitalize the first character of a string.
    println(myName.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })

    // De-capitalize the first character of a string.
    println(myName.replaceFirstChar { it.lowercase(Locale.getDefault()) })


    val spaceyText = "      This string has too many space      "

    // Trim whitespace from the beginning and end of a string.
    println(spaceyText.trim())

    // Get specified character from string.
    println(myName[3])

    // Grab a section of a string (start index, end index) - non-inclusive end.
    println(myName.substring(2, 4))

}
