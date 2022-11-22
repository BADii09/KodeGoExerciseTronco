import mu.KotlinLogging

lateinit var dogBreds: Array <String>
private val logger = KotlinLogging.logger{}

fun main() {

    var Stations: Array<String> = arrayOf("Taft", "Magallanes" , "Ayala")
    for (Stations in Stations){
        logger.info { "Station: $Stations" }
    }
        logger.info { "Station : ${Stations[0]}" }

        logger.info{"Stations: ${Stations.size}"}
    for (index in 0 until Stations.size){
        logger.info{"UNTIl STATIONS [${index}]:${Stations[index]}"}
    }

    for (index in Stations.indices) {
        logger.info { "USING INDICES STATIONS [${index}]:${Stations[index]}" }
    }

    logger.info{"Stations: ${Stations[0]}"}

    var arrayOfNumbers = Array (5, {i -> i+1})
    var arrayOfIntegers = arrayOf(1, 3, 4, 7, 11, 18)
    var arrayOfIntegers2 = arrayOf(2, 4, 6, 8, 10, 0)

    arrayOfIntegers.set(2,0)
    arrayOfIntegers[1] = 100

    arrayOfNumbers.forEach {
        logger.info{"For each: $it"}
    }

    logger.info { "Average : ${arrayOfIntegers.average()}"}
    logger.info { "Sum : ${arrayOfIntegers.sum()}"}
    logger.info {"Max:  ${arrayOfIntegers.max()}"}
    logger.info { "Min : ${arrayOfIntegers.min()}"}

    arrayOfIntegers = arrayOfIntegers.plus(arrayOfIntegers2)

    arrayOfIntegers.forEach {
        logger.info { "After plus: $it" }
    }


}
