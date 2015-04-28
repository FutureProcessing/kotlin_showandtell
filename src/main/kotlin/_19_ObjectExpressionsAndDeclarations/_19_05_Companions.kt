package _19_ObjectExpressionsAndDeclarations

class MyClass {
    companion object Factory {
        fun create(): MyClass = MyClass()
    }
}

val instance = MyClass.create()

class KotlinClass {
    object Obj1 { }
    companion object Obj2 { }
}



