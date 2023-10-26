fun calculateDiscount(originalPrice: Double): Double = originalPrice - originalPrice * 0.1

fun main() {
    print("Digite o valor a ser convertido: ")
    val originalPrice = readln().toDouble()
    val finalPrice = calculateDiscount(originalPrice)
    println(finalPrice)
}
