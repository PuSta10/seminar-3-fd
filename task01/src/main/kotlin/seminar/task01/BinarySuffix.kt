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
    var mx = 0
    for (n in (1..10000)){
        if (transform(n) < limit)
            mx = n
    }
    return mx
}
