package oop_00000107825_AlexanderAndrewWinata.week03.GuidedLab

class Employee(val name:String){
    var salary: Int = 0
        set(value) {
            if (value<0) {
                println("Mencoba set gaji ke $value")
            }else {
                field = value
            }
        }
    private var performanceRating: Int = 3

    fun increasePerformance() {
        performanceRating++
        println("Kinerja $name meiningkat! Rating:$performanceRating")
    }

    fun printStatus(){
        println("Karyawan: $name, Rating: $performanceRating")
    }

    val tax: Double
        get() = salary * 0.1
}