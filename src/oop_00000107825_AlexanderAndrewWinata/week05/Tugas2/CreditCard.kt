package oop_00000107825_AlexanderAndrewWinata.week05.Tugas2

class CreditCard (
    val limit: Double,
    var usedAmount: Double,
    nama: String
) : PaymentMethod(nama){
    override fun processPayment(amount: Double) {
        if((usedAmount+amount) <= limit) {
            usedAmount += amount
            println("Sukses")
        }else{
            println("transaksi ditolak")
        }
    }
}