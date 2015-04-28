package _21_TypeChecksAndCasts


fun smartCast1(x: Any) {
    if (x is String) {
        print(x.length()) // x is automatically cast to String
    }
}

fun smartCast2(x: Any) {
    if (x !is String) return
    print(x.length()) // x is automatically cast to String
}

fun smartCast3(x: Any) {
    if (x !is String || x.length() == 0) return

    if (x is String && x.length() > 0) return

    when (x) {
        is Int -> print(x + 1)
        is String -> print(x.length() + 1)
        is Array<Int> -> print(x.sum())
    }
}


