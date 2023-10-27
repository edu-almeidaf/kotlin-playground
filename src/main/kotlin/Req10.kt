fun findMultiplesOf2(numbers: IntArray): List<Int> = numbers.filter { it % 2 == 0 }

fun findMultiplesOf3(numbers: IntArray): List<Int> = numbers.filter { it % 3 == 0 }

fun findMultiplesOf2And3(numbers: IntArray): List<Int> = numbers.filter { it % 2 == 0 && it % 3 == 0 }

fun main() {
    TODO("Use essa função para rodar o codigo principal")
}
