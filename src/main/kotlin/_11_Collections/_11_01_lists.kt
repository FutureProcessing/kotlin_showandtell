package _11_Collections

import kotlin.test.assertEquals

fun lists() {
    val names = listOf("Abra", "Kadabra")

    fun traversingList() {
        for (name in names)
            println(name)
    }

    fun listContains() {
        val text = "Abra"
        if (text in names)
            print("Yes")
    }

    fun goingFunctionalOnList() {
        names filter { it.startsWith("A") } sortBy { it } map { it.toUpperCase() } forEach { print(it) }
    }

    fun filteringNulls() {
        assertEquals(listOf("hello", "world"), array(null, "hello", null, "world").filterNotNull())
    }

    fun flatMapping() {
        assertEquals(listOf(1, 2, 2, 3, 3, 4), listOf(1, 2, 3).flatMap { listOf(it, it + 1) })
    }

    fun infiteSequence() {
        val elements = sequence(1, { x -> x + 1 })
    }
}
