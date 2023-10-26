fun calculateAverage(number1: Double, number2: Double): Double = (number1 + number2) / 2

fun calculateDifference(number1: Double, number2: Double): Double {
    if (number1 > number2) return number1 - number2
    return number2 - number1
}

fun calculateProduct(number1: Double, number2: Double): Double = number1 * number2

fun calculateDivision(number1: Double, number2: Double): Double? {
    if (number2 == 0.0) return null
    return number1 / number2
}

fun main() {
    print("Digite o primeiro número: ")
    val number1 = readln().toDouble()

    print("Digite o segundo número: ")
    val number2 = readln().toDouble()

    println("1 - Média;\n" + "2 - Diferença;\n" + "3 - Produto;\n" + "4 - Divisão;")
    print("Digite a operação desejada: ")
    val operation = readln().toInt()

    val result: Double? = when (operation) {
        1 -> calculateAverage(number1, number2)
        2 -> calculateDifference(number1, number2)
        3 -> calculateProduct(number1, number2)
        4 -> calculateDivision(number1, number2)
        else -> null
    }

    if (result is Double) {
        println("Resultado: $result")
    } else {
        println("Ocorreu um erro")
    }
}