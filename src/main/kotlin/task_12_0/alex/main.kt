package task_12_0.alex

class Contact(var firstName: String, var lastName: String, var phoneNumber: String)

fun main() {
    println("Программа Записная книжка привествует Вас!")
    val contacts = mutableListOf<Contact>()
    while (true) {
        println("Выберите действие:")
        println("1 - Добавить контакт")
        println("2 - Удалить контакт")
        println("3 - Редактировать контакт")
        println("4 - Просмотреть контакты")
        println("0 - Выйти из программы")
        val choice = readLine()?.toIntOrNull()
        when (choice) {
            1 -> contactAdd(contacts)
            2 -> contactDelete(contacts)
            3 -> contactEdit(contacts)
            4 -> contactView(contacts)
            0 -> return println("Программа завершила свою работу, до новых встреч!")
            else -> println("Неверный выбор!")
        }
    }
}
fun contactAdd(contacts: MutableList<Contact>) {
    print("Введите имя: ")
    val firstName = readLine() ?: ""
    print("Введите фамилию: ")
    val lastName = readLine() ?: ""
    print("Введите номер телефона: ")
    val phoneNumber = readLine() ?: ""
    contacts.add(Contact(firstName, lastName, phoneNumber))
    println("Новый контакт: $firstName $lastName | $phoneNumber | успешно создан...")
}

fun contactDelete(contacts: MutableList<Contact>) {
    print("Введите номер контакта для удаления: ")
    val index = readLine()?.toIntOrNull() ?: return
    if (index >= 0 && index < contacts.size) {
        val contact = contacts.removeAt(index)
        println("Контакт: ${contact.firstName} ${contact.lastName} | ${contact.phoneNumber} | удалён...")
    } else {
        println("Неверный номер контакта!")
    }
}

fun contactEdit(contacts: MutableList<Contact>) {
    print("Введите номер контакта для редактирования: ")
    val index = readLine()?.toIntOrNull() ?: return
    if (index >= 0 && index < contacts.size) {
        val contact = contacts[index]
        print("Введите новое имя (${contact.firstName}): ")
        val firstName = readLine() ?: ""
        print("Введите новую фамилию (${contact.lastName}): ")
        val lastName = readLine() ?: ""
        print("Введите новый номер телефона (${contact.phoneNumber}): ")
        val phoneNumber = readLine() ?: ""
        if (firstName.isNotBlank()) contact.firstName = firstName
        if (lastName.isNotBlank()) contact.lastName = lastName
        if (phoneNumber.isNotBlank()) contact.phoneNumber = phoneNumber
        println("Контакт: ${contact.firstName} ${contact.lastName} | ${contact.phoneNumber} | успешно отредактирован...")
    } else {
        println("Неверный номер контакта!")
    }
}
fun contactView(contacts: List<Contact>) {
    if (contacts.isEmpty()) {
        println("Список контактов пуст!")
    } else {
        println("Список контактов:")
        for ((index, contact) in contacts.withIndex()) {
            println("${index}) | ${contact.firstName} ${contact.lastName} | ${contact.phoneNumber} |")
        }
    }
}