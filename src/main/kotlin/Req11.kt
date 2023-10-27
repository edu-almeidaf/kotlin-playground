fun countNegativeNumbers(numbers: List<Double>): Int = (numbers.filter { it < 0 }).size

fun calculateSumOfPositiveNumbers(numbers: List<Double>): Double = numbers.filter { it > 0 }.reduce { acc, it -> acc + it }

fun main() {
    TODO("Use essa função para rodar o codigo principal")
}