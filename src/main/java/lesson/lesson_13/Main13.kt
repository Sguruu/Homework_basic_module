package lesson.lesson_13

fun main() {
    val human = Human13("Сергей", 25)
    // получить значение количества конечностей
    human.numberLimbs
   println(Human13.getAgeDescription(human.age))
}

private fun createPerson(name: String, age: Int, company: String) = object : Person(name, age) {
    private val company = "ГазпромБанк"
    override fun sayHello() {
        super.sayHello()
        print(" работаю в компании $company")
    }
}

open class Person(val name: String, val age: Int) {
    open fun sayHello() {
        print("Привет меня зовут $name")
    }
}



