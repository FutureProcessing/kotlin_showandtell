package _21_TypeChecksAndCasts

fun isNotIs() {
    val obj: Any = Any()
    if (obj is String ) {
        print(obj.length())
    }

    if (obj !is String ) {
        print("Not a String")
    } else {
        print(obj.length())
    }
}


