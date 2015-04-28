package _04_Functions

// todo: snip
fun sum(a: Int, b: Int): Int {
    return a + b
}

// todo: snip
fun sumConcise(a: Int, b: Int) = a + b
fun theAnswer() = 42

// todo: snip
public fun sumPublic(a: Int, b: Int): Int = a + b

// todo: snip
fun printSum(a: Int, b: Int): Unit {
    print(a + b)
}

// todo: snip
public fun printSumConcise(a: Int, b: Int) {
    print(a + b)
}

// todo: snip - default values
fun foo(a: Int = 0, b: String = "") {}
