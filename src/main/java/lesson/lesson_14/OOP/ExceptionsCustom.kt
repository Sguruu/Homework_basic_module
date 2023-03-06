package lesson.lesson_14.OOP

import kotlin.random.Random


fun main() {
    val admin = Account(1, AccountType.ADMIN)
    Server.dropDatabase(admin)

    val user = Account(2,AccountType.USER)
    // Ошибка в праве доступа
    Server.dropDatabase(user)
}

class AccessRestrictedException : Throwable(message = "Ошибка в праве доступа")

object Server {
    fun dropDatabase(user: Account) {
        when (user.type) {
            AccountType.ADMIN -> println("Очистить базу данных")
            else -> throw AccessRestrictedException()
        }
    }
}

data class Account(val id: Int, val type: AccountType)

enum class AccountType {
    ADMIN, USER
}
