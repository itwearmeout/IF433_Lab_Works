package oop_00000107825_AlexanderAndrewWinata.week09

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    println("Origin Data: $numbers")
    println("=== HOF: FILTER ===")
    val evens = numbers.filter { it % 2 == 0 }
    println("Evens: $evens")
}