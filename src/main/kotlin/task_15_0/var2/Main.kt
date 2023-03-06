package task_15_0.var2

/*
Описание задачи :

Необходимо написать приложение, имитирующее данные датчика колеса. Автомобильные колёса нужно накачивать строго до
определённого давления. При превышении или занижении значения программа должна выбрасывать и обрабатывать
соответствующие исключения.

Нормальным давлением будем считать значения от 1,6 до 2,5 атмосферы, при которых покрышка не слетит с диска и колесо
будет хорошо взаимодействовать с дорогой.

Давление в колесе не может быть отрицательным (вакуум без давления покрышка не держит).

Если давление в колесе превысит 10 атмосфер — оно взорвётся. Таким образом, мы можем накачать колесо от 0 до 10
атмосфер, а допустимыми значениями для эксплуатации будем считать значения от 1,6 до 2,5 атмосфер.

1. Создайте классы исключений:
TooHighPressure (для слишком высокого давления);
TooLowPressure (для слишком низкого давления);
IncorrectPressure (для недопустимого давления: отрицательное или превышающее 10 атмосфер).

2. Создайте класс колеса Wheel.
Свойства:
текущее давление.
Функции:
накачать колесо до определённого давления (если подаваемое давление недопустимо, функция выбрасывает соответствующее
исключение, иначе устанавливает значение для давления);
проверить уровень давления в колесе (если давление не соответствует нормальному, функция выбрасывает исключение).

3. Напишите программу для тестирования.
Создайте колесо.
Попробуйте задать три разных значения давления через функцию накачки колеса: допустимое давление, нормальное давление,
недопустимое давление.
Добавьте обработку исключений. В зависимости от типа ошибки выведите в консоль результат: произошла ли накачка колеса и
можно ли его эксплуатировать.

Пример:
При накачке −5 атмосфер процедура не удалась.
При накачке 6 атмосфер процедура удалась. Эксплуатация невозможна — давление превышает нормальное.
При накачке 2 атмосферы процедура удалась. Эксплуатация возможна.

Советы и рекомендации Подробная информация об исключениях содержится в официальной документации языка и самом
описании Throwable :
Документация : https://kotlinlang.org/docs/exceptions.html
Throwable : https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/ Mutant : https://metanit.com/kotlin/tutorial/5.2.php

Измеримость :
Прикреплен скрин выполнения программы к карточке
Прикреплен код программы к карточке
 */




fun main() {
    val wheel = Wheel(2.0)
    wheel.pumpUpWheel(22.5)


}