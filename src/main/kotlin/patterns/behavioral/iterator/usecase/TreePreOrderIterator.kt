package patterns.behavioral.iterator.usecase

import patterns.behavioral.iterator.Iterator
import patterns.behavioral.iterator.TreeNode
import java.util.Stack


class TreePreOrderIterator(
    private val root: TreeNode,
) : Iterator<Int?> {

    private val stack = Stack<TreeNode>().apply {
        push(root)
    }

    override fun next(): Int? {
        return if (stack.isNotEmpty()) {
            val popped = stack.pop()
            popped?.right?.let { stack.push(it) }
            popped?.left?.let { stack.push(it) }
            popped.data
        } else {
            null
        }
    }

    override fun hasNext(): Boolean = stack.isNotEmpty()
}