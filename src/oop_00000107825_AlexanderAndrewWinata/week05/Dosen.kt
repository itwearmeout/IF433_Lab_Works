package oop_00000107825_AlexanderAndrewWinata.week05

class Dosen (
    nama: String,
    val nidn: String
) : Pegawai(nama) {
    override fun berkerja() {
        println("[$name] sedang meniapkan materi perkuliahan dan merevisi RPKPS.")
    }

    fun mengajar() {
        println("[$name] sedang mengajar mahasiswa di kelas")
    }
}