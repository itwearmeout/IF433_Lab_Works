package oop_00000107825_AlexanderAndrewWinata.week01

fun main (args: Array<String>){
    val radius = 7.0
    val pi = 3.14

    var area: Double = pi * radius * radius

    println("Radius: $radius, Area: $area")

    var circleSize :String= checkSize(area)

    println(circleSize)
}

fun checkSize(area: Double) = if(area>100) "This is a big circle" else "This is a small circle"