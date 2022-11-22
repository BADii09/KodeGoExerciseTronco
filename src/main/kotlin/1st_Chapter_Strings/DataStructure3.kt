import mu.KotlinLogging
import java.util.LinkedList
private val logger = KotlinLogging.logger{}

fun main() {
    var listNames = ArrayList<String>()
    var listLocations = LinkedList<String>()

    var mapName = HashMap<String, String>()
    var mapLocation = LinkedHashMap<String, String>()

    var setName = HashSet<String>()
    var setLocation = LinkedHashSet<String>()

    var set: Set<String> = HashSet<String>()
    var map: Map<String, String> = HashMap<String, String>()
    var list: List<String> = ArrayList<String>()

    val names: List<String> = mutableListOf<String>("Jason", "Kurt", "Naths", "Nathalie", "Pearl")
    var numbers: Set<Char> = mutableSetOf('1', '2', '3', '4', '5', '5')
    var character: Map<String, Int> = mutableMapOf(("one" to 1), ("two" to 2), ("three" to 3))

    var locations: List<String> = listOf("Malabugas", "Tinago", "Poblacion", "Villareal", "Suba")
    var setPoints: Set<Int> = setOf(1, 2, 3, 4, 5)
    var mapPoints: Map<String, Int> = mapOf(("One" to 1), ("Two" to 3), ("Three" to 3))

    var araylist: ArrayList<String> = names as ArrayList<String>
    var linkedList: LinkedList<String> = names as LinkedList<String>


    for (name in names) {
        logger.info { "Name: $name" }
    }
    for (index in names.indices)
        logger.info { "Name[$index]:${names[index]}" }

    var iterator = names.iterator()
    while (iterator.hasNext()) {
        logger.info { "Names: ${iterator.next()}" }
    }

    names.forEach {
        logger.info { "Name: $it" }
    }

    names.forEachIndexed { index, name ->
        logger.info { "Name[$index]:$name" }
    }

    var studentnames = names as ArrayList
    studentnames.add(0, "Pearl")

    studentnames.add("Noah")
    studentnames.removeAt(3)
    studentnames.remove("Nathalie")

    studentnames[0] = "Edited Entry"

    studentnames.contains("Patrick")

    for (name in names) {
        logger.info { "Name: $names" }
    }

    var numberset = numbers as java.util.LinkedHashSet<Char>
    for (number in numbers) {
        logger.info { "Number: $number" }
    }
    numberset.add('7')
//  numberset.clear()
//  numberser.remove()

    for (entry in character.entries) {
        logger.info { "Key: ${entry.key} -> Value: ${entry.value}" }
    }
    var numberMap = character as HashMap<String, Int>
    for (entry in numberMap.entries)
        logger.info { "Key: ${entry.key}->Value:${entry.value}" }

    for (value in numberMap.values)
        logger.info{"Value: "}


}