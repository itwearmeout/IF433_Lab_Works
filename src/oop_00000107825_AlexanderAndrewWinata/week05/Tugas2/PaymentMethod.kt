package oop_00000107825_AlexanderAndrewWinata.week05.Tugas2

abstract class PaymentMethod (val accountName: String) {
    abstract fun processPayment(amount: Double)
}