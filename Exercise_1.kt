// Time Complexity: push() - O(1), pop() - O(1), peek() - O(1), isEmpty() - O(1)
// Space Complexity: O(MAX) where MAX = 1000

class Stack {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file
    
    companion object {
        const val MAX = 1000
    }

    // Initialize your constructor
    private var top: Int = -1
    private val a = IntArray(MAX) // Maximum size of Stack

    fun isEmpty(): Boolean {
        // Write your code here
        return top == -1
    }
    
    fun push(x: Int): Boolean {
        // Check for stack Overflow
        // Write your code here
        if (top >= MAX - 1) {
            println("Stack Overflow")
            return false
        }
        a[++top] = x
        return true
    }
    
    fun pop(): Int {
        // If empty return 0 and print "Stack Underflow"
        // Write your code here
        if (isEmpty()) {
            println("Stack Underflow")
            return 0
        }
        return a[top--]
    }
    
    fun peek(): Int {
        // Write your code here
        if (isEmpty()) {
            println("Stack is empty")
            return 0
        }
        return a[top]
    }
}

// Driver code
fun main() {
    val s = Stack()
    s.push(10)
    s.push(20)
    s.push(30)
    println("${s.pop()} Popped from stack")
}
