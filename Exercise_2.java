import java.util.Stack;

// Time Complexity : pop - O(1), push - O(1), peek - O(1)
// Space Complexity : pop - O(1), push - O(1), peek - O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

public class Exercise_2 {

	//Driver code
    public static void main(String[] args)
    {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);
        sll.pop();
        sll.pop();
        sll.push(100);
        sll.push(200);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}
