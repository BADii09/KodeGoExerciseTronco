import java.util.Arrays

//Create an application that will accept 2 string inputs.
//Your application will print all unique characters in both Strings.
//Scope :
//String
//Loops


fun main() {

    var string1: String? = null
    var string2: String? = null
    var index = 0
    var result = string1.equals(string2,false)

    println("Input 1st String: ")
    string1 = readLine().toString()
  println("Input 2nd String: ")
   string2 = readln().toString()


    val characters: String = string1 + string2

    for (i:Char in characters){
        for (i2:Char in characters){
            if (i!=i2){
                println("Unique letter in 1st string: $i")
            }else{
                println(" No Unique character")
            }
        }
    }


}