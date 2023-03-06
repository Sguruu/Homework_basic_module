package task_15_0.var1

/**
 * для слишком высокого давления
 */
class TooHighPressure : Throwable("Давление слишком высокое")

/**
 * для слишком низкого давления
 */
class TooLowPressure : Throwable("Давление слишком низкое")

/**
 * для недопустимого давления: отрицательное или превышающее 10 атмосфер
 */
class IncorrectPressure : Throwable("Недопустимое давление")