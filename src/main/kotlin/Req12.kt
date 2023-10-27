fun multiplyLists(list1: List<Int>, list2: List<Int>, result: MutableList<Int>) {
    list1.forEachIndexed { i, it ->
        result.add(it * list2[i])
    }
}

fun main() {
    TODO("Use essa função para rodar o codigo principal")
}
