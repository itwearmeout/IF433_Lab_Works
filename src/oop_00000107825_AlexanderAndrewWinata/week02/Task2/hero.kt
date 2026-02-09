package oop_00000107825_AlexanderAndrewWinata.week02.Task2

class hero(
    val name :String,
    var baseDamage :Int,
    var hp :Int=100
) {
    fun attack(targetName :String){
        println("${name} menyerang ${targetName}dengan kerusakan ${baseDamage}")
    }
    fun takeDamage(targetDamage :Int){
        hp -=targetDamage
        if(hp <= 0){
            hp = 0
        }
    }
    fun isAlive(): Boolean{
        if(hp ==  0) return false else return true
    }
}