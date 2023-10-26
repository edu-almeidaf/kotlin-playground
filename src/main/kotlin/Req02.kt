fun calculateCommission(salesAmount: Double): Double = salesAmount * 0.04

fun calculateFinalSalary(baseSalary: Double, commission: Double): Double = baseSalary + commission

fun main() {
    print("Digite o salário base do funcionário: ")
    val baseSalary = readln().toDouble()

    print("Digite o total de vendas do funcionário nesse mês: ")
    val salesAmount = readln().toDouble()

    val finalSalary = calculateFinalSalary(baseSalary, calculateCommission(salesAmount))

    println(finalSalary)
}