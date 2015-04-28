package _15_Traits


class optionalBody {
    trait TraitWithOptionalBody {
        fun bar()
        fun foo() {
            // optional body
        }
    }

    class Child : TraitWithOptionalBody {
        override fun bar() {
            // body
        }
    }
}

class abstractProperty {
    trait TraitWithAbstractProperty {
        val property: Int // abstract, can't initialize

        fun foo() {
            print(property)
        }
    }

    class Child2 : TraitWithAbstractProperty {
        override val property: Int = 29
    }
}

class mindFuck() {
    open class A(x: Int) {
        val y = x * 2
    }

    trait B : A {
        fun foo() {
            print(y)
        }
    }

    class C() : A(239), B {}

}
