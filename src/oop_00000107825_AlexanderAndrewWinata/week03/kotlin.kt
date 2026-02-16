package oop_00000107825_AlexanderAndrewWinata.week03

class Emploee(val name:String){
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke $value")
            this.salary = value
        }
}