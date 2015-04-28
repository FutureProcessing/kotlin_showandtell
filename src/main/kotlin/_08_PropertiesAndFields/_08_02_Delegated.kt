package _08_PropertiesAndFields

import kotlin.properties.Delegates


// Todo: snip 1
class Example {
    var p: String by Delegate()
}

// Todo: snip 2
class Delegate {
    fun get(thisRef: Any?, prop: PropertyMetadata): String {
        return "$thisRef, thank you for delegating '${prop.name}' to me!"
    }

    fun set(thisRef: Any?, prop: PropertyMetadata, value: String) {
        println("$value has been assigned to '${prop.name} in $thisRef.'")
    }
}


// Todo: snip 3
val lazy: String by Delegates.lazy {
    println("computed!")
    "Hello"
}

fun main(args: Array<String>) {
    println(lazy)
    println(lazy)
}

// Todo: snip 4
class User {
    var name: String by Delegates.observable("<no name>") {
        d, old, new ->
        println("$old -> $new")
    }
}

// Todo: snip 5 - by Delegates.notNull()
class Foo {
    var bar: String
}


// Todo: snip 6
class User2(val map: Map<String, Any?>) {
    val name: String by Delegates.mapVal(map)
    val age: Int     by Delegates.mapVal(map)
}

val user = User2(mapOf(
        "name" to "John Doe",
        "age"  to 25
))
// Mozna tez uzyc var i zdynamizowac mapeczke
