package _20_ReifiedInline

import kotlin.properties.Delegates

class javaSadCall {
    fun <T> TreeNode.findParentOfType(clazz: Class<T>): T? {
        var p = parent
        while (p != null && !clazz.isInstance(p)) {
            p = p?.parent
        }
        [suppress("UNCHECKED_CAST")]
        return p as T
    }

    fun javaSadCall() {
        val myTree = MyTreeNodeType()
        myTree.findParentOfType(javaClass<MyTreeNodeType>())
    }
}

class kotlinCall {
    inline fun <reified T> TreeNode.findParentOfType(): T? {
        var p = parent
        while (p != null && p !is T) {
            p = p?.parent
        }
        return p as T
    }

    fun moreLikeItCall() {
        val myTree = MyTreeNodeType()
        myTree.findParentOfType<MyTreeNodeType>()
    }
}

class someFunWithReflection {
    inline fun methodsOf<reified T>() = javaClass<T>().getMethods()

    fun moreLikeItCall2() {
        methodsOf<String>().joinToString(", ")
    }
}

// Helper classes, not relevant
open class TreeNode {
    val parent: TreeNode by Delegates.notNull()
}

class MyTreeNodeType : TreeNode()