import com.sun.jdi.IntegerValue

//Create an application that will accept 5 monetary amounts.
//After the input is done, the user will be asked “Divide the value by how many?”. It will only accept an Integer as input.
//The total of the 5  input will be divided by the answer in the second question input.
//Note: Error checking must be done.


fun main() {


    var num1: Int? = null
    var num2: Int? = null
    var num3: Int? = null
    var num4: Int? = null
    var num5: Int? = null

    var divideBy: Int? = null

    println("Input 1st amount: ")
    num1 = readLine().toString().toInt()
    println("Input 2nd amount: ")
    num2 = readLine().toString().toInt()
    println("Input 3rd amount: ")
    num3 = readLine().toString().toInt()
    println("Input 4th amount: ")
    num4 = readLine().toString().toInt()
    println("Input 5th amount: ")
    num5 = readLine().toString().toInt()

    var Sum:Int = num1+num2+num3+num4+num5

    println("The sum of 5 amount is: $Sum")


    println("Divide the value by how many? ")
    divideBy = readLine().toString().toInt()

    var Quotient:Int = Sum/divideBy

    println("The quotient is: $Quotient ")

}


