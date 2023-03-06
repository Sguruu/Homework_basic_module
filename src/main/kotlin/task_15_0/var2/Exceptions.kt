package task_15_0.var2


object PressureCheck {
    private const val MESSAGE_TooHighPressure = "Давление слишком высокое"
    private const val MESSAGE_TooLowPressure = "Давление слишком низкое"
    private const val MESSAGE_IncorrectPressure = "Недопустимое давление"

    fun pressureCheck(pressure: Double) {
        if (pressure > 10.0 || pressure < 0.0) throw IncorrectPressure(MESSAGE_IncorrectPressure)
        else if (2.5 < pressure && pressure < 10) throw TooHighPressure(MESSAGE_TooHighPressure)
        else if (0 < pressure && pressure < 1.6) throw TooLowPressure(MESSAGE_TooLowPressure)
    }
}

open class PressureException(message: String?) : Throwable(message)

/**
 * Класс исключение для слишком высокого давления
 */
class TooHighPressure(message: String) : PressureException(message)

/**
 * Класс исключение для слишком низкого давления
 */
class TooLowPressure(message: String) : PressureException(message = message)

/**
 * Класс исключение для недопустимого давления: отрицательное или превышающее 10 атмосфер
 */
class IncorrectPressure(message: String) : PressureException(message = message)
