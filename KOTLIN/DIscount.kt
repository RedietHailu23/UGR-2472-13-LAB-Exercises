fun main() {
    
    val originalPrice = 100.0 
    val discountPercentage = 0.6 
    var finalPrice: Double

    val threshold = 0.5 
    if (discountPercentage > threshold) {
        finalPrice = originalPrice * (1 - threshold)
    } else {
        
        finalPrice = originalPrice * (1 - discountPercentage)
    }


    println(finalPrice)
}
