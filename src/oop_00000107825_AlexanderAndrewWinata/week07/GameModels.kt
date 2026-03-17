enum class ItemRarity(val dropChance: Int) {
    COMMON(70), UNCOMMON(35), RARE(15), EPIC(5), LEGENDARY(1)
}

data class GameItems(val name: String, val damage: Int, val rarity: ItemRarity)