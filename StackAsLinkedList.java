
import java.util.EmptyStackException;

public class StackAsLinkedList { 
  
 StackNode top; 
 private int size;
 
 

 static class StackNode { 
     int data; 
     StackNode next; 

     StackNode(int data) 
     { 
         this.data= data;
         this.next= null;
     } 
 } 
 public int size(){
     return size;
 }

 public boolean isEmpty() 
 { 
     return size==0;
 } 

 public void push(int data) 
 { 
     StackNode tempNode= new StackNode(data);

     tempNode.next= top;
     top= tempNode;
     size++;
 } 

 public int pop() 
 { 	
     if(isEmpty()){
        throw new EmptyStackException();
     }
     int res=top.data;
    
    top= top.next;
    size--;
    return res;
    
    
 } 

 public int peek() 
 { 
     return top.data;
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
