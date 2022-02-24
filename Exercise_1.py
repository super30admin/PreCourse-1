

#08:17

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     
     def __init__(self):
      #  An instance variable of type list is used to implement stack
       self.stack=[]
             
     #  Its a simple method to get length of list variable
     def isEmpty(self):
       return len(self.stack)==0
         
    #  This will append an element into list., In python list is an ArrayList 
    # where once its pre-initialized space is full it will allocate current size of space 
     def push(self, item):
       self.stack.append(item)

     # pop on Python list  can pop element at top of a list
     def pop(self):
       if not self.isEmpty():
         return self.stack.pop()

    # This is implemented by returning last element from list using -1 as index
     def peek(self):
       if not self.isEmpty():
        return self.stack[-1]

    #  Returns current length of list
     def size(self):
       return len(self.stack)
    
    # Returns shallow copy of list
     def show(self):
       return self.stack[:]

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
print(s.isEmpty())
print(s.peek())

'''
Time Complexity :
  isEmpty : O(1)
  push    : It is list append  : Average case O(1) and worst case Amortized O(1) refer https://wiki.python.org/moin/TimeComplexity
  pop     : It is list pop last element :   Average case O(1) and worst is amortized O(1)
  peek    : O(1)
  size    : O(1)
  show    : O(N)

Space Complexity:
  isEmpty : O(1)
  push    : O(N)
  pop     : O(1)
  peek    : O(1)
  size    : O(1)
  show    : O(N)

Did this code successfully run on Leetcode :
  Yes
Any problem you faced while coding this :
  Not clear about show, but understood as list of all values , went with shallow copy

#Your code here along with comments explaining your approach


'''
