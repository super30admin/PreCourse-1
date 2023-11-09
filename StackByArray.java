//Exercise_1
//
public class StackByArray {
    // static final int size=100;
    static final int size=3;
    int top=-1;
    int a[]=new int[size];
    public static void main(String[] args) {
          StackByArray st=new StackByArray();
       if(st.isEmpty()) System.out.println("stack is now empty");
        else System.out.println("stack is not empty");
        
        System.out.println("pushing elements into the stack");
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("elements in the stack are ");
        st.print();
        System.out.println("peek element in the stack now is "+st.peek());
        // st.print();
        System.out.println("popping the element "+st.pop());
        System.out.println("stack now is ");
        st.print();
        
        System.out.println("popping all the elements "+st.pop()+" "+st.pop());
        System.out.println(st.pop());
        
        
    }
    
    void print(){
        for(int i=top;i>=0;i--){
            System.out.println(a[i]);
        }
    }
    
    boolean isEmpty(){
        if(top<0) return true;
        return false;
    }
    boolean push(int x){
        if(top==size-1) {
            System.out.println("stack overflow cannot push further elements into the stack");
            return false;
        }
        top++;
        a[top]=x;
        return true;
    }
    int pop(){
        if(top==-1) {
            System.out.println("stack underflow");
            return 0;
        }
        int x=a[top];
        top--;
        return x;
    }
    int peek(){
        if(top==0){
            System.out.println("no elements in the stack");
            return 0;
        }
        return a[top];
    }
    
}