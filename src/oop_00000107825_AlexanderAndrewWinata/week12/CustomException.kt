package oop_00000107825_AlexanderAndrewWinata.week12

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
): Exception("Attempted $amount, balance: $balance")