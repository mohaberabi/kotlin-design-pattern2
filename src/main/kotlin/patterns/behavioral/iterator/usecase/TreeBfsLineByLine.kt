package patterns.behavioral.iterator.usecase

import patterns.behavioral.iterator.Iterator
import patterns.behavioral.iterator.TreeNode

class TreeBfsLineByLine(
    private val root: TreeNode
) : Iterator<List<Int>> {


    private val queue = ArrayDeque<TreeNode>().apply {
        add(root)
    }

    override fun next(): List<Int> {

        return if (queue.isNotEmpty()) {

            val result = mutableListOf<Int>()
            val size = queue.size
            for (i in 0 until size) {
                val polled = queue.removeFirst()
                result.add(polled.data)
                polled.left?.let {
                    queue.add(it)
                }
                polled.right?.let {
                    queue.add(it)
                }
            }
            result
        } else {
            emptyList()
        }
    }

    override fun hasNext(): Boolean = queue.isNotEmpty()
}

private fun main() {
    val root = TreeNode(1).apply {
        left = TreeNode(2).apply {
            left = TreeNode(4)
            right = TreeNode(5)
        }
        right = TreeNode(3).apply {
            left = TreeNode(6)
            right = TreeNode(7)
        }
    }

    val iterator = TreeBfsLineByLine(root)
    while (iterator.hasNext()) {
        println(iterator.next())
    }

}