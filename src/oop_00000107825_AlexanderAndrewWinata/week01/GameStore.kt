package oop_00000107825_AlexanderAndrewWinata.week01

fun main(){

    val gameTitle:String = "KCD2"

    val price:Int = 499000

    var discountedPrice:Int = calculateDiscount(price).toInt()

    printReceipt(title = gameTitle, finalPrice = discountedPrice)
}

fun calculateDiscount(price: Int)= if (price > 500000) price - (price * 0.2) else price - (price * 0.15)

fun printReceipt(title:String, finalPrice:Int) = println("Membeli game $title dengan harga $finalPrice")