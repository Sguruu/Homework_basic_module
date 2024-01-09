package task_9_3

/*
09_3.01 У тебя все получиться (Kotlin)
Описание задачи :

Написать программу которая выведет заданное количество раз фразу «У тебя все получится [Введенное имя пользователя]»
Программа должна спросить у пользователя сколько раз нужно вывести фразу
Программа должна спросить у пользователя какое его имя и вставить в фразу «У тебя все получится
[Введенное имя пользователя]»

Измеримость :
Прикреплен скрин выполнения программы к карточке
Прикреплен код программы к карточке
 */
fun main() {
    val text = "У тебя все получится"
    println("Привет! Как тебя зовут?")
    val name = readLine()!!.toString()
    println("Сколько раз выводить фразу?")
    val count = readLine()!!.toInt()
    val str: String = "$text, $name! \n".repeat(count)
    println(str)

    Dog("123",3)
}


class Dog(name: String) {
    val name = name
    var age = 10

    init {
        println("1")
    }

    init {
        println("2")
    }

    constructor(name: String, age: Int) : this(name) {
        println("constructor")
        this.age = age
    }

    constructor(name: String, lastName: String) : this(name) {

    }
}