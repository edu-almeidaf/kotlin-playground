fun calculateConsumerPrice(factoryCost: Double): Double {
    return when (factoryCost) {
        in 0.0..12000.0 -> factoryCost * 1.05
        in 12000.01..25000.0 -> factoryCost * 1.1 + factoryCost * 0.15
        else -> factoryCost * 1.15 + factoryCost * 0.2
    }
}

fun main() {
    print("Digite o custo de fábrica do carro: ")
    val factoryCost = readln().toDouble()

    println("O preço final para o consumidor desse veículo é de R$${calculateConsumerPrice(factoryCost)}.")
}