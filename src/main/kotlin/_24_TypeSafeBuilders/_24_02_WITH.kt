package _24_TypeSafeBuilders

import java.util.HashMap


public inline fun <T, R> with(receiver: T, f: T.() -> R): R = receiver.f()

fun useOnMap() {
    val map = HashMap<Int, String>()
    _24_TypeSafeBuilders.with (map) {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}


