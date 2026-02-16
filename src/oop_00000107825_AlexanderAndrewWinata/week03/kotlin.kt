package oop_00000107825_AlexanderAndrewWinata.week03

class Emploee(val name:String){
    var salary: Int = 0
        set(value) {
            if (value<0) {
                println("Mencoba set gaji ke $value")
            }else {
                field = value
            }
        }
}