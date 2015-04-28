package _04_Functions

fun infix() {
    1 shl 2
    1.shl(2)
    withBlock(5) { it -> "bla" }
    withBlock(6, fun (x: Int): String {
        return "Bla"
    })
    withBlock(7, ::justSomeFun)

    val ints = intArray(1, 2, 3)
    ints map { it * 2 }
}

fun someChainedCalls() {
    val strings = listOf("bla", "abla")
    strings filter { it.length() == 5 } sortBy { it } map { it.toUpperCase() }
}

fun withBlock(param: Int, block: (Int) -> String) {

}

fun justSomeFun(x: Int) = "Bla"
