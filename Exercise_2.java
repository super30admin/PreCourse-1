public class StackAsLinkedList { 
  
   StackNode root; 
   int size;
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
           next= null;
            //Constructor here 
        } 
    } 
     public boolean isEmpty() 
    { 
       return size==0;
    } 
    public void push(int data) 
    { 
       StackNode sn = new StackNode(data);
       sn.data= data;
       sn.next= root ;
       root = sn;
       size++;

    } 
     public int pop() 
    { 	
        if( root==null)
          {
              System.out.println("Stack Underflow");
              return 0;
          }
          else
          {
              size--;
              int temp =root.data;
              root= (root).next;
              return temp;
          }
    } 
    public int peek() 
    { 
        if (root==null) {
            return 0;
        }
        else
        return root.data;
       
    } 
  
     public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
        System.out.println( sll.size);
         System.out.println(sll.pop() + " popped from stack");
         System.out.println("Top element is " + sll.peek()); 
      
    } 
} 