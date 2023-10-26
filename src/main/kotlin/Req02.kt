fun calculateCommission(salesAmount: Double): Double {
    return salesAmount * 0.04
}

fun calculateFinalSalary(baseSalary: Double, commission: Double): Double {
    return baseSalary + commission
}

fun main() {
    print("Digite o salário base do funcionário: ")
    val baseSalary = readln().toDouble()

    print("Digite o total de vendas do funcionário nesse mês: ")
    val salesAmount = readln().toDouble()

    val commission = calculateCommission(salesAmount)
    val finalSalary = calculateFinalSalary(baseSalary, commission)

    println(finalSalary)
}