# PreCourse_1

# All Instructions are already provided in the respective files.

## Exercise_1 : Implement Stack using Array.

```Java code
// Time Complexity : O(n) -> Worst case scenario
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Stack {
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 

    boolean isEmpty()
    {
        //Write your code here
        return (top < 0);
    }

    Stack()
    {
        //Initialize your constructor
        top = -1;
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        if(top >= (MAX-1)){ //checking if stack has already reached it's MAX value, if so then stack -> overflow
            System.out.println("Stack overflow");
            return false;
        }
        //Write your code here
        else{
            a[++top] = x; //else pushing element of the top of the stack
            System.out.println("Item pushed in the stack: " + x);
            return true;
        }
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        if(top < 0){ //checking if there is any element to pop, if not then stack -> underflow
            System.out.println("Stack underflow");
            return 0;
        }
        //Write your code here
        else{
            int x = a[top--];
            return x;
        }
    }

    int peek() //return top element of the stack
    {
        //Write your code here
        //checking underflow condition
        if(top < 0){
            System.out.println("Stack underflow");
        }
        else{
            int x = a[top];
            return x;
        }
    }
    void print(){
        for(int i = top;i > -1;i++){
            System.out.println(" " + a[i]);
        }
    }
}

// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " Top element");
        System.out.print("Elements present in stack : ");
        s.print();
    }
}
```

## Exercise_2 : Implement Stack using Linked List.

```Java code
// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes     
// Any problem you faced while coding this : No

public class StackAsLinkedList {
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
            this.data = data;
        } 
    } 

    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        if(root == null){
            return true;
        }
        else{
            return false;
        }
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode node = new StackNode(data);
        if(root == null){
            root = node;
        }
        else{
            StackNode temp = root;
            root = node;
            node.next = temp;
        }
        System.out.println("Data pushed to the stack " + data);

    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if(root == null) {
            System.out.println("Stack underflow");
            return 0;
        }
        //Write code to pop the topmost element of stack.
        else{
            int a = root.data;
            root = root.next;
        }
        //Also return the popped element
        return a;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root == null){
            System.out.println("Stack underflow");
            return Integer.MINVALUE;
        }
        else{
            return root.data;
        }
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
```

## Exercise_3 : Implement Singly Linked List.

```Java code
// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.io.*;
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList {

    Node head; // head of list
    int data;
    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d)
        {
            //Write your code here
            data = d;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        Node node = new Node(data);
        // If the Linked List is empty,
        if(list.head == null){
            list.head = node;
        }
        else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = node;
        }
        // then make the new node as head

            // Else traverse till the last node
            // and insert the new_node there

            // Insert the new_node at last node
        // Return the list by head
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        Node currNode = list.head;

        System.out.println("LinkedList: ");

        // Traverse through the LinkedList
        while(currNode != null){
            // Print the data at current node
            System.out.println(currNode.data + " ");
            // Go to next node
            currNode = currNode.next;
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);

        // Print the LinkedList
        printList(list);
    }
}
```

*After completing the project kindly submit a pull request*
