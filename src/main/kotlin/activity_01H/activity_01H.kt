//Create an application that will accept 2 Integers.
//It will identify the lower value and bigger value of the two inputs.
//Then, your application will print all the prime numbers starting from the lower number up to the largest number.
//Scope :
//String
//Loops
//
//Input:
//1, 4 -> 1, 2, 3
//10 -> 1, 2, 3, 5, 7


fun main(args:Array<String>) {

    var num1 = 1
    var num2 = 100

    println("Lowest number: $num1 ")
    println("Highest number: $num2")
    while(num1<num2){
        if (checkPrimeNumber(num1))
            print(num1.toString()+" ")

        ++num1
    }

}

fun checkPrimeNumber(num:Int): Boolean {
    var pNum = true

    for (i in 2..num/2){

        if (num % i == 0){
            pNum = false
            break
        }
    }
    return pNum
}