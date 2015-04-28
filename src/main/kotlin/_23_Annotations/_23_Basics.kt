package _23_Annotations

import javax.inject.Inject

annotation class fancy

[fancy] class Foo {
    [fancy] fun baz([fancy] foo: Int): Int {
        return [fancy] 1
    }
}

fancy class Foo2 {
    fancy fun baz(fancy foo: Int): Int {
        [fancy] fun bar() {  }
        return [fancy] 1
    }
}

// Primary constructor
class Foo3 [Inject](dependency: String) {
    // ...
}

/*
import org.junit.Test as test

class Tests {
    test fun simple() {
        ...
    }
}
*/

