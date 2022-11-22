//You are tasked to automate an inventory system for a grocery.
//Identify the items that can be bought in a grocery store.
//After listing the different items, identify the characteristics of the items.
//You are also tasked to group the items in categories to help manage the grocery.  Use the proper data types.

fun main() {

    var userName: String? = null
    var needAnyhelp: String? = null

    print("Enter your name: ")
    userName = readLine().toString()
    println("hi $userName")
    println ("Do you need any help? (Y/N)")
    needAnyhelp = readLine().toString()

    if(needAnyhelp.lowercase() == "y"){
        println("How may I help you")
    }else if(needAnyhelp.lowercase() =="n"){
        println("Don't Forget I am here...")
    }else{
        println("oh okay")
    }
    println("Thank you very much")
}
