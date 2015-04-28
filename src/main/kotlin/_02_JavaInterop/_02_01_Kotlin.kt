package demo

import java.util.ArrayList
import java.util.concurrent.Executors
import java.util.concurrent.ThreadPoolExecutor

fun getGreeting(): String {
    return "Hello"
}

fun main(args: Array<String>) {
    println(getGreeting())
}

// todo: snip
fun render(list: List<*>, to: Appendable) {
    for (item in list) {
        to.append(item.toString()) // Java IOException
    }
}

// todo: snip
class Foo

fun javaTypes() {
    val foo: Foo = Foo()
    val fooClass = foo.javaClass
    val fooClass2 = javaClass<Foo>()
}

val list = ArrayList<Int>()

// todo: snip
class KotlinInheritance : ArrayList<String>()

// todo: snip
fun sam() {
    val runnable = Runnable { println("This runs in a runnable") }

    val executor = Executors.newFixedThreadPool(5)
    // Java signature: void execute(Runnable command)
    executor.execute { println("This runs in a thread pool") }
}