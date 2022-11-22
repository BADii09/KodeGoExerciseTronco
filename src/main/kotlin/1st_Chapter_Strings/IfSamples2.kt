fun main() {
    var grade: Float = 70.0F
    var gradeInCard: Float = 0.0F

    if (grade in (94.0F).rangeTo(100.0F)) {
        gradeInCard = 1.0F
    }else if (grade in (89.0F).rangeTo(93.9F)){
        gradeInCard = 1.5F
    }else if (grade in (83.0F).rangeTo(88.9F)){
        gradeInCard = 2.0F
    }else if (grade in (78.0F).rangeTo(82.9F)){
        gradeInCard = 2.5F
    }else if (grade in (75.0F).rangeTo(77.9F)){
        gradeInCard = 3.0F
    }else{
        gradeInCard = 5.0F
    }

    println("your grade is:" +
            "$gradeInCard")
}