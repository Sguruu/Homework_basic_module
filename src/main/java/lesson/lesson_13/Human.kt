package lesson.lesson_13

class Human13(val name: String, val age: Int) {
    // количество конечностей
    val numberLimbs = 4

    companion object {
        fun getAgeDescription(age: Int): String {
            return when (age) {
                in 0..14 -> "Детство"
                in 14..16 -> "Отрочество"
                in 16..20 -> "Юность"
                in 21..35 -> "Молодость"
                in 36..40 -> "Зрелость"
                in 41..100 -> "Старость"
                else -> "Старость ++"
            }
        }

    }
}
