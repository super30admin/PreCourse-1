import java.io.*;

// Time Complexity : insert - best O(1) and worst O(N) where N is the MAX number elements in the linked list ,
// printList - best O(1) and worst O(N) where N is the MAX number elements in the linked list
// Space Complexity : insert - O(1), printList - O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :
// Java program to implement
// a Singly Linked List
public class Exercise_3 {

    // Driver code
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = LinkedList.insert(list, 1);
        list = LinkedList.insert(list, 2);
        list = LinkedList.insert(list, 3);
        list = LinkedList.insert(list, 4);
        list = LinkedList.insert(list, 5);

        // Print the LinkedList
        LinkedList.printList(list);
    }


}