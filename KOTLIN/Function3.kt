fun main() {
    val stringList = listOf("hello", "Hilena", "you","are", "Amazing")
    val integerList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val numberList = listOf(1.5, 2.5, 3.5, 4.5, 5.5)

    val uppercaseStrings = transformToUppercase(stringList)
    println("Uppercase strings: $uppercaseStrings")

    val filteredNumbers = filterNumbersGreaterThan(integerList, 5)
    println("Numbers greater than 5: $filteredNumbers")

    val sumOfNumbers = calculateSum(numberList)
    println("Sum of numbers: $sumOfNumbers")
}


fun transformToUppercase(strings: List<String>): List<String> {
    return strings.map { it.uppercase() }
}

fun filterNumbersGreaterThan(numbers: List<Int>, threshold: Int): List<Int> {
    return numbers.filter { it > threshold }
}


fun calculateSum(numbers: List<Double>): Double {
    return numbers.reduce { acc, number -> acc + number }
}
