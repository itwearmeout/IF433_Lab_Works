package oop_00000107825_AlexanderAndrewWinata.week07

object DatabaseManager {
    var connectionStatus: String = "Disconeected"

    fun connect() {
        connectionStatus = "Connected to server"
        println("Database is ready")
    }
}