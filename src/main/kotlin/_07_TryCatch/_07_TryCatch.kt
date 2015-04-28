fun test() {
    val result = try {
        // some call
    } catch (e: ArithmeticException) {
        throw IllegalStateException(e)
    }

    // Working with result
}