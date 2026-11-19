package seminar.task02

fun transform(n: Int): Int {
    var r = n.toString(2)
    var s = 0
    for (i in 0..r.length){
        if (r[i] == '1'){s++}
    }
    return s
}

fun minNAbove(limit: Int): Int {
    TODO("Найдите минимальное N, для которого R > limit")
}
