Introduction
Kotlin is a language by JetBrains, the company behind IntelliJ IDEA and other (sweet) tools, and is purpose built for large-scale software projects to improve upon Java with a focus on readability, correctness, and developer productivity.
The language was created in response to limitations in Java which were hindering development of JetBrains' software products and after an evaluation of all other JVM languages proved unsuitable. Since the goal of Kotlin was for use in improving their products, it focuses very strongly on interop with Java code and the Java standard library.

Interoperability
The most important feature of the Kotlin language and runtime is its core focus on interoperability. Unlike other JVM alternative languages (most specifically: Scala), idiomatic Kotlin should be able to easily call Java as well as have idiomatic Java easily call into Kotlin. In fact, you should never know that you are crossing that boundary in either direction.
The runtime of Kotlin exists only to support the language features making it extremely lean. The java standard library types, collections, etc. are all reused and ultimately are augmented for greater utility through some of the subsequently mentioned features.

In Kotlin, everything is an object in the sense that we can call member functions and properties on any variable. Some types are built-in, because their implementation is optimized, but to the user they look like ordinary classes. In this section we describe most of these types: numbers, characters, booleans and arrays.

== to equals a nie identity, jest identityEquals i ===

pakiet nie musi sie zgadzac z katalogiem, jak w c#