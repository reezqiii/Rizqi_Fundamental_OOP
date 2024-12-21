package Fundamentals

fun main() {
    var checkIn: String? = null
    var status = "Checkout"

    status = "Booked"

    if (status.equals("Booked")) {
        checkIn = "17/03/2024 14:00:00"
    }

    println(checkIn)
}
