package oop_00000107825_AlexanderAndrewWinata.week07

class NetworkClient private constructor(val url: String) {

    companion object {
        const val BASE_URL = "https://api.umn.ac.id"

        fun createClient(): NetworkClient {
            println("Membangun NetworkClient dengan BASE URL: $BASE_URL")
        }
    }
    fun connect() {
        println("Connecting to $url...")
    }
}