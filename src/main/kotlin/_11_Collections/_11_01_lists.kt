package _11_Collections

import kotlin.test.assertEquals


fun lists() {
    val names = listOf("Abra", "Kadabra")
    for (name in names)
        println(name)

    val text = "Abra"
    if (text in names)
        print("Yes")

    names filter { it.startsWith("A") } sortBy { it } map { it.toUpperCase() } forEach { print(it) }


    assertEquals(listOf("hello", "world"), array(null, "hello", null, "world").filterNotNull())

    assertEquals(listOf(1, 2, 2, 3, 3, 4), listOf(1, 2, 3).flatMap{ listOf(it, it + 1) })

    val elements = sequence(1, { x -> x + 1})
}
