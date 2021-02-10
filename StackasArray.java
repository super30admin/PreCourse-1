import java.util.Arrays;

class StackasArray {
    final int MAX = 1000;
    int capacity;
    int top;
    int a[]; // Maximum size of Stack

    boolean isEmpty()
    {
        return (this.capacity<0);
        //Write your code here
    }

    StackasArray(int capacity)
    {
        this.capacity=0;
        this.a = new int[capacity];
        this.top= this.a[0];
        //Initialize your constructor
    }
    StackasArray()
    {   this.capacity=0;
        this.a = new int[MAX];
        this.top= this.a[0];

        //Initialize your constructor
    }

    boolean push(int x)
    {
        if(this.capacity>=MAX)
            return false;
        //Check for stack Overflow
        this.a[this.capacity] = x;
        this.capacity++;
        return true;
        //Write your code here
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        if(this.isEmpty()) {
            System.out.println("Stack Overflow");
            return 0;
        }

        int temp =this.a[--this.capacity];
        this.a[capacity]=0;
        return temp;
        //Write your code here
    }

    int peek()
    {
        //Write your code here
        if(this.isEmpty()) {
            System.out.println("Stack Overflow");
            return 0;
        }

        int temp =this.a[this.capacity];
        return temp;
    }
}

// Driver code
class Main {
    public static void main(String args[])
    {
        StackasArray s = new StackasArray();
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.pop() + " Popped from stack");
    }
}
