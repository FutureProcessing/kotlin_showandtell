package _11_Collections

fun maps() {
    val readOnlyMap = mapOf(1 to "A", 2 to "B") // readonly map
    var mutableMap = hashMapOf("a" to 1, "b" to 2, "c" to 3) // mutable map
    var linkedMap = linkedMapOf("a" to 1, "b" to 3)

    println(mutableMap["a"])
    mutableMap["a"] = 5

    for ((key, value) in readOnlyMap) {
        // do something with the key and the value
    }
}
