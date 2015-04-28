package _19_ObjectExpressionsAndDeclarations

fun anonymousClass() {
    Window().addMouseListener(object : MouseAdapter() {
        override fun mouseClicked(e: MouseEvent) {
            // ...
        }

        override fun mouseEntered(e: MouseEvent) {
            // ...
        }
    })
}

data class MouseEvent
abstract class MouseAdapter {
    abstract fun mouseClicked(e: MouseEvent)
    abstract fun mouseEntered(e: MouseEvent)
}

class Window {
    fun addMouseListener(ml: MouseAdapter) {

    }
}