import mu.KotlinLogging

//Using Activity 01 - B, Implement a process where someone can borrow a book.
//User: Librarian
//Goal: Keep track book borrowed, who borrowed and how long it can be borrowed.
//Scope :
//Data Structures <List>
private val logger = KotlinLogging.logger{}
fun main() {
    var books: List<String> = mutableListOf<String>("Almanac,Dictionary, Animal Kingdom, History, Geology")
    var booksAvailable: ArrayList<String> = books as ArrayList<String>
    var studentname: String? = null
    var studentID: Int? = null

    logger.info { "Input Student Name" }
    studentname = readLine().toString()

    logger.info { "Input Student I.D." }
    studentID = readLine().toString().toInt()

    logger.info { "Select book to barrow: $books" }

    logger.info { "Input the book here:" }
    val enterbook = readLine().toString()

    var borrowedBooks: List<String> = mutableListOf<String>("book1,book2")
    logger.info { " $enterbook is borrowed by $studentname with a student I.D. $studentID" }

    logger.info { " Due to limited books, $enterbook book borrowed by $studentname has 5 days of borrowing" }


}
