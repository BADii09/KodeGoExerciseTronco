import mu.KotlinLogging

open class Product{
    var name: String = " "
        private set
    var price: Double = 0.0

    constructor(names: String, price:Double){
        this.name = name
        this.price = price
    }
}

class Fruits(name: String, price: Double): Product(name,price){
    var quantity: Float = 0.0F
    var quantityUnits: String = "Per pieces"
}

class Shake(name: String, price: Double): Product(name,price){
    var size: Any = " "
    var ingredients: ArrayList<String> = ArrayList()
    var addOns: ArrayList<String> = ArrayList()
}

class Juice(name: String, price: Double): Product(name,price) {
    var size: Any = " "
    var ingredients: ArrayList<String> = ArrayList()
}

class Sandwhiches(name: String, price: Double): Product(name,price) {
    var ingredients: ArrayList<String> = ArrayList()
    var addOns: ArrayList<String> = ArrayList()
    var breadType: Any = " "
}

class Salad(name: String, price: Double): Product(name,price) {
    var ingredients: ArrayList<String> = ArrayList()
    var dressing: Any = " "
    var size: Any = " "
}

enum class OrderStatus{
    SENT_TO_KITCHEN,
    BEING_PREPARED,
    FOR_PICKUP,
    FOR_DELIVERY,
    DELIVERED,
    PICK_UP,
    CANCELLED,
    UNKNOWN
}

data class Customer(var address:String, var mobilenumber: String,
                    var firstname: String, var lastname: String)


class cart (var customer: Customer){
    var UniqueID:String = ""
    var items:HashMap<Product, Float> = HashMap()
    var status:OrderStatus = OrderStatus.UNKNOWN

    fun updateOrder(status: OrderStatus){
        this.status = status
    }

    fun addItems(product: Product, quantity:Float){
        items[product] = quantity
    }
}


fun main() {
    

}