fun main() {
    val passwordLength = 8 

    val password = generateRandomPassword(passwordLength)

    println("Generated Password: $password")
}

fun generateRandomPassword(length: Int): String {
    val allowedChars = ('a'..'z') + ('A'..'Z') + ('0'..'9') + listOf('!', '@', '#', '$', '%', '&')

    val password = StringBuilder()
    val random = java.util.Random()

    repeat(length) {
        val randomIndex = random.nextInt(allowedChars.size)
        val randomChar = allowedChars[randomIndex]
        password.append(randomChar)
    }

    return password.toString()
}
