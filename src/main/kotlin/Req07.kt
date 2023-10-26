fun calculateAverage(ages: List<Int>): Double = (ages.sum() / ages.size).toDouble()

fun countPeopleWeightHeight(weights: List<Double>, heights: List<Double>): Int {
    var people = 0
    for (i in heights.indices) {
        if (weights[i] > 90 && heights[i] < 1.5) people += 1
    }
    return people
}

fun calculatePercentageAgeHeight(ages: List<Int>, heights: List<Double>): Int {
    var people = 0
    for (i in heights.indices) {
        if (ages[i] in 10..30 && heights[i] > 1.9) people += 1
    }
    return people * 100 / heights.size
}

fun main() {
    val ages = mutableListOf<Int>()
    val heights = mutableListOf<Double>()
    val weights = mutableListOf<Double>()

    for (i in 1..10) {
        print("Digite a idade da ${i}ª pessoa: ")
        ages.add(readln().toInt())

        print("Digite a altura da ${i}ª pessoa: ")
        heights.add(readln().toDouble())

        print("Digite o peso da ${i}ª pessoa: ")
        weights.add(readln().toDouble())
    }

    println("Média das idades: ${calculateAverage(ages)}")
    println("Pessoas com peso maior que 90Kg e altura maior que 1,5m: ${countPeopleWeightHeight(weights, heights)}")
    println("Porcentagem das pessoas com idade entre 10 e 30 anos e altura maior do que 1,9m: ${calculatePercentageAgeHeight(ages, heights)}")
}