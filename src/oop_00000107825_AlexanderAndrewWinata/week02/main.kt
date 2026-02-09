package oop_00000107825_AlexanderAndrewWinata.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("APLIKASI PMB UMN")
    print("MAsukkan nama")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter):")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length != 5){
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    }else {
        print("Masukkan jurusan:")
        val major = scanner.nextLine()

        val s1 = Student(name = name, nim = nim, major = major)
        println("Status: Pendaftaran selesai")
    }
}