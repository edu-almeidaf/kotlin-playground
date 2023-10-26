fun calculateNewSalary(currentSalary: Double): Double {
    return when (currentSalary) {
        in 0.0..300.0 -> currentSalary * 1.5
        in 300.01..500.0 -> currentSalary * 1.4
        in 500.01..700.0 -> currentSalary * 1.3
        in 700.01..800.0 -> currentSalary * 1.2
        in 800.01..1000.0 -> currentSalary * 1.1
        else -> currentSalary * 1.05
    }
}

fun main() {
    print("Digite o salário do colaborador: ")
    val currentSalary = readln().toDouble()

    println("O salário final com o aumento é de R$${calculateNewSalary(currentSalary)}")
}