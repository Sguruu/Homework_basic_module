package lesson.lesson_14.OOP

fun main() {
    val oleg: Human = Person("Олега", 45)
    val tolik: Human = Gopnik("Толня", 18)
    // Привет меня зовут Олега мне 45
    oleg.hello()
    tolik.hello()
}

// Полиморфизм

interface Human {
    val name: String
    val age: Int

    fun hello()
}

class Person(override val name: String, override val age: Int) : Human {
    override fun hello() {
        println("Привет меня зовут $name мне $age")
    }
}

class Gopnik(override val name: String, override val age: Int) : Human {
    override fun hello() {
        println("Привет епта")
        println("Сигарет есть ? А если найду, хехе, да ладно не дрейф, меня вообще $name звать")
    }
//    try {
//        // код, генерирующий исключение
//    }
//    catch (e: Exception) {
//        // обработка исключения
//    }
//    finally {
//        // постобработка
//    }
}



