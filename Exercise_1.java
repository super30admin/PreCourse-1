class Exercise_1 {

    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top > -1){
            return false;
        }else{
            return true;
        }
    } 

    Exercise_1()
    { 
        top = -1;
    } 
  
    void push(int x)
    { 

        if(top < MAX-1){
            top++;
            a[top] = x;
//            System.out.println("top" + top);
//            return true;
        }else{
            System.out.println("Stack OverFlow");
        }

    } 
  
    void pop()
    {
        if(!isEmpty()){
            int e = a[top];
            top--;
            System.out.println(e + " Popped from stack ");
        }else{
            System.out.println(" Stack Underflow");
        }

    } 
  
    int peek() 
    {
        if(!isEmpty()){
            return a[top];
        }
        return 0;

    }

} 

class Main { 
    public static void main(String args[]) 
    { 
        Exercise_1 s = new Exercise_1();
        s.push(10); 
        s.push(20); 
        s.push(30);
        s.pop();
        System.out.println("peek element:" + s.peek());
    } 
}
