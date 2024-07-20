//time - O(1), space - O(n)
class Stack {
    static final int MAX = 1000;
    int[] nums;
    int index;

    public Stack() {
        nums = new int[MAX];
        index = -1;
    }

    public int pop() {
        if(index < 0) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int topElement = nums[index];
        nums[index] = 0;
        index--;
        return topElement;
    }

    public boolean push(int x) {
        if(index >= MAX-1) {
            System.out.println("Stack Overflow");
            return false;
        }
        index++;
        nums[index] = x;
        return true;
    }

    public int peek() {
        return nums[index];
    }

    public boolean isEmpty() {
        if(index < 0) {
            return true;
        } else {
            return false;
        }
    }
}
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(6);
        stack.push(10);
        while(!stack.isEmpty()) {
            System.out.println("peek = "+stack.peek());
            System.out.println("pop = "+stack.pop());
            System.out.println("isEmpty() = "+stack.isEmpty());
        }
    } 
}
