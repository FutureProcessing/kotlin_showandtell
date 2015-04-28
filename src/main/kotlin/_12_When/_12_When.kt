package _12_When

fun whenFun1(x: Int) {
    fun typicalSwitch() {
        when (x) {
            1 -> print("x == 1")
            2 -> print("x == 2")
            else -> {
                print("x is neither 1 nor 2")
            }
        }
    }

    fun switchWithManyMatchingValues() {
        when (x) {
            0, 1 -> print("x == 0 or x == 1")
            else -> print("otherwise")
        }
    }

    fun switchWithCustomFunctionCall() {
        val s = "5"
        when (x) {
            parseInt(s) -> print("s encodes x")
            else -> print("s does not encode x")
        }
    }

    fun switchWithRanges() {
        when (x) {
            in 1..10 -> print("x is in the range")
            !in 10..20 -> print("x is outside the range")
            else -> print("none of the above")
        }
    }

    fun switchWithSmartcast() {
        val abc: Any? = "Test"
        val hasPrefix = when (abc) {
            is String -> abc.startsWith("prefix")
            else -> false
        }
    }

    fun ifElseIfElseIfElseChainInKotlin() {
        val number = NumClass()
        when {
            number.isOdd() -> print("x is odd")
            number.isEven() -> print("x is even")
            else -> print("x is funny")
        }
    }

    fun whenAsExpression(color: String): Int = when (color) {
        "Red" -> 0
        "Green" -> 1
        "Blue" -> 2
        else -> throw IllegalArgumentException("Invalid color param value")
    }
}

fun parseInt(input: Any): Int {
    throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
}

class NumClass {
    fun isOdd(): Boolean = true
    fun isEven(): Boolean = false
}


