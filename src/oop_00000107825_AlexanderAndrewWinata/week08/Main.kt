package oop_00000107825_AlexanderAndrewWinata.week08

import com.sun.jdi.connect.IllegalConnectorArgumentsException

fun main(){
    println("=== TEST SAFE CALLS & ELVIS ====")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman $destination")
    println("=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)
    val receipt = validOrder.totalPrice?.let {
        price ->
        val tax = price * 0.11
        "Transaksi Valid. Harga Rp$price, Pajak: Rp$tax"
    } ?: "Transaksi invalid harga bekum di-set!"

    print(receipt)

    println("=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = listOf(
        "Smart Phone",
        1500000,
        UserProfile("Andi", null),
        "Laptop",
        4500000.0
    )

    for (item in mixedData) {
        val text = item as? String

        text?.let {
            println("Ditemukan teks: ${it.uppercase()}")
        }
    }

    val someObject: Any = 100
    val safeString = someObject as? String ?: "Unknown String"
    println("Hasil cast + fallback :$safeString") //berhasil HOORAY

    println("=== TEST THE RED BUTTON !! ===")
    val toxicData: String? = null
    try{
        val length = toxicData!!.length
    } catch (e: NullPointerException) {
        println("CRASH NPE ! JANGAN GUNAKAN !! SECARA SEMBARANG")
    }

    val apiResponse: Map<String, String?> = mapOf("status" to "200", "token" to null)
    try{
        val token = requireNotNull(apiResponse["token"]) {
            "CRITICAL EXCEPTION: Token otentilasi tidak ditemukan dari server!"
        }
    } catch (e: IllegalConnectorArgumentsException) {
        println(e.message)
    }

    println("=== TEST JAVA INTEROP ===")
    val javaResponse = LegacyJavaAPI.fetchServerStatus()

    val statusLength = javaResponse!!.length
    println("Status dari Java: $javaResponse (length: $statusLength)")
}