package oop_00000107825_AlexanderAndrewWinata.week01

fun main(){

    val gameTitle:String = "KCD2"

    val price:Int = 499000

    var discountedPrice = calculateDiscount(price)

}

fun calculateDiscount(price :Int) = if (price > 500000) price-(price*0.20) else price-(price*0.15)