package _14_Classes

/*
- getters (and setters in case of var’s) for all properties
- equals()
- hashCode()
- toString()
- copy()
- component1(), component2(), …, for all properties (
 */
data class User(val name: String, val age: Int)

fun creationAndCopy() {
    val jack = User(name = "Jack", age = 1)
    val olderJack = jack.copy(age = 2)
}

fun components() {
    val jane = User("Jane", 35)
    val (name, age) = jane
    print("$name, $age years of age")
}

data class Result(val result: Int, val status: Status)
data class Status

fun multiDeclarationReturn() {

    fun function(): Result {
        val result = 5
        val status = Status()
        return Result(result, status)
    }

    fun multi() {
        val (result, status) = function()
    }

}
