package task_9_4

/*

09_4_01 Расшифровываем сообщение

Описание задачи :
Я зашифровал некоторое сообщение. Алгоритм, который я использовал, выглядит так:

1. Разделить сообщение пополам.

2. Обработать первую половину сообщения следующим образом:
2.1. В исходном тексте заменить все символы о на символ 0 (ноль).
2.2. В получившемся тексте заменить каждый символ сообщения символом, стоящим на 3 правее от исходного (сдвиг каждого
символа вправо на 3).
2.3. В получившемся тексте заменить все символы u на цифру 4.
2.4. В получившемся тексте заменить все символы s на цифру 5.
2.5. В получившемся тексте заменить каждый символ сообщения символом, стоящим на 1 левее от исходного (сдвиг каждого
символа влево на 1).

3. Вторую половину сообщения обработать так:
3.1. Заменить пробелы на символ _
3.2. В получившемся тексте заменить каждый символ сообщения символом, стоящим на 4 правее от исходного (сдвиг каждого
символа вправо на 4).
3.3. Развернуть получившуюся строку.
4. Соединить обе зашифрованные половины.

В результате работы алгоритма я получил строку: F2p)v»y233{0->c}ttelciFc

Напишите программу, которая будет расшифровывать сообщение и выводить исходное сообщение в консоль.

Для расшифровки текста напишите функции, которые будут проходить алгоритм в обратном направлении: например, заменить все
символы 5 на символ s — обратное действие для пункта 2.4 моего алгоритма.

1. Создайте функцию для расшифровки первой половины сообщения. Используйте для этого алгоритм, обратный данному.

2. Создайте функцию для расшифровки второй половины сообщения. Используйте для этого алгоритм, обратный данному.

3. По желанию. Создайте функцию высшего порядка shift(), с помощью которой можно осуществлять сдвиг всех символов в строке. Функция должна:
принимать на вход строку и функцию преобразования текущего символа (параметр функционального типа);
возвращать изменённую строку. Используйте эту функцию в функциях 1 и 2.

Советы и рекомендации
Для замены всех символов строки символом правее/левее (сдвиг всех символов вправо/влево) используйте функцию высшего
порядка map, которая принимает лямбда-выражение по обработке текущего символа в связке с вызовом функции
joinToString(“”), которая преобразует результат работы функции map в строку.
val shiftedString = sourceString.map {char -> char + 1}.joinToString(“”) ― заменяет все символы строки на соседний символ,
справа от текущего (сдвиг всех символов вправо на 1).

Воспользуйтесь документацией по функции map  и reversed.

Документация :
map : https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/map.html
reversed : https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/reversed.html

!!! Важно !!!

Должны быть выполнены два обязательных задания.

Если с заданием 3 возникнут проблемы, можно пропустите задание.

Названия переменных должны отражать суть данных, на которые они ссылаются.

Переменные, которые не изменяются в программе, должны быть объявлены неизменяемыми.

Различные выводы в консоль должны начинаться с новой строки.

Измеримость :
Прикреплен скрин выполнения программы к карточке
Прикреплен код программы к карточке

*/

fun main() {
    //finalResultOne()
    finalResultTwo()
}

// Решение задачи первый вариант
fun finalResultOne() {
    val secretMessage = "F2p)v»y233{0->c}ttelciFc"
    val messageUser: String
    var secretMessageOne: String
    var secretMessageTwo: String

    // Делю обе зашифрованные половины
    secretMessageOne = secretMessage.dropLast(secretMessage.length / 2)
    secretMessageTwo = secretMessage.drop(secretMessage.length / 2)

    // Работа с второй половиной
    // Развернуть получившуюся строку
    secretMessageTwo = secretMessageTwo.reversed()

    // В получившемся тексте заменить каждый символ сообщения символом, стоящим на 4 левее от исходного (сдвиг каждого символа влево на 4)."
    secretMessageTwo = secretMessageTwo.map { it - 4 }.joinToString("")

    //  Заменить  символ _ на пробелы
    secretMessageTwo = secretMessageTwo.replace('_', ' ')
    println(secretMessageTwo)

    // Работа над первой половиной
    //В получившемся тексте заменить каждый символ сообщения символом, стоящим на 1. правее от исходного (сдвиг каждого символа вправо на 1)"
    secretMessageOne = secretMessageOne.map { it + 1 }.joinToString("")

    // В получившемся тексте заменить все 5 на s
    secretMessageOne = secretMessageOne.replace('5', 's')

    // В получившемся тексте заменить все символы 4 на u
    secretMessageOne = secretMessageOne.replace('4', 'u')

    // В получившемся тексте заменить каждый символ сообщения символом, стоящим на 3 левее от исходного
    // (сдвиг каждого символа влево на 3)
    secretMessageOne = secretMessageOne.map { it - 3 }.joinToString("")
    //secretMessageOne = shift(secretMessageOne) { char -> char - 3 }

    // В исходном тексте заменить все символы 0 на символ o .
    secretMessageOne = secretMessageOne.replace('0', 'o')

    //  Сложить сообщения
    messageUser = secretMessageOne + secretMessageTwo
    println(messageUser)

}

// Решение задачи второй вариант
fun finalResultTwo() {
    val secretMessage = "F2p)v»y233{0->c}ttelciFc"
    val messageUser: String
    val secretMessageOne: String
    val secretMessageTwo: String

    // Делю обе зашифрованные половины
    secretMessageOne = secretMessage.dropLast(secretMessage.length / 2)
    secretMessageTwo = secretMessage.drop(secretMessage.length / 2)

    messageUser = firstPartDecoder(secretMessageOne) + twoPartDecoder(secretMessageTwo)

    println(messageUser)
}


fun firstPartDecoder(secretMessage: String): String {
    var messageDecode = secretMessage
    // Работа над первой половиной
    //В получившемся тексте заменить каждый символ сообщения символом, стоящим на 1. правее от исходного (сдвиг каждого символа вправо на 1)"
    messageDecode = shift(messageDecode) { it + 1 }

    // В получившемся тексте заменить все 5 на s
    messageDecode = messageDecode.replace('5', 's')

    // В получившемся тексте заменить все символы 4 на u
    messageDecode = messageDecode.replace('4', 'u')

    // В получившемся тексте заменить каждый символ сообщения символом, стоящим на 3 левее от исходного
    // (сдвиг каждого символа влево на 3)
    messageDecode = shift(messageDecode) { it - 3 }
    //secretMessageOne = shift(secretMessageOne) { char -> char - 3 }

    // В исходном тексте заменить все символы 0 на символ o .
    messageDecode = messageDecode.replace('0', 'o')

    return messageDecode
}

fun twoPartDecoder(secretMessage: String): String {
    var messageDecode = secretMessage
    // Работа с второй половиной
    // Развернуть получившуюся строку
    messageDecode = messageDecode.reversed()

    // В получившемся тексте заменить каждый символ сообщения символом, стоящим на 4 левее от исходного (сдвиг каждого символа влево на 4)."
    messageDecode = shift(messageDecode) { it - 4 }

    //  Заменить  символ _ на пробелы
    messageDecode = messageDecode.replace('_', ' ')
    return messageDecode
}

fun shift(text: String, callback: (char: Char) -> Char): String {
    return text.map { callback(it) }.joinToString("")

}
