import mu.KotlinLogging

private val logger = KotlinLogging.logger{}

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

fun main() {
    var index = 0
    var results = false

    logger.info { "Input a Palindrome word" }
    val isitpalindrome = readLine().toString()

    for (reversedIndex in isitpalindrome.length - 1 until 0) {

        results = isitpalindrome[reversedIndex].lowercase() == isitpalindrome[index].lowercase()
        if (!results) {
            break
        }
        index++
    }

    if (!results) {
        logger.info { "$isitpalindrome the word is a palindrome" }
    } else
        logger.info { "$isitpalindrome Sorry the word is not a palindrome" }
}


