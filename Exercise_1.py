# Time Complexity : isEmpty: O(1), push:O(1), pop: O(1), peek:O(1), size:O(1), show:O(1)
# Space Complexity : isEmpty: O(1), push:O(1), pop: O(1), peek:O(1), size:O(1), show:O(n)
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this :No


# Your code here along with comments explaining your approach

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.stack = [] #To initialize a stack which is implemented using array

    def isEmpty(self):
         return len(self.stack) == 0 #Check the length of array to see whether it is empty or not
    
    def push(self, item):
         self.stack.append(item) #append item to the end of array

    def pop(self):
        return self.stack.pop() #display and remove the last element of array
    
    def peek(self):
        if len(self.stack) == 0:
            return -1   
        else:
            return self.stack[len(self.stack)-1] #display the last element of array i.e. top of stack
            
    def size(self):
         return len(self.stack) #display length of stack
    
    def show(self):
         return self.stack #return stack

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
