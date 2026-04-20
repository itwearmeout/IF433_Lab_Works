package oop_00000107825_AlexanderAndrewWinata.week09

fun main(){
    println("=== TEST LIST ===")
    val framework: List<String> = listOf("Kotlin", "Java", "C++")
    println("Immutable List: $framework")

    val score: MutableList<Int> = mutableListOf(85, 90)
    score.add(95)
    score[0] = 88
    println("Mutable List: $score")

    println("=== TEST SET ===")
    val uniqueNumbers = setOf(1, 2, 2, 3, 3, 4)
    println("Unique Numbers (Set): $uniqueNumbers")

    val activeUsers = mutableSetOf("UserA", "UserB")
    activeUsers.add("UserC")
    activeUsers.add("User D")
    println("Active Users: $activeUsers")

    println("=== TEST MAP ===")
    val studentGrades = mapOf(
        "Alice" to "A",
        "Bob" to "B",
        "Charlie" to "A"
    )
    println("Nilai Bob: ${studentGrades["Bob"]}")

    val inventory = mutableMapOf("Apples" to 50, "Banana" to 30)
    inventory["Oranges"] = 20
    inventory["Apples"] = 45
    println("Inventory: $inventory")
}