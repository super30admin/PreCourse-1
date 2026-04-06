# Time complexity: O(1)
# Space complexity: O(n)
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
        self.q = deque()  #initializing an empty deque
         
     def isEmpty(self):
       return len(self.q) == 0  #returns true when stack is empty
         
     def push(self, item):
       self.q.append(item) #adds a value to the end which is the top of the stack
         
     def pop(self):
       return self.q.pop()  #removes last value that is inserted      
        
     def peek(self):
       return self.q[-1] #returns the last(top most) value   
        
     def size(self):
       return len(self.q) # returns no.of elements in the stack
         
     def show(self):
       return list(self.q) #return all elements in the stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
