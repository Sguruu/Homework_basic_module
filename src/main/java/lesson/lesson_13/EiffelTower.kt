package lesson.lesson_13

object EiffelTower {
    private var backlightsOn = false
    val height = 324

    fun turnOnBackLights() {
        println("подстветка включена")
        backlightsOn = true
    }

    fun turnOffBackLights() {
        println("подстветка отключена")
        backlightsOn = false
    }
}