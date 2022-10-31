//Using Activity 01 - B, Implement a process where someone can borrow a book.
//User: Librarian
//Goal: Keep track book borrowed, who borrowed and how long it can be borrowed.
//Scope :
//Data Structures

fun main() {


    var Books: Array<String> = arrayOf ("Encylopedia,Dictionary, Almanac, Thesaurus, Manga")
    var Author: Array<String> = arrayOf("Matt Murdoc, Tony Stark, Otto Octavious, Harry Osborn, Eiichiro Oda")
    var Color: Array<String> = arrayOf("Yellow, Orange, Black, Red, Green")
    var Quantity: Array<Int> = arrayOf(2,5,7,1,75)
    var BookISDN: Array<Int> = arrayOf(101, 102, 103, 104, 105)

    for (Books in Books){
        println("Books: $Books")
    }
    for (Author in Author){
        println("Author: $Author")
    }
    for (Color in Color){
        println("Color: $Color")
    }
    for (Quantity in Quantity){
        println("Quantity: $Quantity")
    }
    for (BookISDN in BookISDN){
        println("BookISDN: $BookISDN")
    }



}