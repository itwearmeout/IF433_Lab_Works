package oop_00000107825_AlexanderAndrewWinata.week03.Tugas1

class Weapon(var name: String) {
    var damage: Int = 0
        set(value) {
            if (value<0) {
                println("Tidak boleh negatif!")
            }else if (value>1000){
                field = 1000
                println("Damage $name = $damage")
                addRarity()
            }else{
                field = value
                println("Damage $name = $damage")
                addRarity()
            }
        }
    fun addRarity() {
        if(damage < 500){
            var rarity: String = "common"
            println("Rarity $name = $rarity")
        }else if( damage > 500 && damage < 800){
            var rarity: String = "epic"
            println("Rarity $name = $rarity")
        }else {
            var rarity :String = "legendary"
            println("Rarity $name = $rarity")
        }
    }


}