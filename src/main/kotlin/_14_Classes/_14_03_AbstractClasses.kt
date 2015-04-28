package _14_Classes

abstract class A {
    abstract fun f()
}

trait B {
    open fun f() { print("B") }
}

class C() : A(), B {
    // We are not required to override f()
}

