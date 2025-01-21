'''

// Your code here along with comments explaining your approach
used top as a pointer incrementing it while pushing and 
while popping checking if stack is empty or not
if its not empty getting the top element
and then decrementing top pointer one

1. push () :
  1. appending item into the arr
  2. incrementing the top pointer by 1

2. pop:
  1. checking the stack if its empty or not
  2. if its not empty geet the popped element
  3. decrement the top pointer by 1
  
3. peek:
 1. check if the array ahs elemnet (isempty())
 2. if thers any element present 
 3. return the top eleemnt 
  
'''
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  # Space Complexity: O(n)
  # Time : O(n)
     def __init__(self):
         self.arr=[]
         self.top=-1
         
     def isEmpty(self):
       if len(self.arr)==0:
         return True
       return False
         
     def push(self, item):
       
       self.arr.append(item)
       self.top+=1
       
         
     def pop(self):
       if self.isEmpty()==True:
         return "stack underflow"
       element=self.arr[self.top]
       self.top-=1
       return element
        
        
     def peek(self):
       if self.isEmpty()==True:
         return "stack underflow"
       return self.arr[top]
        
     def size(self):
       return self.top+1
         
     def show(self):
       return self.arr.copy()
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
