package _19_ObjectExpressionsAndDeclarations

open class A(x: Int) {
    public open val y: Int = x
}

trait B {}

fun multipleInh() {
    val ab = object : A(1), B {
        override val y = 15
    }
}

