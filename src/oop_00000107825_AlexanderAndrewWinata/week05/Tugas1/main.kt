package oop_00000107825_AlexanderAndrewWinata.week05.Tugas1

fun main() {
    val hitung = MathHelper()
    println("Hitung lebar persegi ${hitung.hitungLuas(10)}")
    println("Hitung lebar p panjang ${hitung.hitungLuas(10,12)}")
    println("Hitung lebar lingkaran ${hitung.hitungLuas(200000.9999)}")
}