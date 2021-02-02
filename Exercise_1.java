class Stack {
    static final int MAX = 5;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Write your code here
        return top<0;
    }

    Stack()
    {
        //Initialize your constructor
        top = -1;
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here
        if(top == MAX - 1){
            return false;
        }else{
            top++;
            a[top] = x;

            return true;
        }
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here

        if(top == -1){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            int data;

            data = a[top];
            a[top] = 0;
            top--;

            return data;
        }
    }

    int peek()
    {
        //Write your code here
        if(top == -1){
            return -1;
        }else{
            return a[top];
        }

    }

//    void show(){
//        for(int val: a){
//            System.out.print(val +" ");
//        }
//        System.out.println();
//    }
}


class Main {

    public static void main(String[] args) {
        // write your code here
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
//        s.show();
        System.out.println(s.isEmpty());
        System.out.println("Value at the top: " + s.peek());
        System.out.println(s.pop());
//        s.show();
        System.out.println("Value at the top: " + s.peek());
        System.out.println(s.pop());
//        s.show();
        System.out.println("Value at the top: " + s.peek());
        System.out.println(s.pop());
//        s.show();
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
//        s.show();
        System.out.println(s.isEmpty());


    }
}


