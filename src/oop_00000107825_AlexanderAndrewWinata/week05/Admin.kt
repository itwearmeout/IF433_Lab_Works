package oop_00000107825_AlexanderAndrewWinata.week05

class Admin(nama: String) : Pegawai(nama) {
    override fun berkerja() {
        println("[$name] sedang duduk di depan komputer melayani administrasi")
    }

    fun doAdminWork(){
        println("[$name] sedanhg merekap data absensi mahasiswa")
    }
}