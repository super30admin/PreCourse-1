// Time Complexity: push() - O(1), pop() - O(1), peek() - O(1), isEmpty() - O(1)
// Space Complexity: O(n) where n = number of elements in the stack

class StackAsLinkedList {
    private var root: StackNode? = null

    private class StackNode(val data: Int, var next: StackNode? = null)

    fun isEmpty(): Boolean {
        return root == null
    }

    fun push(data: Int) {
        val newNode = StackNode(data, root)
        root = newNode
    }

    fun pop(): Int {
        if (isEmpty()) {
            println("Stack Underflow")
            return 0
        }
        val popped = root!!.data
        root = root!!.next
        return popped
    }

    fun peek(): Int {
        if (isEmpty()) {
            println("Stack is empty")
            return 0
        }
        return root!!.data
    }
}

fun main() {
    val sll = StackAsLinkedList()

    sll.push(10)
    sll.push(20)
    sll.push(30)

    println("${sll.pop()} popped from stack")
    println("Top element is ${sll.peek()}")
}
