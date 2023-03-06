package task_11_0

/*
11_0_01 Список имен и номеров

Описание задачи :

Разработайте консольную программу, имитирующую работу телефонного справочника.

Шаг 1 Введите число N с клавиатуры. Вводимые символы должны проверяться на соответствие условию N > 0.
В случае невыполнения условия программа должна указывать на ошибку ввода и предлагать ввести число до тех пор,
пока не будет введено корректное значение.

Шаг 2 Введите следующие N телефонных номеров пользователей. Каждый номер должен представлять из себя строку.

Шаг 3 Сохраните введённые номера в список. Используйте для этого MutableList. Заносите в него значения с помощью цикла.

Шаг 4 Вынесите шаги 2 и 3 в функцию, которая принимает число N и возвращает список из N номеров телефонов, введённых с
клавиатуры.

Шаг 5 Выведите в консоль только номера телефонов, начинающиеся с приставки +7. Для этого отфильтруйте список с помощью
функции filter и распечатайте его.

Шаг 6 Выведите в консоль количество уникальных введённых номеров. Для этого преобразуйте список в множество c помощью
функции toSet() и получите размер множества size.

Шаг 7 Вычислите и распечатайте сумму длин всех номеров телефонов с помощью агрегирующей функции коллекции sumOf.

Пример работы:
Введите имя человека с номером телефона +79110123456: Андрей
Введите имя человека с номером телефона +79229876543: Олег
По окончании ввода Map должно содержать записи:
(key=+79110123456, value:Андрей)
(key=+79229876543, value:Олег)

Шаг 8 Выведите содержимое Map в консоль в следующем виде:
Абонент: Андрей. Номер телефона: +79110123456
Абонент: Олег. Номер телефона: +79229876543

Доп материал к выполнению задачи :

Документация по функции filter
https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter.html

Фильтрация коллекций
https://kotlinlang.org/docs/collection-filtering.html

Документация по функции sumOf
https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/sum-of.html

Документация по функции toSet
https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/to-set.html


Измеримость :
Прикреплен скрин выполнения программы к карточке
Прикреплен код программы к карточке
 */

fun main() {
    var valueContact: Int

    do {
        print("Введите количество контактов: ")
        try {
            valueContact = readLine()?.toInt() ?: -1
            if (valueContact > 0) {
                break
            } else {
                println("Необходимо ввести число > 0")
            }
        } catch (e: NumberFormatException) {
            println("Необходимо ввести число, а не символ или строку")
            valueContact = -1
        }
    } while (true)

    val mapListContact: MutableList<Pair<String, String>> = mutableListOf()

    println("Введите имя человека с номером телефона ")
    println("Привем ввода : +79110123456: Андрей")

    mapListContact.addAll(createContact(valueContact))

    println("Номера телефонов начинающихся только с +7")
    val listNumber: List<String> = mapListContact.map {
        it.first
    }.filter {
        it.length >= 2 && it[0] == '+' && it[1] == '7'
    }

    listNumber.forEach {
        println(it)
    }

    println("Вывод уникальных номеров")
    val setNumber = mapListContact.map {
        it.first
    }.toSet()

    println("Количество уникальных номеров ${setNumber.size}")
    println("Вывод уникальных номеров")
    setNumber.forEach {
        println(it)
    }

    print("Сумма длин всех номеров : ")
    val summaLengthNumber = mapListContact.map {
        it.first
    }.sumOf {
        it.length
    }
    print("$summaLengthNumber\n")

    println("Вывод Map в консоль")
    mapListContact.forEach {
        println("Абонент: ${it.second}. Номер телефона: ${it.first}")
    }
}


private fun createContact(valueContact: Int): MutableList<Pair<String, String>> {
    val mapListContact: MutableList<Pair<String, String>> = mutableListOf()
    for (i in 0 until valueContact) {
        println("Контакт ${i.inc()}")

        val answer: List<String> = readLine().toString().split(':', limit = 2)
        val number = answer[0].trim()
        val name = answer[1].trimStart()
        mapListContact.add(Pair(number, name))
    }
    return mapListContact
}

