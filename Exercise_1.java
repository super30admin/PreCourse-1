public class Stack {

            static final int MAX = 1000;
            int top;
            int a[] = new int[MAX]; // Maximum size of Stack

            boolean isEmpty()
            {
                //Write your code here
                if (top < 0){
                    System.out.println("Stack is empty");
            }
                else{
                    System.out.println("Stack is not empty");
                }

                return(top<0);

            }

            Stack()
            {
                //Initialize your constructor
                top=-1;
            }

            boolean push(int x)
            {
                //Check for stack Overflow
                if(top > (MAX-1))
                {
                    System.out.println("Stack overflow");
                    return false;
                }
                //Write your code here
                top = top+1;
                a[top]=x;
                System.out.println("Pushed into stack" +x);
                return true;
            }

            int pop()
            {
                //If empty return 0 and print " Stack Underflow"
                if(top<0)
                {
                    System.out.println("Stack Underflow");
                    return 0;
                }
                //Write your code here
                int x= a[top];
                top--;
                return x;

            }

            int peek()
            {
                //Write your code here
                int x=a[top];
                return x;
            }
        }

        // Driver code
        class Main {
            public static void main(String args[])
            {
                Stack s = new Stack();
                s.isEmpty();
                s.push(10);
                s.push(20);
                s.push(30);
                System.out.println(s.pop() + " Popped from stack");
            }
        }


