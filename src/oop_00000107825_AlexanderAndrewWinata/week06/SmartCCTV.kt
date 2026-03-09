package oop_00000107825_AlexanderAndrewWinata.week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable{
    override fun startRecord() {
        println("$name berhenti mulai")
    }

    override fun stopRecord() {
        println("$name berhenti merekam")
    }
    override fun turnOff() {
        println("Device $name dimatikan")
        stopRecord()
    }

    override fun turnOn() {
        println("Device $name dinyalkan")
        startRecord()
    }

}