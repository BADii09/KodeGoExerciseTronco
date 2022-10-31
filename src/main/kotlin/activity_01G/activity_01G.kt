import java.util.*

//Create an application that will accept 1 string.
//Your application will print “Palindrome” if the string is a palindrome.
//Scope :
//String
//Loops
//
//Ex :
//GIRAFARIG - Palindrome
//101 - Palindrome
//RACECAR - Palimdrome
//GATE - Not Palindrome


fun isPalindromeString(inputStr: String): Boolean {
    val sb = StringBuilder(inputStr)

    val reverseStr = sb.reverse().toString()

    return inputStr.equals(reverseStr, ignoreCase = true)
}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    println("Input a word : ")
    val inString: String = sc.nextLine()

    if (isPalindromeString(inString)) {
        println("$inString is a Palindrome String")
    } else {
        println("$inString is not a Palindrome String")
    }
}
