package yandex_test

fun main() {

    test3()
}

fun test3() {
    // смех над новой шуткой
    val jokeMomLaugh = readLine()?.toInt() ?: 0
    // количество шуток в исходной программе
    var countJokeProgramm = readLine()?.toInt() ?: 0
    val text = readLine().toString().replace("\\s+".toRegex(), "")
    val listNumber = mutableListOf<Int>()
    // смех без идеальной шутки
    var simpleProgram = 0
    var newProgram = 0
    text.forEach {
        listNumber.add(Integer.parseInt(it.toString()))
    }

    listNumber.forEachIndexed { index, i ->
        simpleProgram += ((index + 1) * i)
    }

    // ищем идеальное место вставки шутки
    var perfectJokeIndex: Int? = null
    for (i in 0..countJokeProgramm - 1) {
        if (jokeMomLaugh < listNumber[i]) {
            perfectJokeIndex = i - 1
        }
    }

    when (perfectJokeIndex != null) {
        true -> {
            listNumber.add(perfectJokeIndex, jokeMomLaugh)
            listNumber.forEachIndexed { index, i ->
                newProgram += (index + 1) * i
            }
        }
        else -> {
            listNumber.add(jokeMomLaugh)
            listNumber.forEachIndexed { index, i ->
                newProgram += (index + 1) * i
            }
        }
    }
    println(newProgram - simpleProgram)
}

fun test1() {
    val inputChar = readLine().toString().replace("\\s+".toRegex(), "")
    val listABC = mutableListOf<Int>()
    inputChar.forEach {
        listABC.add(Integer.parseInt(it.toString()))
    }

    println(proverka(listABC.sorted()))
}

private fun proverka(list: List<Int>): Int {
    for (i in list.indices) {
        for (y in list.indices) {
            if (i != y && list[i] == list[y]) {
                return list[y]
            }
        }
    }

    return list[list.size / 2]
}