fun main() {
    
    val distanceValue = 100.0 
    val originalUnit = "kilometers" 

    
    val convertedValue = convertDistance(distanceValue, originalUnit, "miles")

  
    println("Converted distance: $convertedValue miles")
}

fun convertDistance(distance: Double, fromUnit: String, toUnit: String): Double {
    return when {
        fromUnit == "kilometers" && toUnit == "miles" -> distance * 0.621371
        fromUnit == "miles" && toUnit == "kilometers" -> distance * 1.60934
        // Add more conversion cases as needed
        else -> {
            println("Conversion from $fromUnit to $toUnit is not supported.")
            distance 
        }
    }
}
