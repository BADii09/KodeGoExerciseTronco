fun main() {

//    repeat(10) {
//        println("$it -> Carlo Jay Tronco")
//    }
//    for (counter in 0..10) {
//        println("$counter: for loop")
//    }
//    for (counter in 0 until 10) {
//        println("$counter: for loop")
//    }
//    for (counter in 0..10 step 2) {
//        println("$counter: for loop")}
//
//

        var userinput = "1222952309"
        var index = 0
        var found = false

        do{
            val char = userinput[index]
            println("char: $char")
            index ++

            if (char == '9'){
                found = true
                println("Found a 9")
            }
        }while ((index<userinput.length) && !found)

        while(true){

        }
    }


