fun main() {
    var increment = 0
    var decrement = 0
    var plusplus = 0
    var minusminus = 0

    increment += 2
    println("Increment: $increment")
    decrement -= 2
    println("Decrement: $decrement")

    println("Plus plus: $plusplus++")
    println("Minus minus: $minusminus--")

    println("Plus plus: ${plusplus++}")
    println("Minus minus: ${--minusminus}")
}