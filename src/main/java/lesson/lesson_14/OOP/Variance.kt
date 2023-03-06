package lesson.lesson_14.OOP

fun main() {
    val cinema: ImplCinema = ImplCinema()
    cinema.showMovie(60)
}

/* Инвариантность */

open class Movie(
    // длительность
    val duration: Int
)

class FantasyMovie(duration: Int) : Movie(duration)

// Кинотеатр
interface Cinema<T : Movie> {

    // показывать фильм
    fun showMovie(duration: Int)

    // получить объект фильма
    fun getShowMovie(duration: Int): T

    // передать через параметр тип T
    fun setShowMovie(obj: T) // ошибка, мы можем только возвращать некий тип T
}

class ImplCinema : Cinema<FantasyMovie> {

    override fun showMovie(duration: Int) {
        println("Смотреть фильм продолжительностью $duration минуты")
    }

    override fun getShowMovie(duration: Int): FantasyMovie {
        return FantasyMovie(23)
    }

    override fun setShowMovie(obj: FantasyMovie) {
        TODO("Not yet implemented")
    }

//    fun showMovieCinema1(obj: Cinema<FantasyMovie>) {
//        val cinema: Cinema<Movie> = obj // ошибка
//    }
//
//    fun showMovieCinema2(obj: Cinema<Movie>) {
//        val cinema: Cinema<FantasyMovie> = obj // ошибка
//    }

    fun showMovieCinema3(obj: Cinema<Movie>) {
        val cinema: Cinema<Movie> = obj
    }
}

/*********************************************/

/* Ковариантность */

open class Movie1(
    // длительность
    val duration: Int
)

class FantasyMovie1(duration: Int) : Movie1(duration)

// Кинотеатр
interface Cinema1<out T : Movie1> {

    // показывать фильм
    fun showMovie(duration: Int)

    // получить объект фильма
    fun getShowMovie(duration: Int): T

    // передать через параметр тип T
    // fun setShowMovie(obj : T) // ошибка, мы можем только возвращать некий тип T
}

class ImplCinema1 : Cinema1<FantasyMovie1> {

    override fun showMovie(duration: Int) {
        println("Смотреть фильм продолжительностью $duration минуты")
    }

    override fun getShowMovie(duration: Int): FantasyMovie1 {
        return FantasyMovie1(23)
    }

    fun showMovieCinema1(obj: Cinema1<FantasyMovie1>) {
        val cinema: Cinema1<Movie1> = obj // нет ошибки
    }

//    fun showMovieCinema2(obj: Cinema1<Movie1>) {
//        val cinema: Cinema1<FantasyMovie1> = obj // ошибка
//    }

    fun showMovieCinema3(obj: Cinema1<Movie1>) {
        val cinema: Cinema1<Movie1> = obj // нет ошибки
    }
}

/* Контравариантность */

open class Movie3(
    // длительность
    val duration: Int
)

class FantasyMovie3(duration: Int) : Movie3(duration)

// Кинотеатр
interface Cinema3<in T : Movie3> {

    // показывать фильм
    fun showMovie(duration: Int)

    // получить объект фильма
    // fun getShowMovie(duration: Int): T // ошибка мы можем только принмать некий тип T

    // передать через параметр тип T
    fun setShowMovie(obj: T) // ошибка, мы можем только возвращать некий тип T
}

class ImplCinema3 : Cinema3<FantasyMovie3> {

    override fun showMovie(duration: Int) {
        println("Смотреть фильм продолжительностью $duration минуты")
    }

    override fun setShowMovie(obj: FantasyMovie3) {}

//    fun showMovieCinema1(obj: Cinema3<FantasyMovie3>) {
//        val cinema: Cinema3<Movie3> = obj // ошибкa
//    }

    fun showMovieCinema2(obj: Cinema3<Movie3>) {
        val cinema: Cinema3<FantasyMovie3> = obj // нет ошибка
    }

    fun showMovieCinema3(obj: Cinema3<Movie3>) {
        val cinema: Cinema3<Movie3> = obj // нет ошибки
    }
}

/*********************************************/
