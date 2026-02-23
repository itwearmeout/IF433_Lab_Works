package oop_00000107825_AlexanderAndrewWinata.week04.GuidedLab

class Employee(
    val name: String,
) {
    var salary: Int = 0
        set (value) {
            if(value < 0) {
                println("Gaji tidak boleh negatif")
                field = 0
            }else{
                field = value
            }
        }
}