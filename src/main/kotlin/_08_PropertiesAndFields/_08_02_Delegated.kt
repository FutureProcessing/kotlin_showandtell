package _08_PropertiesAndFields

import kotlin.properties.Delegates

class propertyInitializedByCustomDelegate() {
    class ClassWithPropertyInitializedByDelegate {
        var p: String by Delegate()
    }

    class Delegate {
        fun get(thisRef: Any?, prop: PropertyMetadata): String {
            return "$thisRef, thank you for delegating '${prop.name}' to me!"
        }

        fun set(thisRef: Any?, prop: PropertyMetadata, value: String) {
            println("$value has been assigned to '${prop.name} in $thisRef.'")
        }
    }
}

class lazyDelegate() {
    val lazy: String by Delegates.lazy {
        println("computed!")
        "Hello"
    }

    fun main(args: Array<String>) {
        println(lazy) // prints "computed!" and "Hello"
        println(lazy) // prints "Hello"
    }
}

class observableDelegate {
    var name: String by Delegates.observable("<no name>") {
        d, old, new ->
        println("$old -> $new")
    }
}

class notNullDelegate {
    var bar: String
}

class mapValueDelegate {
    class User2(val map: Map<String, Any?>) {
        val name: String by Delegates.mapVal(map)
        val age: Int     by Delegates.mapVal(map)
    }

    val user = User2(mapOf(
            "name" to "John Doe",
            "age"  to 25
    ))
    // Mozna tez uzyc var i zdynamizowac mapeczke
}
