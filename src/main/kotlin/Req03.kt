fun calculateYears(birthYear: Int, currentYear: Int): Int = currentYear - birthYear

fun calculateMonths(birthYear: Int, currentYear: Int): Int = calculateYears(birthYear, currentYear) * 12

fun calculateDays(birthYear: Int, currentYear: Int): Long =
    (((currentYear - birthYear) / 4) + (currentYear - birthYear) * 365).toLong()

fun calculateWeeks(birthYear: Int, currentYear: Int): Long = calculateDays(birthYear, currentYear) / 7

fun main() {
    print("Digite o ano atual: ")
    val currentYear = readln().toInt()

    print("Digite o ano de nascimento: ")
    val birthYear = readln().toInt()

    println("Idade da pessoa em anos: ${calculateYears(birthYear, currentYear)}")
    println("Idade da pessoa em meses: ${calculateMonths(birthYear, currentYear)}")
    println("Idade da pessoa em dias: ${calculateDays(birthYear, currentYear)}")
    println("Idade da pessoa em semanas: ${calculateWeeks(birthYear, currentYear)}")
}