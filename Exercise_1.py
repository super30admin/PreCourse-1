class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  # Time Complexity:
  #  push(item): O(1)
  #  pop(): O(1)
  #  peek(): O(1)
  #  isEmpty(): O(1)
  #  size(): O(1)
  #  show(): O(n)
  # Space Complexity: O(n)
     def __init__(self):
        """
        Initializes an empty stack.
        """
        self.stack = []
         
     def isEmpty(self):
       """
        Checks if the stack is empty.

        Returns:
            bool: True if the stack is empty, False otherwise.
        """
        return len(self.stack) == 0
         
     def push(self, item):
       """
        Adds an item to the top of the stack.

        Args:
            item: The item to be added.
        """
        self.stack.append(item)
         
     def pop(self):
       """
        Removes an item from the top of the stack.

        Returns:
            The removed item if the stack is not empty, None otherwise.
        """
        if not self.isEmpty():
            return self.stack.pop()
        else:
            return None
        
        
     def peek(self):
        """
        Returns the item at the top of the stack without removing it.

        Returns:
            The item at the top of the stack if it's not empty, None otherwise.
        """
        if not self.isEmpty():
            return self.stack[-1]
        else:
            return None
        
     def size(self):
        """
        Returns the number of items in the stack.

        Returns:
            int: The number of items in the stack.
        """
        return len(self.stack)

         
     def show(self):
       """
        Returns the items in the stack.

        Returns:
            list: A list of items in the stack.
        """
        return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
