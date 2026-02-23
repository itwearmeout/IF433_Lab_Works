package oop_00000107825_AlexanderAndrewWinata.week04.tugas2

class Developer(
    name: String,
    baseSalary: Int,
    val programmingLanguange: String,
): Employee(name, baseSalary) {
    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguange")
    }
}