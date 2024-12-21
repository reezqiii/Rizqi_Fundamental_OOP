package Fundamentals

fun fullName(
    firstName: String,
    middleName: String,
    lastName: String
) {
    println("Hi $firstName $middleName $lastName")
}

fun main() {
    fullName(
        firstName = "Rizqi",
        middleName = "Vela",
        lastName = "Syifa"
    )
}