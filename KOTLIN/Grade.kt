fun main(args: Array<String>) {
    if (args.isNotEmpty()) {
        val grade = args[0].toIntOrNull()

        if (grade != null && grade in 0..100) {
            val letterGrade = when {
                grade >= 90 -> "A"
                grade in 80..89 -> "B"
                grade in 70..79 -> "C"
                grade in 60..69 -> "D"
                else -> "F"
            }
            println("Letter grade: $letterGrade")
        } else {
            println("Invalid input! Please enter a numeric grade between 0 and 100.")
        }
    } else {
        println("Usage: Please provide a numeric grade as a command-line argument.")
    }
}
