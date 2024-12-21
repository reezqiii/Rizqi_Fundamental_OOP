package Fundamentals

fun halo(namaAwal: String, namaAkhir: String = "") {
    println("Halo $namaAwal $namaAkhir")
}

fun main() {
    halo( "Rizqi")
    halo( "Rizqi", "Vela")
}