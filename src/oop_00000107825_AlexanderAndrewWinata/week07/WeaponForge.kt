package oop_00000107825_AlexanderAndrewWinata.week07

class Weapon private constructor(val item: GameItem, val durability: Int){
    companion object {
        fun forgeStarterSword(): Weapon {
            val starter = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(starterItem, 50)
        }

        fun forgeEpicSword(): Weapon {
            val epic = GameItem("Galatine", 50, ItemRarity.EPIC)
            return Weapon(epicItem, 50)
        }
    }
}

