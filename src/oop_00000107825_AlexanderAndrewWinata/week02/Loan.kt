package oop_00000107825_AlexanderAndrewWinata.week02

class Loan (
    var bookTitle :String,
    var borrower :String,
    var loanDuration :Int = 1,
){
    private fun calculateFine():Int {
        if (loanDuration > 3) {
            val fine :Int = (loanDuration - 3) * 2000
            return fine
        } else {
            val fine :Int= 0
            return fine
        }
    }
}