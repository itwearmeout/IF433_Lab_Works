package oop_00000107825_AlexanderAndrewWinata.week05.Tugas2

class EWallet (var balance: Double, name: String) : PaymentMethod(name) {
    override fun processPayment(amount: Double) {
        if(balance >= amount) {
            balance -= amount
            println("Sukses")
        }else{
            println("Saldo Tidak cukup")
        }
    }

    fun topUp (amount: Double){
        balance += amount
    }
}