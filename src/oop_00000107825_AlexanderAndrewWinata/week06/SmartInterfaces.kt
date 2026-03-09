package oop_00000107825_AlexanderAndrewWinata.week06

interface SmartDevice{
    val id: String
    val name: String
}

interface Switchable {
    fun turnOn()
    fun turnOff()
}

interface Recordable {
    fun startRecord()
    fun stopRecord()
}