class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  #Time complexity-->O(1)
  #Space Complexity-->O(1)

  #This is the Last in first out method   
     
    def __init__(self):
        self.stack = []

    def is_empty(self):
        return len(self.stack) == 0

    def push(self, item):
        #Push the elements at the last index
        self.stack.append(item)

    def pop(self):
        #this will remove the last item
        if self.is_empty():
            raise Exception("Stack is empty")
        return self.stack.pop()

    def peek(self):
        #allow us to see the last elements
        if self.is_empty():
            raise Exception("Stack is empty")
        return self.stack[-1]

    def size(self):
        #shows the size of elements in stack
        return len(self.stack)

    def show(self):
        #shows the elements in the stack
        return self.stack


s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
print(s.pop())
print(s.size())
print(s.show())
