package oop_00000107825_AlexanderAndrewWinata.week07

fun processEvent(event: BattleState) {
    when (event) {
        is MonsterEncounter -> {
            println("Encounter monster")
        }
        is LootDropped -> {
            val (name, damage, rarity) = event.item
            println("Mendapatkan loot: $name Damage: $damage, Rarity: $rarity")
        }
        is GameOver -> {
            println("Permainan berakhir")
        }
        is SafeZone -> {
            println("Memasuki Safe Zone")
        }
    }
}