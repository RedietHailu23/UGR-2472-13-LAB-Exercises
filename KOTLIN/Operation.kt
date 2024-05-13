fun main() {

    println("Enter the first number:")
   
    val number1 = readLine()?.toDoubleOrNull()

    if (number1 == null) {
        println("Invalid input for the first number!")
        return
    }

    println("Enter the second number:")

    val number2 = readLine()?.toDoubleOrNull()

    if (number2 == null) {
        println("Invalid input for the second number!")
        return
    }

    println("Enter the operation (addition, subtraction, multiplication, division):")

    val operation = readLine()


    if (operation == null) {
        println("No operation entered!")
        return
    }


    when (operation) {
        "addition" -> println("Result of addition: ${number1 + number2}")
        "subtraction" -> println("Result of subtraction: ${number1 - number2}")
        "multiplication" -> println("Result of multiplication: ${number1 * number2}")
        "division" -> {

            if (number2 != 0.0) {
                println("Result of division: ${number1 / number2}")
            } else {
                println("Cannot divide by zero!")
            }
        }
        else -> println("Invalid operation entered!")
    }
}
