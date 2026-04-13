package oop_00000107825_AlexanderAndrewWinata.week08

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"), // Corrupted warranty
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // Missing ID!
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Unknown type
    )

    val parser = ApiParser()

    for (raw in rawApiData) {
        try {
            val product: Product? = parser.parseProduct(raw)

            product?.let {
                println("✅ Parsed: $it")
                parser.checkout(it)
            } ?: println("Error -> $raw")

        } catch (e: IllegalArgumentException) {
            println("Error parsing data: ${e.message}")
        }
    }
}