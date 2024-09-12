package patterns.behavioral.iterator.usecase

import patterns.behavioral.iterator.TreeNode


class TreeBfsIterator(
    private val root: TreeNode,
) : Iterator<Int?> {
    private val queue = ArrayDeque<TreeNode>()
        .apply {
            add(root)
        }

    override fun next(): Int? {
        return if (queue.isNotEmpty()) {
            val poll = queue.removeFirst()
            poll.left?.let {
                queue.add(it)
            }
            poll.right?.let {
                queue.add(it)
            }
            poll.data
        } else {
            null
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

    val iterator = TreeBfsIterator(root)
    while (iterator.hasNext()) {
        print("${iterator.next()} ")
    }

}