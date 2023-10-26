fun calculateConsumerPrice(factoryCost: Double): Double {
    if (factoryCost <= 12000.0) {
        return factoryCost * 1.05
    }
    if (factoryCost > 12000.0 && factoryCost <= 25000.0) {
        return factoryCost * 1.1 + factoryCost * 0.15
    }

    return factoryCost * 1.15 + factoryCost * 0.2
}

fun main() {
    print("Digite o custo de fábrica do carro: ")
    val factoryCost = readln().toDouble()

    println("O preço final para o consumidor desse veículo é de R$${calculateConsumerPrice(factoryCost)}.")
}