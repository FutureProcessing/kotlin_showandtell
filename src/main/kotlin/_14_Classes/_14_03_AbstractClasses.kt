package _14_Classes

abstract class A {
    abstract fun f()
}

class AB() : A() {
    override fun f() {
        throw UnsupportedOperationException()
    }
}

trait B {
    fun f() {
        print("B")
    }
}

class C() : A(), B {
    // We are not required to override f()
}

