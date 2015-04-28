package _22_Nullability

fun showLet() {
    val superData = SomeData().getData()

    superData?.let {
        // do some stuff if not null
    }
}

class SomeData {
    fun getData(): SuperData? {
        return null
    }
}

data class SuperData


