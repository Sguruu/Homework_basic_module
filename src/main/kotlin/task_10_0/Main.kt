package proverka

/***
Описание задачи :

Написать программу которая узнает у пользователя следующие данные (по средством ввода информации через консоль) :

- Вид массива (одномерный/двумерный)

- Размер массива

- Значение ячеек массива

После этого программа позволяет заполнить массив пользователю.

После заполнения элементов массива программа выводит заполненный массив пользователю.

Пример выполнения :

Вывод в консоль : выберите вид массива 1 - одномерный, 2 - двумерный массив

Ввод в консоль : 1

Вывод в консоль : Вы выбрали создание одномерного массива, введите длину массива

Ввод в консоль : 2

Вывод в консоль : Вы выбрали одномерный массив длиной 2

Вывод в консоль : Заполните одномерный массив

Вывод в консоль : [0] =

Ввод в консоль : 2

Вывод в консоль : [1] =

Ввод в консоль : 3

Вывод в консоль : Массив успешно создан

Вывод в консоль : Вы создали одномерный массив

Вывод в консоль : [0] = 2

Вывод в консоль : [1] = 3

Вывод в консоль : Запустить программу заново ? (Да/Нет)

 *Программа должна использовать любую из типов функций :

Анонимная функция
Лямбда Функция
Измеримость :

Прикреплен скрин выполнения программы к карточке
Прикреплен код программы к карточке
 */
fun main() {

    do {
        println("Введите 1 для одномерного и 2 для двумерного массива")
        when (readLine()?.toIntOrNull()) {
            1 -> {
                // код
                createArrayOne()
                break
            }
            2 -> {
                // код
                createArrayTwo()
                break
            }
            else -> {
                // действие
            }
        }
    } while (true)

}

fun createArrayOne() {

    println("Сколько элементов нужно создать ?")
    val array = arrayOfNulls<Int>(inAnswer())

    println("Введите значние для массива (числовое)")
    array.forEachIndexed { index, i ->
        print("[$index] = ")
        array[index] = inAnswer()
    }

    println("Ваш массив")

    array.forEach {
        println(it)
    }

//    for (index in array) {
//        println(index)
//    }

}

fun createArrayTwo() {
    println("Введите количество столбцов")
    val columnsArray = inAnswer()

    println("Введите количество строк")
    val linesArray = inAnswer()

    val array = Array(linesArray) { Array(columnsArray) { 0 } }

    for (indexOne in array.indices) {
        for (indexTwo in array[indexOne].indices) {
            print("[$indexOne][$indexTwo] = ")
            array[indexOne][indexTwo] = inAnswer()
        }
    }

    array.forEachIndexed { indexOne, arrayOne ->
        arrayOne.forEachIndexed { indexTwo, arrayTwo ->
            print("$arrayTwo ")
        }
        println()
    }

}

fun inAnswer(): Int {
    var answer = readLine()?.toIntOrNull()

    while (answer == null) {
        println("Вы ввели не верное значение введите еще раз")
        answer = readLine()?.toIntOrNull()
    }
    return answer
}