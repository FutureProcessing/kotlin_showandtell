package _04_Functions

import java.util.HashSet
import kotlin.properties.Delegates


fun dfs(graph: Graph) {
    val visited = HashSet<Vertex>()
    fun dfs(current: Vertex) {
        if (!visited.add(current)) return
        for (v in current.neighbors)
            dfs(v)
    }

    dfs(graph.vertices[0])
}

data class Vertex {
    val neighbors: Collection<Vertex> by Delegates.notNull()
}

class Graph {
    val vertices: Array<Vertex> by Delegates.notNull()
}