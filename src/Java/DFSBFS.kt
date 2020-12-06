package Java

import java.util.*
import kotlin.collections.ArrayList

/**
 * jhChoi - 201206
 *   백준 1260 - DFS 와 BFS
 * */

fun main(args: Array<String>) = with(System.`in`.bufferedReader()){
    val (N, M, V) = readLine().split(" ").map { it.toInt() }  //N 정점의 갯수 , M 간선의 갯수, V 탐색 위치
    val graph = Graph(N)

    for (i in 0 until M) {  //노드 입력 및 그래프 생성
        val (A, B) = readLine().split(" ").map { it.toInt() }
        graph.put(A, B)
    }

    val stackVisit: Array<Boolean> = Array(N + 1) { false }
    val stack: Stack<Int> = Stack()
    stack.push(V)
    fun dfs(graph: Graph) {
        while (!stack.empty()) {
            val node = stack.pop().apply {
                stackVisit[this] = true
            }
            print("$node ")

            graph[node].let{
                it.sort()
                it.forEach { node ->
                    if (!stackVisit[node]) {
                        stack.push(node)
                        dfs(graph)
                    }
                }
            }
        }
    }
    dfs(graph)
    println()

    fun bfs(graph: Graph, V: Int) {
        val visit: Array<Boolean> = Array(N + 1) { false }
        val queue: Queue<Int> = LinkedList()
        queue.offer(V)

        while (!queue.isEmpty()) {
            val node = queue.poll().apply {
                visit[this] = true
            }
            print("$node ")

            graph[node].let{
                it.sort()
                it.forEach { node->
                    if (!visit[node]) {
                        visit[node] = true
                        queue.add(node)
                    }
                }
            }
        }
    }
    bfs(graph, V)
}

//인접 리스트
class Graph(N: Int) {
    private val graph: ArrayList<ArrayList<Int>> = ArrayList(N)

    init {
        for (i in 0..N) {
            graph.add(ArrayList())
        }
    }

    fun put(a: Int, b: Int) {
        graph[a].add(b)
        graph[b].add(a)
    }

    operator fun get(i: Int): ArrayList<Int> {
        return graph[i]
    }
}