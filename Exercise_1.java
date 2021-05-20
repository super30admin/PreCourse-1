class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 

    boolean isEmpty()
    {
        if (top == 0){
            return true;
        }
        return false;
    }

    Stack()
    {
        //Initialize your constructor
        top = a[0];
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here
        int i = 0;
        while(i<=MAX-1){
            if (a[i] == 0){
                System.out.println(i);
                a[i] = x;
                top = x;
                System.out.println(top);
                return true;
            }
            i++;
        }

        return false;
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()){
            return 0;
        }
        else{
            for(int i = 0; i <=MAX-1; i++){
                if (a[i]==top){
                    System.out.println(a[i]);
                    int temp = a[i];
                    a[i] = 0;
                    if(i>0){
                        top = a[i-1];
                    }
                    return temp;
                }
            }
        }
        return 0;
    }

    int peek()
    {
        //Write your code here
        return top;
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
    }
}
