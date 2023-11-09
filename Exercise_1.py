"""
Time Complexity : O(1) for all methods

Space Complexity : O(n)

Did this code successfully run on Leetcode : N/A

Any problem you faced while coding this : No
"""

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         #initiated a list and set top = -1
        self.stack = list()
        self.top = -1
         
     def isEmpty(self):
         #checking if stack is empty by checking position of top
         if self.top == -1:
             return True
         else:
            return False

     def push(self, item):
        #increment value of top and add value to newly value of top.
        #new top will be postition where new_data is ti be added.
        self.top += 1
        self.stack.insert(self.top, item)
        print("PUSH successful")

     def pop(self):
         #first return value of top then decrement top value.
         #then decrement value of top so that new stack is considered from 0 to new top. Position from old top
         #will not be considered.
        if self.isEmpty() == True:
            return "Stack is already empty"
        else:
            ans = self.stack.pop(self.top)
            self.top -= 1
            return ans
        
     def peek(self):
         #return value at top position.
        return self.stack[self.top]

     def size(self):
        if self.isEmpty() == True:
            return 0
        else:
            return self.top+1

     def show(self):
        #just returning stack and using print function to print
        if self.isEmpty() == True:
            return "Stack is empty"
        else:
            return self.stack

if __name__ == '__main__':
    s = myStack()
    s.push('1')
    s.push('2')
    s.push('3')
    s.push('4')
    print(s.pop())

    print(s.show())
    print(s.peek())
