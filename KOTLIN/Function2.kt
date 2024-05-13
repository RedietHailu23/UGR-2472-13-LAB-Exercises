fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val doubles = listOf(1.5, 2.5, 3.5, 4.5, 5.5)

    println("Max value in the list: ${findMax(numbers)}")
    println("List of even numbers: ${filterEvenNumbers(numbers)}")
    println("Average of the list: ${calculateAverage(doubles)}")
}

fun findMax(numbers: List<Int>): Int? {
    return numbers.maxOrNull()
}

fun filterEvenNumbers(numbers: List<Int>): List<Int> {
    return numbers.filter { it % 2 == 0 }
}

fun calculateAverage(numbers: List<Double>): Double {
    if (numbers.isEmpty()) return 0.0
    val sum = numbers.sum()
    return sum / numbers.size
}
