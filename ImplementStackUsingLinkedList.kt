// Time Complexity : O(1)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Was not able to find on leetcode
// Any problem you faced while coding this :
class StackAsLinkedList {
    private var root: StackAsLinkedList.StackNode? = null

    internal class StackNode(var data: Int) {
        var next: StackAsLinkedList.StackNode? = null
    }


    val isEmpty: Boolean
        get() {
            return root == null
        }

    fun push(data: Int) {
        //Write code to push data to the stack.
        val stackNode = StackNode(data)
        stackNode.next = root
        root = stackNode //so that root is at the top
    }

    fun pop(): Int {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
//        if(isEmpty){
//            println("Stack Overflow")
//            return 0
//        }else{
//            val temp = root
//            root = root?.next
//            return temp?.data!!
//        }
        // Kotlin way to write whaty is written above
        root?.let {
            val temp = root
            root = root?.next
            return temp?.data!!
        }?:run {
            println("Stack Overflow")
            return 0 }

    }

    fun peek(): Int {
        //Write code to just return the topmost element without removing it.
        if (root!=null){
            return root?.data!!
        }else{
            print("Empty stack")
            return 0
        }
    }

    companion object {
        //Driver code
        @JvmStatic
        fun main(args: Array<String>) {
            val sll = StackAsLinkedList()

            sll.push(10)
            sll.push(20)
            sll.push(30)

            println(sll.pop().toString() + " popped from stack")

            println("Top element is " + sll.peek())
        }
    }
}