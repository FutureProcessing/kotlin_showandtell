package _06_IfAsExpresion

fun max(a: Int, b: Int): Int {
    if (a > b)
        return a
    else
        return b
}

fun max2(a: Int, b: Int) = if (a > b) a else b
