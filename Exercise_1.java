Time Complexity-Push-O(1)
                Pop-O(1)
                Peek-O(1)
Space Complexity-O(n)
class ArrayStack{
private int[] stackArray;
int top;
int maxSize=4;
private ArrayStack()
{
    stackArray=new int[maxSize];
    top=-1;
}

private boolean isEmpty()
{
    return top<0;
}

private boolean push(int x)
{
    
    if(top>=maxSize-1)
    {
     System.out.println("Stack size is full");
     return false;
    }
    System.out.println("Element"+ x +" pushed succesfully");
     stackArray[++top]=x;
     return true;

}

private int pop()
{
    if(top<0)
    {
        System.out.println("No element to pop");
        return -1;
    }
    else
    {   
        int popped=stackArray[top--];
        System.out.println("Element popped out is :"+popped);
        return popped;
    }

}

private int peek()
{
    if(top<0){
        System.out.println("No element to peek :");
        return -1;
    }
    else{
        System.out.println("Element peeked is :");
        return ArrayStack[top];
}
}
private void printStack()
{
    if(!isEmpty()){
   for(int i=top;i>=0;i--)
       System.out.print(stackArray[i] + " ");
   }
   else 
     System.out.println("Empty Stack");
}


public static void main(String[] args) {
    ArrayStack myStack= new ArrayStack();
    myStack.push(3);
    myStack.push(5);
    myStack.push(6);
    myStack.push(7);
    myStack.push(7);
    myStack.printStack();
    myStack.pop();
    myStack.pop();
    myStack.pop();
    myStack.pop();
    myStack.pop();
    System.out.println(myStack.isEmpty());
    myStack.printStack();
}
}
