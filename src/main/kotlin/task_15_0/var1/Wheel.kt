package task_15_0.var1

class Wheel(currencyPressure: Double) {
    private var currencyPressure = 0.0
        set(value) {
            if (value > 10 || value < 0) throw IncorrectPressure()
            field = value
        }

    init {
       this.currencyPressure = currencyPressure
    }

    fun pumpUpWheel(value: Double) {
        val pressure = value + currencyPressure
        try {
            if (pressure > 10 || pressure < 0) throw IncorrectPressure()
            else if (2.5 < pressure && pressure < 10) throw TooHighPressure()
            else if (0 < pressure && pressure < 1.6) throw TooLowPressure()
            currencyPressure = pressure
            println("При накачке $value атмосфер процедура удалась ")
        } catch (e: TooHighPressure) {
            currencyPressure = pressure
            println("При накачке $value атмосфер процедура удалась ${e.message}")
        } catch (e: TooLowPressure) {
            currencyPressure = pressure
            println("При накачке $value атмосфер процедура удалась ${e.message}")
        } catch (e: IncorrectPressure) {
            println("При накачке $value атмосфер процедура не удалась. ${e.message}")
        }
    }

    fun checkPressureLevel() {
        if (2.5 < currencyPressure && currencyPressure < 10) throw TooHighPressure()
        if (0 < currencyPressure && currencyPressure < 1.6) throw TooLowPressure()
        if (currencyPressure > 10 || currencyPressure < 0) throw IncorrectPressure()
    }
}