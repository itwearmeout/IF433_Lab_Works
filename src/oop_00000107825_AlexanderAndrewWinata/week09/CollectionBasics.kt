package oop_00000107825_AlexanderAndrewWinata.week09

fun main(){
    println("=== TEST LIST ===")
    val framework: List<String> = listOf("Kotlin", "Java", "C++")
    println("Immutable List: $framework")

    val score: MutableList<Int> = mutableListOf(85, 90)
    score.add(95)
    score[0] = 88
    println("Mutable List: $score")
}