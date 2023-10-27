fun calculateFinalPrice(carValue: Double, installment: Int, surcharges: Array<Double>): Double {
    return when (installment) {
        1 -> carValue * 0.8
        12 -> carValue + carValue * surcharges[0]
        24 -> carValue + carValue * surcharges[1]
        36 -> carValue + carValue * surcharges[2]
        48 -> carValue + carValue * surcharges[3]
        60 -> carValue + carValue * surcharges[4]
        else -> carValue
    }
}

fun main() {
    val surcharges = arrayOf(0.06, 0.12, 0.18, 0.24, 0.30)

    print("Digite o valor total do carro: ")
    val carValue = readln().toDouble()

    print("Em quantas parcelas você deseja fazer? ")
    val installment = readln().toInt()

    println("O valor final do carro é R$ %.2f.".format(calculateFinalPrice(carValue, installment, surcharges)))
}