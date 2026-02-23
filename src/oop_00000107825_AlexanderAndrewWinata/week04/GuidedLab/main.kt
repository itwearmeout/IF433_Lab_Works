package oop_00000107825_AlexanderAndrewWinata.week04.GuidedLab

fun main() {
    println("--- Test Vehicle ---")
    val generalVehicle = Vehicle("Sepeda onthel")
    generalVehicle.honk()
    generalVehicle.accelarate()

    println("\n--- Testing Car ----")
    val myCar = Car("Toyota",4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelarate()

}