import mu.KotlinLogging

//Using Activity 01 - C
//Implement a process where items are added to the grocery cart.
//User : Cashier
//Goal : List of Items bought, how many items were bought and total cost.
//Scope :
//Data Structures <HashMap>
private val logger = KotlinLogging.logger{}
fun main() {
    var Items: Array<String> = arrayOf("Pork, Beef, Fish, Vegetables, CannedGoods")
    var Input: String? = null
    var Additem: String? = null
    for (Items in Items) {
        logger.info { "Select Grocery Items: $Items" }
    }
        logger.info{"Input Selected Items"}
        Input = readLine().toString()

        logger.info { "Item is added to Grocery Cart" }
        logger.info { "Do you want to add items? (Y/N)" }
        Additem = readLine().toString()

    if (Additem.lowercase() == "Y"){
        logger.info { "Input additional item: $Input" }
        Additem = readLine().toString()
    }else if (Additem.lowercase() == "N"){
        logger.info { "Thank you for purchasing" }
    }
}