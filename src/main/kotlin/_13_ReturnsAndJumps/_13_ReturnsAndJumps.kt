package _13_ReturnsAndJumps

fun breakingLoops() {

    @loop for (i in 1..100) {
        for (j in 1..100) {
            if (j == 42)
                break@loop
        }
    }
}

fun breakingLambdas() {
    val ints = intArray(1, 2, 3)
    ints.forEach {
        if (it == 0) return@forEach
        print(it)
    }
}
