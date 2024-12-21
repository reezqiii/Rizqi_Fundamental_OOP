package Fundamentals

fun main() {
    val buah = arrayOf<String>("Apel", "Pisang", "Jeruk", "Anggur")

    println(buah[0])
    println(buah.get(1))
    println("---")

    buah[0] = "Apel Hijau"
    buah.set(1, "Pisang Mateng")

    println(buah[0])
    println(buah.get(1))
    println(buah.get(2))
}