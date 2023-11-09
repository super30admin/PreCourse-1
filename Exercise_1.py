# Space complexity: O(n)

# Did this code successfully run on Leetcode : Sucessfully runs on geegsforgeeks
# Any problem you faced while coding this : NO


# Your code here along with comments explaining your approach

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       #initialize with array when object is created
         self.stack=[]

     # Time complexity isEmpty:O(n)
     def isEmpty(self):
       #if size of the array is zero then Empty else not
        if self.size()==0:
           return True
        else:
            return False
      
      # Time complexity push:O(n)
     def push(self, item):
       #adds the item at the end of the array
        self.stack.append(item)
        # return self.stack
      
      # Time complexity pop:O(n)
     def pop(self):
       #if the size of array is zero then stack is empty
        if self.size()==0:
          print("Stack is Empty")
          return
        #del_element stores the value of the recent item. arr[-1] in python gets the last element of array in O(1) runtime.
        del_element=self.stack[-1]
        #delete the last element from memory
        del self.stack[-1]
        return del_element

      # Time complexity peek:O(1)  
     def peek(self):
        return self.stack[-1]

    # Time complexity size:O(n)
     def size(self):
      #returns length of the stack 
         return len(self.stack)

     # Time complexity show:O(n)    
     def show(self):
       #print all values in the stack
         for i in range(self.size()):
           print(self.stack[i])

s = myStack()
print(s.pop())
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
s.push('3')
s.push('4')
print(s.pop())
print(s.show())
s.push('5')
s.push('6')
print(s.pop())
print(s.show())
