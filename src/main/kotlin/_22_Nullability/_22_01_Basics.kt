package _22_Nullability

/*

Kotlin’s type system is aimed to eliminate NullPointerException’s from our code. The only possible causes of NPE’s may be

- An explicit call to throw NullPointerException()
- External Java code has caused it
- There’s some data inconsistency with regard to initialization (an uninitialized this available in a constructor is used somewhere)

Nullability is embedded into language, not using heap, eliminates NPE

 */


fun nullNotAllowed() {
    var a: String = "abc"
    //a = null

    val len = a.length()
}

fun nullAllowed() {
    val word: String? = "abc"// null

    //    val len = word.length() // can't
}

fun compilerKnows() {
    val word: String? = "abc"

    val len2 = if (word != null) word.length() else -1

    if (word != null && word.length() > 0)
        print("String of length ${word.length()}")
    else
        print("Empty string")
}

fun safeCalls() {
    val word: String? = null

    val len = word?.length()  // type is Int?

    // val name = bob?.department?.head?.name -> any null returns null
}

fun theElvis() {
    val word: String? = null
    val l: Int = if (word != null) word.length() else -1
    val l2 = word?.length() ?: -1
}

fun theElvisStillHereAsExpression(node: Node): String? {
    val parent = node.getParent() ?: return null
    val name = node.getName() ?: throw IllegalArgumentException("name expected")
    return null
}

fun ifYouWantNPEYouCanHaveIt() {
    val word: String? = null
    word!!.length()
}

// Helper classes, not relevant
class Node {
    fun getParent(): Node = Node()

    fun getName(): String = "Bla"
}

