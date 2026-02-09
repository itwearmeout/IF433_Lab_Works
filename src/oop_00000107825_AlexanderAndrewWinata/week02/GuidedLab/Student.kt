package oop_00000107825_AlexanderAndrewWinata.week02.GuidedLab

class Student (
    val name: String,
    val nim: String,
    val gpa: Double = 0.0,
    val major: String
){
    init {
        if (nim.length != 5){
            println("WARNING: objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        }else{
            println("LOG: objek student $name berhasil dialokasikan ke memory")
        }
    }
    constructor(name: String, nim: String) :this(name, nim, major = "Non-Matriculated"){
        println("LOG: Menggunakan constructor jalur umum (Tanpa jurusan)")
    }
}