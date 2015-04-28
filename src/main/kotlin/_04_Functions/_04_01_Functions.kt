package _04_Functions

fun sumFullVersion(a: Int, b: Int): Int {
    return a + b
}

fun sumConcise(a: Int, b: Int) = a + b

fun theAnswer() = 42

public fun sumPublic(a: Int, b: Int): Int = a + b

fun unitReturn(a: Int, b: Int): Unit {
    print(a + b)
}

public fun unitReturnRecommended(a: Int, b: Int) {
    print(a + b)
}

fun defaultValues(a: Int = 0, b: String = "") {}

fun callDefaultValues() {
    defaultValues(b = "bla", a = 5)
}
