package oop_00000107825_AlexanderAndrewWinata.week04.tugas2

fun main() {
    val slave1 = Employee("Wowok", 200000)
    for(i in 1..5) slave1.work()
    println("${slave1.name} mendapatkan bonus ${slave1.calculateBonus()}")

    val slave2 = Manager("Boss", 500000)
    slave2.work()
    println("${slave2.name} mendapatkan bonus ${slave2.calculateBonus()}")

    val slave3 = Developer("Budi", 300000, "Rust")
    slave3.work()
    println("${slave3.name} mendapatkan bonus ${slave3.calculateBonus()}")
}