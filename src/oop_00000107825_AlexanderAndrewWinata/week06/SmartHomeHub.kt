package oop_00000107825_AlexanderAndrewWinata.week06

class SmartHomeHub (val devices : MutableList<SmartDevice> = mutableListOf<SmartDevice>()) {
    fun addDevice(device: SmartDevice){
        devices.add(device)
    }
    fun turnOffAlSwitches(){
        for(i in devices){
            if(i is Switchable){
                i.turnOff()
            }
        }
    }//.
}