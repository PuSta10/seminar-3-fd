package seminar.task01

fun transform(n: Int): Int {
    var rez = n.toString(2)

    if (n % 2 == 0) {
        rez += "00"
    } else {
        rez += "11"
    }
    return rez.toInt(2)
}

fun maxNBelow(limit: Int): Int {
    TODO("Найдите максимальное N, для которого R < limit")
}
