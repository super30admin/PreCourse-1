"""
- Space complexity is O(n) as I'm using a list to store and pop the elements.
- Time complexity to push the element is O(1) as we're just
 adding the element at the end.
- Time complexity to pop the element is O(1) as well as
 we're popping the last element.
"""

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self.stack = []

     def isEmpty(self):
         if self.stack == []:
             return True
         else:
            return False

     def push(self, item):
         self.stack.append(item)

     def pop(self):
        if self.stack:
            x = self.stack.pop(-1)
            return x
        else:
            print("The stack is empty!")
        
     def peek(self):
        return self.stack[-1]

     def size(self):
         return len(self.stack)

     def show(self):
         return self.stack

s = myStack()
print(s.isEmpty())
s.push('1')
s.push('3')
s.push('5')
s.push('2')
print(s.isEmpty())
popped_element = s.pop()
print(popped_element)
print(s.show())
print(s.peek())
print(s.size())
s.pop()
print(s.show())
print(s.peek())