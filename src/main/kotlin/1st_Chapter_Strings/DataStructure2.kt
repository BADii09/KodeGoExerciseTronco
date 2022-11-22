 import mu.KotlinLogging

private val logger = KotlinLogging.logger{}

fun main() {
    var rectangleDimensions = Array(4){Array<String>(4){""} } //width, Height

    var xPosition = intArrayOf(1, 2, 3)
    var yPosition = intArrayOf(2, 3 ,4 )
    var position = arrayOf(xPosition, yPosition) //X,Y

    for (xPosition in position)
        for(xPosition in xPosition){
            logger.info{"Position: $xPosition"}
        }

    for (row in position.indices){
        for (column in position[row].indices)
            logger.info {"position: $row, $column = [${position[row][column]}]"}
    }

    var threeDimensions = Array(4){Array(4){Array<String>(4){""}}} // 3 Dimensional Array


}