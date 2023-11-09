# Time Complexity : O(n) because of push operation and o(1) otherwise
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : I was not able to find the same question on leetcode
# Any problem you faced while coding this : print(s.show()) printed None after printing all the elements as my function s.show() already prints all the elements and there is no need of a print() for this function to work
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.stack = []
         
     def isEmpty(self):
       return True if len(self.stack) == 0 else False
         
     def push(self, item):
         self.stack.append(item)

     def pop(self):
        if self.isEmpty():
          return -1
        else:
          last_item = self.stack[-1]
          self.stack.pop()
          return last_item

    # Assuming that peek returns the last item of the stack 
     def peek(self):
       if self.isEmpty():
         return -1
       else:
         return self.stack[-1]
        
     def size(self):
       return len(self.stack)

    # Assuming that show prints all items in stack from bottom to top
     def show(self):
       if not self.isEmpty():
        for e in self.stack:
          print(e)
       else:
         print("Nothing to show!")

         
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
s.show() # Changed from print(s.show()) to avoid printing of None as s.show() by itself prints
