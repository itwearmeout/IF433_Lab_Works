package oop_00000107825_AlexanderAndrewWinata.week02.Task2

import oop_00000107825_AlexanderAndrewWinata.week02.Task2.hero
import java.util.Scanner


fun main() {
    val scanner = Scanner(System.`in`)
    print("Masukkan nama hero: ")
    val name :String= scanner.nextLine()

    print("Masukkan base damage: ")
    val damage :Int= scanner.nextInt()
    scanner.nextLine()

    var enemyHp :Int= 100

    var Hero = hero(name, damage)
    while(Hero.isAlive() && enemyHp > 0){
        println("${Hero.name} HP: ${Hero.hp}                      Enemy HP: ${enemyHp}")
        println("1. Serang")
        println("2. Kabur")
        print("Action: ")
        var input :Int= scanner.nextInt()
        scanner.nextLine()
        when(input){
            1 -> {
                enemyHp -= Hero.baseDamage
                println("Menyerang musuh dengan ${Hero.baseDamage}, sisah darah musuh: ${enemyHp}")
                if(enemyHp > 0) {
                    val enemyAttack = (10..20).random()
                    Hero.hp -= enemyAttack
                    println("Musuh menyerang ${Hero.hp} sebesar ${enemyAttack}, sisa darah ${Hero.name}: ${Hero.hp}")
                }
            }
            2 -> {
                break
            }
        }
    }
}