package _16_Extensions

fun <T> MutableList<T>.swap(x: Int, y: Int) {
    val tmp = this[x]
    this[x] = this[y]
    this[y] = tmp
}

fun extensions() {
    val l =  arrayListOf(1, 2, 3)
    l.swap(0, 2)
}

val <T> List<T>.lastIndex: Int
    get() = size() - 1


fun String.lastChar() = this.charAt(this.length() - 1)

//'this' can be omitted
fun String.lastChar1() = charAt(length() - 1)

fun use() {
    // Try Ctrl+Space after the dot: lastChar() visible in completion and can be easily found
    "abc".lastChar()
}

class MyClass {
    companion object { }
}

fun MyClass.Companion.foo() {
    // ...
}

fun extensions2() {
    MyClass.foo()
}