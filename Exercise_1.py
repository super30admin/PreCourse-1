class myStack:    
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    def __init__(self):
       self.top = -1
       self.capacity = 10
       self.array = [None] * self.capacity

    # Time Complexity : O(1)
    # Space Complexity : O(1)
    def isEmpty(self):
        return self.top == -1
    
    # Time Complexity : O(1)
    # Space Complexity : O(1)
    def isFull(self):
        return self.top == self.capacity - 1
    
    # Time Complexity : O(1)
    # Space Complexity : O(1)
    def push(self, item):
         if(not self.isFull()):
            self.top += 1
            self.array[self.top] = item
            return
         raise Exception("Stack is Full")
    
    # Time Complexity : O(1)
    # Space Complexity : O(1)
    def pop(self):
        if(not self.isEmpty()):
            item = self.array[self.top]
            self.top -= 1
            return item
        raise Exception("Stack is Empty")
    
    # Time Complexity : O(1)
    # Space Complexity : O(1)
    def peek(self):
        if(not self.isEmpty()):
            return self.array[self.top]
        raise Exception("Stack is Empty")
        
    # Time Complexity : O(1)
    # Space Complexity : O(1)
    def size(self):
         return self.top + 1
    
    def show(self):
         return self.array

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
