package demo

import _02_JavaInterop._02_01_JavaClass
import java.util.ArrayList
import java.util.Random
import java.util.concurrent.Executors
import java.util.concurrent.ThreadPoolExecutor

fun callJavaStaticMethod() {
    fun getGreeting(): String {
        return "Hello"
    }
}

fun javaCheckedException() {
    fun render(list: List<*>, to: Appendable) {
        for (item in list) {
            to.append(item.toString()) // Java IOException
        }
    }
}

fun gettingJavaClass() {
    class Foo

    fun javaTypes() {
        val foo: Foo = Foo()
        val fooClass = foo.javaClass
        val fooClass2 = javaClass<Foo>()
    }
}

fun usingExistingJavaTypeInKotlin{
    val list = ArrayList<Int>()
}

fun inheritingFromJava() {
    class KotlinInheritance : ArrayList<String>()
}

fun sam_single_abstract_method() {
    val runnable = Runnable { println("This runs in a runnable") }

    val executor = Executors.newFixedThreadPool(5)
    // Java signature: void execute(Runnable command)
    executor.execute { println("This runs in a thread pool") }
}

fun javaObject() {
    val javaObject = Random()
//    javaObject.
    (javaObject as java.lang.Object).wait()
}