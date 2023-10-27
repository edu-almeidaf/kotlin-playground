fun calculateSumEven(numbers: List<Int>): Int = numbers.filter { it % 2 == 0 }.reduce { acc, it -> acc + it }

fun calculateSumOdd(numbers: List<Int>): Int = numbers.filter { it % 2 != 0 }.reduce { acc, it -> acc + it }

fun main() {
    val numbers = mutableListOf<Int>()

    for(i in 1..10) {
        print("Digite um número: ")
        numbers.add(readln().toInt())
    }

    println("Soma dos números pares: ${calculateSumEven(numbers)}")
    println("Soma dos números ímpares: ${calculateSumOdd(numbers)}")
}