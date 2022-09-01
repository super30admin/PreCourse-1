class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    def __init__(self):
        # initialising the stack as empty array
        self.stack = []

    def isEmpty(self):
        # If array is empty - isEmpty returns True
        # Time Complexity: O(1)
        return self.stack == []

    def push(self, item):
        # Append the item at the end of the array
        # Time & Space Complexity: O(1)
        self.stack.append(item)

    def pop(self):
        # Fetch the last element from the array, i.e. the latest inserted 
        # Delete the fetched element
        # Time Complexity: O(n)
        if (not self.isEmpty()):
        	lastElement = self.stack[-1]
        	del(self.stack[-1])
        	return lastElement
        else:
        	return("Stack is empty")
        
    def peek(self):
        # Fetch the last element from the array, i.e. the latest inserted
        # Time Complexity: O(1)
        return self.stack[-1]

    def size(self):
        # Time Complexity: O(1)
        return len(self.stack)

    def show(self):
        return self.stack

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())


