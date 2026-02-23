package oop_00000107825_AlexanderAndrewWinata.week04.GuidedLab

class ElectricCar (
    brand: String,
    numberOfDoors: Int,
    val batteryCapacity: Int,
): Car(brand, numberOfDoors) {
    final override fun accelerate() {
        println("$brand accelerate dengan sunyi. Kapasitas baterai: $batteryCapacity %")
    }
}