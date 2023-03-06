package task_13_0
/*
13_0_01 Кредитные карты

Описание задачи :
Создайте абстрактный класс BankCard, который будет описывать сущность «Банковская карта». Этот класс должен предоставлять
свойство «Баланс», а также функции:
	«Пополнить» — пополняет карту на переданную сумму;
	«Оплатить» — списывает с карты переданную сумму и возвращает результат типа Boolean;
	«Получить информацию о балансе»;
	«Получить информацию о доступных средствах» — возвращает информацию о балансе, кредитном лимите и любых других средствах.
Создайте два производных от BankCard класса DebitCard и CreditCard.
В классе DebitCard реализуйте функции «Пополнить» и «Получить информацию о балансе».
Класс CreditCard должен иметь дополнительное свойство «Кредитный лимит». Основные средства кредитной карты состоят из
двух частей: кредитная часть и собственные средства. При пополнении кредитной карты необходимо сначала погасить
кредитную часть, и только затем увеличивать собственные средства. При оплате сначала списываются собственные средства,
затем кредитные.

Пример
Кредитная карта с лимитом 10 000.
Кредитные средства: 10 000.
Собственные средства: 0.

После пополнения карты на 5 000:
Кредитные средства: 10 000.
Собственные средства: 5 000.

После оплаты на 5 000:
Кредитные средства: 10 000.
Собственные средства: 0.

После оплаты на 3 000:
Кредитные средства: 7 000.
Собственные средства: 0.

После пополнения на 2 000:
Кредитные средства: 9 000.
Собственные средства: 0.

После пополнения на 2 000:
Кредитные средства: 10 000.
Собственные средства: 1 000.

Реализуйте функции «Пополнить», «Оплатить» и «Получить информацию о балансе». Должны учитываться как собственные,
так и кредитные средства.

Создайте несколько производных классов от DebitCard и CreditCard.
Добавьте для конкретных дебетовых и кредитных карт различные бонусные программы в виде отдельных переменных.

Примеры
Бонусные баллы в размере 1% от покупок.
Потенциальный кэшбэк 5% от покупок при условии трат больше 5 000 тыс.
Накопление в размере 0.005% от суммы пополнений.

Для конкретных дебетовых и кредитных карт скорректируйте функции «Пополнить» и «Оплатить» так, чтобы они учитывали
конкретные бонусные программы.
Для конкретных дебетовых и кредитных карт реализуйте функцию «Получение информации обо всех доступных средствах».
Функция должна учитывать собственные и кредитные средства, а также соответствующие бонусы.
Проанализируйте получившиеся классы. При необходимости перенесите реализацию функций на уровень выше.
Убедитесь, что все функции ваших классов работают корректно. Для этого создайте экземпляры классов и проверьте работу
каждой из описанных функций.

Измеримость :
Прикреплен скрин выполнения программы к карточке
Прикреплен код программы к карточке
 */

fun main(args: Array<String>) {
    val debitCard = DebitCard(2000.0)
    val creditCard = CreditCard(balance = 0.0)

    debitCard.getBalanceInformation()
    println(debitCard.pay(2500.0))
    println(debitCard.pay(200.0))
    debitCard.getBalanceInformation()
    println("У тебя осталось всего ${debitCard.getInformationAboutAvailableMedia()}")

    println()

    creditCard.getBalanceInformation()
    println(creditCard.pay(2500.0))
    println(creditCard.pay(200.0))
    creditCard.getBalanceInformation()
    println("У тебя осталось всего ${creditCard.getInformationAboutAvailableMedia()}")
    creditCard.topUp(30000.0)
    creditCard.getBalanceInformation()
}

abstract class BankCard {
    protected abstract var balance: Double

    /** пополняет карту на переданную сумму
     */
    abstract fun topUp(value: Double)

    /** списывает с карты переданную сумму и возвращает результат типа Boolean
     */
    abstract fun pay(value: Double): Boolean

    /** получить информацию о балансе
     */
    open fun getBalanceInformation() {
        println("Ваш баланс $balance")
    }

    /**
     * возвращает информацию о балансе, кредитном лимите и любых других средствах
     */
    abstract fun getInformationAboutAvailableMedia(): Double
}

class DebitCard(override var balance: Double = 0.0) : BankCard() {
    override fun topUp(value: Double) {
        balance += value
    }

    override fun pay(value: Double): Boolean {
        if (balance < value) {
            return false
        } else {
            balance -= value
            return true
        }
    }

    override fun getInformationAboutAvailableMedia(): Double {
        return balance
    }
}

class CreditCard(
    private val creditLimit: Double = 10_000.0,
    /**
     * Личные средства
     */
    override var balance: Double
) : BankCard() {
    /**
     * Доступные кредитные средства
     */
    private var currentCreditBalance = creditLimit

    /**
     * Основные средства
     */
    private var fixedAssets = balance + currentCreditBalance

    override fun topUp(value: Double) {
        if (creditLimit == currentCreditBalance) {
            balance += value // тоже самое balance = balance + value
        } else {
            // 1. Нужно сначала попонить кредитный лимит
            // 2. Остаток прибавить к нашему балансу
            balance += topCurrentCreditBalance(value)
        }
        updateBalance()
    }

    override fun pay(value: Double): Boolean {
        val result: Boolean
        if (fixedAssets >= value) {
            // 1. Списать с личных средств, если личных не хватило, то с кредитных списать
            balance -= value
            if (balance < 0) {
                currentCreditBalance += balance
                balance = 0.0
            }
            result = true

            // cachBack
        } else {
            result = false
        }
        updateBalance()
        return result
    }

    override fun getBalanceInformation() {
        super.getBalanceInformation()
        println("Доступные кредитные средства $currentCreditBalance")
        println("Кредитный лимит $creditLimit")
        println("Основные средства $fixedAssets")
    }

    override fun getInformationAboutAvailableMedia(): Double {
        return fixedAssets
    }

    private fun cachBack(){
        // сумма траты больше 5 000 тысяч руб ?
        // если да,5%
        // если нет, 0
    }

    /**
     *  Пополнение кредитного баланса
     */
    private fun topCurrentCreditBalance(value: Double): Double {
        // 1. Пополнить кредитный лемит
        val thereRemainder = (currentCreditBalance + value) > creditLimit

        // 2. Вернуть остаток
        when (thereRemainder) {
            // true есть остаток
            true -> {
                // необходиммая сумма для закрытие кредит баланса
                val valueClosingCreditBalance = (creditLimit - currentCreditBalance)
                currentCreditBalance = creditLimit
                return value - valueClosingCreditBalance
            }
            // false остатка нет
            false -> {
                currentCreditBalance += value
                return 0.0
            }
        }
    }

    private fun updateBalance() {
        fixedAssets = balance + currentCreditBalance
    }
}