// Time Complexity : O(1)
// Space Complexity : O(N) input = MAX
// Did this code successfully run on Leetcode : Was not able to find on leetcode
// Any problem you faced while coding this :


class Stack{
    companion object{
        const val MAX = 1000
    }
    private var top: Int = -1
    private val a = IntArray(MAX)
    fun isEmpty():Boolean{
    return top == -1
    }
    fun push(x:Int):Boolean{
        if (top + 1 < MAX){
            a[++top] = x
            return true
        }
        else
            println("Stack OverFlow")
            return false
    }
    fun pop():Int{
        if(top != -1){
            return a[top--]
        } else{
            println("Stack OverFlow")
            return 0
        }
    }
    fun peek():Int{
        return a[top]
    }
}

fun main() {
    val s = Stack()
    s.push(10)
    s.push(20)
    s.push(30)
    println(s.pop().toString() + " Popped from stack")
}