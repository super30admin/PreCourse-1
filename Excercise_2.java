 class StackAsLinkedList {

    StackNode root;
    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            this.data=data;
            this.next=null;
            //Constructor here
        }


    }

public void printElements(){
    System.out.println("elements ccurrently ");
    StackNode first=root;
    while(root!=null){
        System.out.println(root.data);
        root=root.next;
    }
    root=first;
}
    public boolean isEmpty()
    {
        if(root==null){
            return true;
        }
        return false;
        //Write your code here for the condition if stack is empty.
    }

    public void push(int data)
    {
        StackNode first=root;
        //Write code to push data to the stack.
//        StackNode first=root;
     if(root==null){
         root=new StackNode(data);
     }else{
         if(root.next!=null){
         while(root.next!=null){
             root=root.next;
         }
         root.next=new StackNode(data);
        }
         else{
             root.next=new StackNode(data);
         }
         root=first;
     }


    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        StackNode first=root;

       if(root!=null){
           if(root.next!=null){
               StackNode slow=root;
               StackNode fast=slow.next;
           while(fast.next!=null){
               slow=fast;
               fast=fast.next;
           }
           int popElement=fast.data;
           slow.next=null;
           root=first;
           return popElement;}
           else{
               int popElement=root.data;
               root=null;

               return popElement;
           }
       }
       else{
           System.out.println("Stack UnderFlow");
           return 0;
       }

    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(root!=null){
if (root.next!=null){
    return root.next.data;
}else{
    return root.data;
}
        }else{
            System.out.println("Stack UnderFlow");
            return 0;
        }
    }

    //Driver code
    public static void main(String[] args)
    {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);
        sll.push(25);

        System.out.println(sll.pop() + " popped from stack 1");
        System.out.println(sll.pop() + " popped from stack 2");
        System.out.println(sll.pop() + " popped from stack 3 ");

sll.push(76);
        System.out.println(sll.pop() + " popped from stack");
        System.out.println("is empty = "+sll.isEmpty());
        System.out.println(sll.pop() + " popped from stack");
        System.out.println("is empty = "+sll.isEmpty());
        System.out.println("Top element is " + sll.peek());
    }
}