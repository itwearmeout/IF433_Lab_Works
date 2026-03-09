package oop_00000107825_AlexanderAndrewWinata.week06

class Smartphone : Camera, Phone {

    override fun turnOn() {
        super<Phone>.turnOn()
        super<Phone>.turnOn()

        println("Sistem operasi Smartphone berhasil booting")
    }
}