package task_14_0
/*
Цели домашнего задания
Применить на практике особенности работы с интерфейсами и анонимными объектами.

Что нужно сделать
Создайте интерфейс CurrencyConverter. Интерфейс должен описывать:
поле currencyCode, которое хранит международный код валюты в виде строки;
функцию convertToRub, которая конвертирует рубли в валюту.
Создайте несколько реализаций интерфейса CurrencyConverter. Определите в каждой реализации поле currencyCode и функцию convertToRub.
Создайте объект-синглтон Converters, который хранит все созданные вами конвертеры валют. Объявите в нём функцию get(currencyCode: String), которая возвращает конвертер, основываясь на переданном currencyCode.
В функции main с помощью объекта Converters и функции get получите несколько конвертеров для разных валют.
Рассмотрите случаи, когда в функцию get объекта Converters передаются неизвестные коды валют (для такой валюты не существует конвертера, вы его не описали. Например: зимбабвийский доллар). В таких случаях используйте анонимные объекты, которые реализуют интерфейс CurrencyConverter для каждой из неизвестных валют.
Для каждого из конвертеров проверьте правильность расчётов и выведите в консоль сообщение формата «n рублей = m %код валюты%».

Что оценивается
Программа запускается, корректно работает и выводит необходимую информацию.
Выполнены все пункты задания.
Соблюдена инкапсуляция, доступны только публичные члены классов.
Функции соответствуют принципам чёрного ящика, выполняют атомарные операции и независимы друг от друга.
Функции возвращают неизменяемые коллекции.
Названия переменных отражают суть данных, на которые они ссылаются.
Переменные, которые не изменяются в программе, объявлены неизменяемыми.
Открыты только необходимые для переопределения функции.
Открыты только необходимые для наследования классы.
Различные выводы в консоль начинаются с новой строки.
Плохо: «Вывод информации 1. Вывод информации 2».

Хорошо:

«Вывод информации 1.

Вывод информации 2».
 */

fun main() {
    println("Вас приветсвует программа, введите международный код валюты")
    val сurrencyConverter = Converters.getConverter(readLine().toString())
    println("Введите количество рублей")
    readLine()?.let { сurrencyConverter.convertToRub(it.toLong()) }
}

interface CurrencyConverter {
    val currencyCode: String

    fun convertToRub(valueRub: Long)
}

class CurrencyConverterUsd() : CurrencyConverter {
    override val currencyCode: String = "USD"

    override fun convertToRub(valueRub: Long) {
        val usd = valueRub / 70.79
        println("$valueRub рублей = $usd доллар США  $currencyCode")
    }
}

class CurrencyConverterUzs() : CurrencyConverter {
    override val currencyCode = "UZS"

    override fun convertToRub(valueRub: Long) {
        val uzs = valueRub / 0.0064
        println("$valueRub рублей = $uzs Узбекский сумм $currencyCode")
    }
}

object Converters {
    private val listConverter: List<CurrencyConverter> = listOf(CurrencyConverterUsd(), CurrencyConverterUzs())

    fun getConverter(currencyCode: String): CurrencyConverter {
        listConverter.forEach {
            if (it.currencyCode == currencyCode) {
                return it
            }
        }

        println("Введите международный код валюты")
        val currencyCodeAnswer: String = readLine().toString()
        println("Введите стоимость еденицы валюты в рублях")
        val cursAnswer: Long = (readLine()?.toLong() ?: 0.11) as Long

        return object : CurrencyConverter {
            override val currencyCode: String = currencyCodeAnswer

            override fun convertToRub(valueRub: Long) {
                val curs = valueRub / cursAnswer
                println("$valueRub рублей = $curs $currencyCode")
            }

        }
    }
}