class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() { 
        return top == -1;
    } 

    Stack() { 
        top = -1;
    } 
  
    boolean push(int x) { 
        if(top == MAX) {
            System.out.println("Stack overflow");
            return false;
        }
        top++;
        a[top] = x;
        return true;
    } 
  
    int pop() { 
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int topValue = a[top];
        a[top] = 0;
        top--;
        return topValue;
    } 
  
    int peek() { 
        if(top == -1) return 0;
        return a[top];
    } 

    void printElements() {
        StringBuilder sb = new StringBuilder("Stack elements:"); 
        for(int i=0; i<a.length; i++) {
            if(a[i]!=0) {
                sb.append(" ");
                sb.append(a[i]);
            }
        }
        System.out.println(sb);
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
        s.push(40); 
        s.push(50);
        s.push(60);
        s.push(70);
        s.push(80);
        System.out.println("Before pop"); 
        s.printElements();


        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println("After pop"); 
        s.printElements();

        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println("After pop"); 
        s.printElements();

        s.push(90);
        System.out.println("After push"); 
        s.printElements();
    }
}
