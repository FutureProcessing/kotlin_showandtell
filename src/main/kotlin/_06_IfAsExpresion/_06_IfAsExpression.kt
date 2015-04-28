package _06_IfAsExpresion

fun maxJavaStyle(a: Int, b: Int): Int {
    if (a > b)
        return a
    else
        return b
}

fun maxKotlinStyle(a: Int, b: Int) = if (a > b) a else b
