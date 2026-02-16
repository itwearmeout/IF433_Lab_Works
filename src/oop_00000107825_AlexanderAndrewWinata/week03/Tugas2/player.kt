package oop_00000107825_AlexanderAndrewWinata.week03.Tugas2

class Player(var username: String) {
    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(xpGain :Int) {
        if(xpGain<0) return

        val oldLevel = level

        xp += xpGain

        if(oldLevel < level){
            println("Level Up! Selamat $username naik ke level $level !")
        }
    }
}