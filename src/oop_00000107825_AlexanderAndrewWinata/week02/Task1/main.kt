package oop_00000107825_AlexanderAndrewWinata.week02.Task1

import oop_00000107825_AlexanderAndrewWinata.week02.Task1.Loan
import java.util.Scanner


fun main(){
    val scanner = Scanner(System.`in`)
    println("--- LIBRARY FINE SYSTEM ---")
    print("Masukkan title buku: ")
    val title : String= scanner.nextLine()

    print("Masukkan nama peminjam: ")
    val borrower :String= scanner.nextLine()

    print("Masukkan durasi pinjam: ")
    var borrowDur :Int = scanner.nextInt()

    scanner.nextLine()

    if(borrowDur < 0){
        borrowDur = 1
    }

    val loan1 = Loan(title,borrower,borrowDur)
    println("Meminjam buku ${loan1.bookTitle}, di pinjam oleh ${loan1.borrower}, lama pinjam ${loan1.loanDuration} hari, dengan fine ${loan1.calculateFine()}")
}