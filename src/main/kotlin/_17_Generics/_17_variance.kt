package _17_Generics

// covariant = producer
abstract class Source<out T> {
    abstract fun nextT(): T
}

fun demo(strs: Source<String>) {
    val objects: Source<Any> = strs // This is OK, since T is an out-parameter
}

// contravariant = consumer
abstract class Comparable<in T> {
    abstract fun compareTo(other: T): Int
}

fun demo(x: Comparable<Number>) {
    x.compareTo(1.0) // 1.0 has type Double, which is a subtype of Number
    // Thus, we can assign x to a variable of type Comparable<Double>
    val y: Comparable<Double> = x // OK!
}

class Array2<T>(val length: Int) {
    fun get(index: Int): T { throw RuntimeException() }
    fun set(index: Int, value: T) { /* ... */ }
    val indices = intArray(1,2)
}

fun copy(from: Array2<out Any>, to: Array2<Any>) {
    assert(from.length == to.length)
    for (i in from.indices)
        to[i] = from[i]
}

fun fill(dest: Array<in String>, value: String) {
    // ...
}

