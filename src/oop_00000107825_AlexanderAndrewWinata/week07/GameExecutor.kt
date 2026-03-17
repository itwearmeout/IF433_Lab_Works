package oop_00000107825_AlexanderAndrewWinata.week07

fun processEvent(event: BattleState) {
    when (event) {
        is MonsterEncounter -> {
            println("Monster ${event.monsterName} muncul")
        }
        is LootDropped -> {
            val (name, damage, rarity) = event.item
            println("Mendapatkan loot: $name Damage: $damage, Rarity: $rarity")
        }
        is GameOver -> {
            println("Game Over:${event.reason}")
        }
        is SafeZone -> {
            println("Memasuki Safe Zone")
        }
    }
}