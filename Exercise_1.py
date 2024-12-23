class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  #Time Complexity:
    #     O(1) for all the functions
    #     show(self): O(n) - Linear time to iterate and print all elements (worst case).
    # Space Complexity:
    #     - All methods: O(n) - The stack uses a list, whose space usage grows linearly with the number of elements.
     def __init__(self):
      #Initialized the list
      self.items = []

     def isEmpty(self):
      #returns true if its empty
      return len(self.items) == 0

     def push(self, item):
      #Pushes the element from the end
      self.items.append(item)

     def pop(self): 
      #Pops the element from the end but raises error if it's empty
      if self.isEmpty():
        raise IndexError("Empty stack")
      return self.items.pop()
        
     def peek(self):
      #Shows the last element [-1]
      return self.items[-1]

     def size(self):
      #Return size of the stack
      return len(self.items)
         
     def show(self)
      #If the stack is not empty it prints all the elements from the top of the stack to the bottom until there's "None"
      if self.isEmpty():
        print("Empty Stack")
      else:
        for item in reversed(self.items):
          print(item)



         

s = myStack()
s.push('1')
s.push('2')
s.push('3')
print(s.pop())
print(s.peek())
print(s.show())
