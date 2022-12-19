class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack
    int index;

    boolean isEmpty() {
        return index == -1;
    }

    Stack() {
        index = -1;
    }

    boolean push(int x) {
        if (index >= MAX)
            return false;
        a[++index] = x;
        return true;
    }

    int pop() {
        if(index == -1){
            System.out.println("Stack Overflow");
            return 0;
        }
        int value =  a[index];
        a[index--] = 0;
        return value;
    }

    int peek() {
        if(index == -1)
            return 0;
        return a[index];
    }
}

// Driver code 
class Main {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
