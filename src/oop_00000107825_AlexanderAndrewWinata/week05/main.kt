package oop_00000107825_AlexanderAndrewWinata.week05

fun main(){
    val dosen1 = Dosen("Pak Alex", "09120")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for(pegawai in daftarPegawai) {
        pegawai.berkerja()
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebaga Doesen (NIDN: ${pegawai.nidn}")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terfeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
    }
    println("------------------------")
}
