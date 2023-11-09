import java.util.EmptyStackException;

// Implementation using arrays
// class Stack { 
//     //Please read sample.java file before starting.
//   //Kindly include Time and Space complexity at top of each file
//     static final int MAX = 1000; 
//     int top; 
//     int a[] = new int[MAX]; // Maximum size of Stack


//     Stack(){
//         //Initialize your constructor
//         top = -1;
//     }

//     boolean isEmpty() {
//         //Write your code here
//         return top == -1; // since we are considering the stack to be empty initially
//     }


//     boolean push(int x){ 
//         if (top >= (MAX - 1)){
//             System.out.println("Stack overflow");
//             return false;
//         }else{
//             a[++top] = x;
//             System.out.println(x + " is pushed to stack");
//             return true;
//         }
//     } 
  
//     int pop(){ 
//         //If empty return 0 and print " Stack Underflow"
//         if(isEmpty()){
//             System.out.println("Stack is underflow");
//             return 0;
//         }else{
//             return a[top--];
//         }    
//     } 
  
//     int peek() { 
//         if(isEmpty()){
//             System.out.println("Stack is underflow");
//             return 0;
//         }else{
//             return a[top];
//         }
        
//     }  

//     }




  class StackUsingLinkedList{
     private Node top;
     private int size;

     private class Node{
         private int data;
         private Node next;


        // defining a constructor 
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void push(int data){
        Node tempNode = new Node(data);
        tempNode.next = top;
        top = tempNode;
        size++;
        System.out.println( data + " is pushed to stack");
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("No element can be popped");
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        size--;
        return result;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("No element found");
            throw new EmptyStackException();
            
        }
        return top.data;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void displayStack(){
        Node current = top;
        while (current != null){
            System.out.println(current.data + " ");
            current = current.next;
        }
    }
 }   
  
// Driver code 
class Main { 
    public static void main(String args[]){ 
        // Stack s = new Stack(); 
        // s.push(10); 
        // s.push(20); 
        // s.push(30); 
        // System.out.println(s.pop() + " Popped from stack"); 

        StackUsingLinkedList sl = new StackUsingLinkedList();
        sl.push(10);
        System.out.println(sl.peek());
        System.out.println(sl.size());





    
    }
  }