class myStack:
    """
     Time Complexity:
    - push: O(1)
    - pop: O(1)
    - peek: O(1)
    - isEmpty: O(1)
    - size: O(1)
    - show: O(n) – shows copy of the stack

    Space Complexity:
    - O(n) for storing n elements in the stack
    """
    
    def __init__(self):
      """
      Initialize an empty list and size counter
      """
      self.arr = []
      self.size1 = 0

    def isEmpty(self):
      """
      Return True if stack is empty.
      Time: O(1), Space: O(1)
      """
      return self.size1 == 0

    def push(self, item):
      """
      Push an item to the top of the stack.
      Time: O(1), Space: O(1)
      """
      self.arr.append(item)
      self.size1 += 1

    def pop(self):
      """
      Pop and return the top element of the stack.
      Time: O(1), Space: O(1)
      """
      if self.isEmpty():
          return None
      self.size1 -= 1
      return self.arr.pop()
 
    def peek(self):
      """
      Return the top element without removing it.
      Time: O(1), Space: O(1)
      """
      if self.isEmpty():
          return None
      return self.arr[-1]

    def size(self):
      """
      Return the current size of the stack.
      Time: O(1), Space: O(1)
      """
      return self.size1

    def show(self):
      """
      Return a reversed list showing the stack from top to bottom.
      Time: O(n), Space: O(n)
      """
      return self.arr[::-1]
    
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
