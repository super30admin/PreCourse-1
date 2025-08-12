class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  """
  In Python, len() does not iterate through a list. Python lists and collections store their length as a 
  built-in attribute. So len() in
  Lists --> O(1)
  Sets --> O(1)
  Dictionaries --> O(1)
  Strings --> O(1)
  So, isEmpty() and size() is O(1)

  show() is O(n) because you are accessing each element in the stack one by one to display or return them.
  """

  """
  Time Complexity
  isEmpty(): O(1)
  push(): O(1)
  pop(): O(1)
  peek(): O(1)
  size(): O(1)
  show(): O(n)

  Space Complexity: O(n)
  """


  def __init__(self):
      self.items = []
         
  def isEmpty(self):
      return len(self.items) == 0
         
  def push(self, item):
      self.items.append(item)
         
  def pop(self):
      if self.isEmpty():
          raise Exception("Stack is Empty")
      return self.items.pop()
        
  def peek(self):
      if self.isEmpty():
          raise Exception("Stack is Empty")
      return self.items[-1]
        
  def size(self):
      return len(self.items)
         
  def show(self):
      """
      return self.items violates encapsulation. Use __str__ (User-readable), __repr__ (Debugging; called by default when __str__ is missing, 
      even for print()) or return a copy list(self.items).
      Encapsulation means wrapping data and the methods that operate on that data into a single unit (a class), 
      while hiding the internal details from the outside world. 
      Encapsulation levels:
      self.items	Public
      self._items	Protected
      self.__items	Private 
      """
      return str(self)

  def __str__(self):
      return "Stack displayed from top to bottom: " + " --> ".join(map(str, reversed(self.items)))
  
  def __repr__(self):
      return "Stack displayed from top to bottom: " + " --> ".join(map(str, reversed(self.items)))
          
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())