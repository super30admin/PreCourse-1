// // Time Complexity: O(1)
// // Space Complexity: O(n)
// // Did this code successfully run on Leetcode :
// // Any problem you faced while coding this: Was aware about concept of stack but stuck at coding implemention 
// //  in JAVA so took reference from GeeksforGeeks 

// class Stack {
//     // Please read sample.java file before starting.
//     // Kindly include Time and Space complexity at top of each file
//     static final int MAX = 1000;
//     int top;
//     int a[] = new int[MAX]; // Maximum size of Stack

//     boolean isEmpty() {
//         // Write your code here
//         // If top is -1 then stack is empty
//         if (top < 0) {
//             return true;
//         }
//         return false;
//     }

//     Stack() {
//         // Initialize your constructor
//         // At the initial level top will be at -1
//         top = -1;
//     }

//     boolean push(int x) {
//         // Check for stack Overflow
//         // Write your code here
//         // If top is at 1000 then stack is full
//         if (top >= MAX) {
//             System.out.println(" STACK OVERFLOW ");
//             return false;
//         }
//         // Adding element on top
//         a[++top] = x;
//         return true;
//     }

//     int pop() {
//         // If empty return 0 and print " Stack Underflow"
//         // Write your code here

//         // Check for if stack is not empty
//         if (isEmpty()) {
//             System.out.println(" STACK IS EMPTY ");
//             return 0;
//         }
//         // It will return top element and then decrease top pointer by 1
//         return a[top--];
//     }

//     int peek() {
//         // Write your code here
//         if (isEmpty()) {
//             System.out.println(" STACK IS EMPTY ");
//             return 0;
//         }
//         // Returning top element from the stack
//         return a[top];
//     }
// }

// // Driver code
// class Main {
//     public static void main(String args[]) {
//         Stack s = new Stack();
//         s.push(10);
//         s.push(20);
//         s.push(30);
//         System.out.println(s.pop() + " Popped from stack");
//         System.out.println(s.peek() + " is on peek of the stack");
//     }
// }
