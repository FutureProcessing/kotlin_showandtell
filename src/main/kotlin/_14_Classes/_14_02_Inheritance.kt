package _14_Classes

import java.util.ArrayList

// Design and document for inheritance or else prohibit it.
open class Base(p: Int) {
    open fun v() {}
    fun nv() {}
}

class Derived(p: Int) : Base(p) {
    override fun v() {}
}

class Derived2 : ArrayList<String>() {

    override fun trimToSize() {
    }
}
