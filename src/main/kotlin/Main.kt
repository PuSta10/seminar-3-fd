import seminar.task01.transform as transformTask01
import seminar.task02.transform as transformTask02
import seminar.task03.TravelCard

// Импорты для задач 04–05 добавьте после создания соответствующих классов.
import seminar.task04.ExpressDelivery

fun main() {
    println("Здесь можно вызывать функции и классы из заданий.")
    // Раскомментируйте нужный вызов после реализации функции.
    //println(transformTask01(129))
    //println(transformTask02(131))

    val c = ExpressDelivery("qwe", 30)
    println(c.label(5))
}
