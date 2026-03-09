package oop_00000107825_AlexanderAndrewWinata.week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable{
    override fun turnOff() {
        println("Device $name dimatikan")
    }

    override fun turnOn() {
        println("Device $name dinyalkan")
    }

    fun playMusic (song: String){
        println("Memutar lagu $song")
    }
}