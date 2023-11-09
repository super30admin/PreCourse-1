"""
    Problem Statement: Implementing a stack using a array.

    Time complexity:
    isEmpty(): O(1)
    push(): O(1)
    pop(): O(1)
    peek(): O(1)
    size(): O(1)
    show(): O(n)
    
    Space complexity: O(n), where n is the length of the array.
"""

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
    """Initialize the list as empty."""
    self.list = []

  def isEmpty(self):
    """Check whether the stack is empty."""
    return len(self.list) == 0

  def push(self, item):
    """Add an item at the top of the stack"""
    self.list.append(item)

  def pop(self):
    """Pop the top element or return None incase the stack is empty."""
    return self.list.pop() if len(self.list) else None
    
  def peek(self):
    """Show element at the top of the list"""
    return self.list[-1] if len(self.list) else None

  def size(self):
    """Get the length of the stack"""
    return len(self.list)

  def show(self):
    print('Note: Order top to bottom')
    for idx, item in enumerate(self.list[::-1]): print(f"{item} -> ", end="") if idx != (len(self.list) - 1)  else print(item)

s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
print(f"Popped Value: {s.pop()}")
s.show()