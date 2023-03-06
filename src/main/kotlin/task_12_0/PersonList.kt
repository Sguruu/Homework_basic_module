package task_12_0

class PersonList() {
    private val list = mutableListOf<Person>()

    fun start() {
        var answer: String?
        println("Привет")
        do {
            println("выбери варинат меню")
            println(
                """
            1 - Добавить
            2 - Удалить
            3 - Редактировать
            4 - Просматривать контакты
            5 - Выйти
        """.trimIndent()
            )
            answer = readLine()

            if (answer != null) {
                when (answer) {
                    "1" -> {
                        println("1")
                        addList()
                    }
                    "2" -> {
                        println("2")
                    }
                    "3" -> {
                        println("3")

                    }
                    "4" -> {
                        println("4")
                        showList()
                    }
                    "5" -> {
                        break
                    }
                    else -> {
                        println("Ошибка, такого варианта нету введите еще раз")
                        continue
                    }
                }
            } else {
                continue
            }
        } while (true)
    }

    private fun addList() {
        println("Введите имя")
        val name = readLine() ?: "Пустое имя"
        println("Введите фамилию")
        val lastName = readLine() ?: "Пустая фамилия"
        println("Введите номер телефона")
        val phoneNumber = readLine() ?: "Пустой номер"

        list.add(Person(name, lastName, phoneNumber))
    }

    private fun showList() {
        if (list.isEmpty()) {
            println("Список контактов пуст")
        } else {
            list.forEach {
                println(it)
            }
        }
    }


}