package oop_00000107825_AlexanderAndrewWinata.week05.Tugas2

import oop_00000107825_AlexanderAndrewWinata.week05.Admin
import oop_00000107825_AlexanderAndrewWinata.week05.Dosen
import oop_00000107825_AlexanderAndrewWinata.week05.Pegawai

fun main () {
    val wallet = EWallet(50000.00,"Me")
    val cc = CreditCard(100000.00, usedAmount = 0.00, "You")
    val listCard: List<PaymentMethod> = listOf(wallet, cc)

    for(method in listCard){
        method.processPayment(75000.00)
    }
}