package _05_Strings

fun funWithArgs(args: Array<String>) {
    if (args.size() == 0) return

    val name = "Madafak"
    println("Name $name")

    println("First argument: ${args[0]}")
}
