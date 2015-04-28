package _15_Traits

trait MyTrait {
    fun bar()
    fun foo() {
        // optional body
    }
}

class Child : MyTrait {
    override fun bar() {
        // body
    }
}

trait MyTrait2 {
    val property: Int // abstract

    fun foo() {
        print(property)
    }
}

class Child2: MyTrait2 {
    override val property: Int = 29
}
// snip 3
open class A(x: Int) {
    val y = x * 2
}

trait B : A {
    fun foo() {
        print(y)
    }
}

class C() : A(239), B {}

