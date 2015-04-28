package _14_Classes

class First

class Second {}

class Third(primaryConstructorParam: String)

class Fourth(name: String) {
    init {
        //logger.info("Class initialized with value ${name}")
    }
}

class Person(val firstName: String, val lastName: String, var age: Int) {
    // ...
}

class Customer private (name: String) {}

class Person2(val name: String) {
    constructor(name: String, parent: Person2) : this(name) {
        //parent.children.add(this)
    }
}

// no new keyword
val customer = Person2("Bla")