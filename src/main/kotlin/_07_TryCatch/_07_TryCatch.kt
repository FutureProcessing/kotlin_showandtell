fun test() {
    val result = try {
        // some call
        5
    } catch (e: ArithmeticException) {
        throw IllegalStateException(e)
    }

    // Working with result - no need to additional (usually null variable)
}