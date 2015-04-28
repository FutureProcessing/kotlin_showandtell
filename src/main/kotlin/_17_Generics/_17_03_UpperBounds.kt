package _17_Generics

fun toStringWhenGreater<T : Comparable<T>>(list: List<T>, threshold: T): List<String> {
    return list filter { it > threshold} map { it.toString() }
}
