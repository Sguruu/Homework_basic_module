package task_15_0.var2

import task_15_0.var2.IncorrectPressure
import task_15_0.var2.TooHighPressure
import task_15_0.var2.TooLowPressure
import task_15_0.var2.PressureCheck
import task_15_0.var2.PressureException

/***
 * @param currentPressure текущее давление
 */
class Wheel(currentPressure: Double) {
    private var currencyPressure = 0.0
        set(value) {
            PressureCheck.pressureCheck(value)
            field = value
        }

    init {
        this.currencyPressure = currentPressure
    }

    /**
     * Накачать колесо
     * @param value подаваемое давление
     */
    fun pumpUpWheel(value: Double) {
        val pressure = value + currencyPressure
        try {
            PressureCheck.pressureCheck(value)
            currencyPressure = pressure
            println("При накачке $value атмосфер процедура удалась ")
        } catch (e: TooHighPressure) {
            currencyPressure = pressure
            println("При накачке $value атмосфер процедура удалась ${e.message}")
        } catch (e: TooLowPressure) {
            currencyPressure = pressure
            println("При накачке $value атмосфер процедура удалась ${e.message}")
        } catch (e: IncorrectPressure) {
            println("При накачке $value атмосфер процедура не удалась. ${e.message} ")
        }
    }

    /**
     * Проверить уровень давления
     * @param value подаваемое давление
     */
    fun checkPressureLevel() {
        PressureCheck.pressureCheck(this.currencyPressure)
        println("Давление в колесе составляет ${this.currencyPressure} атмосфер")
    }

}
