#  Time Complexity : All operations isEmpty, push, pop, peek, size, show are O(1) 
#  Space Complexity : O(n), where n is the number of elements in the stack, since we store all elements in the list
#  Did this code successfully run on Leetcode : Yes 
#  Any problem you faced while coding this : No


#  Your code here along with comments explaining your approach: The myStack class is implemented using a Python list to simulate stack operations efficiently. The __init__ method initializes an empty list called self.stack to store the elements of the stack. The isEmpty method checks if the stack is empty by verifying if the length of self.stack is zero, returning True if empty and False otherwise. The push method appends an item to the end of the list, which represents the top of the stack, ensuring constant time complexity. The pop method removes and returns the last item (top element) from the stack, returning None if the stack is empty to handle underflow gracefully. Similarly, the peek method returns the top element without removing it, also returning None for an empty stack. The size method provides the current number of elements in the stack by returning the length of self.stack. Lastly, the show method returns the entire stack list, which is useful for debugging or displaying the stack's contents. All operations—isEmpty, push, pop, peek, size, and show—run in O(1) time, making this implementation highly efficient, while the space complexity remains O(n) to store the elements. This design adheres to the LIFO (Last-In-First-Out) principle, ensuring correct stack behavior.
class myStack:
    def __init__(self):
      self.stack = []
    
    def isEmpty(self):
      return len(self.stack)
         
    def push(self, item):
      self.stack.append(item)
         
    def pop(self):
      if self.isEmpty():
        return None
      return self.stack.pop()
        
    def peek(self):
      if self.isEmpty():
        return None
      return self.stack[-1]
        
    def size(self):
      return len(self.stack)
         
    def show(self):
      return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
