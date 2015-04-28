package _10_Ranges

import kotlin.test.assertEquals

fun ranges() {
    fun typicalIfIn() {
        val x = 5
        val y = 10
        if (x in 1..y - 1)
            print("OK")
    }

    fun typicalIfNotIn() {
        val array = intArray(1, 2, 3)

        val x = 5
        if (x !in 0..array.lastIndex)
            print("Out")
    }

    fun forIn() {
        for (x in 1..5) print(x)
        for (i in 4 downTo 1) print(i)
        for (i in 1..4 step 2) print(i)
        for (i in 1.0..2.0 step 0.3) print("$i ")
    }

    fun inForString() {
        val str = "bla"
        if (str in "island".."isle") println(str)
    }

    fun someCoolFunctionsOnRange() {
        (1..100) takeWhile { it <= 5 }

        assertEquals((90..100).toList(), (1..100).dropWhile { it < 90 })

        assertEquals(Pair(listOf(2, 4, 6, 8, 10), listOf(1, 3, 5, 7, 9)), (1..10).partition { it % 2 == 0 })
    }

}
