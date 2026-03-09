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
    }
    fun activeSecurityMode(){
        for(i in devices){
            when(i){
                is Recordable -> {
                    i.startRecord()
                }
                is SmartSpeaker -> {
                    i.playMusic("Sirine Peringatan")
                }
            }
        }
    }
}