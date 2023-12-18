# Time Complexity: O(1) for all the methods as they take constant ti 
# Space Complexity: O(n) where n is the number of elements in the stack

class myStack:
    def __init__(self):
        self.stack = []  # initializing an empty list for stack

    def isEmpty(self):
        return len(self.stack) == 0  # checking if the stack is empty

    def push(self, item):
        self.stack.append(item) # appending the item to the stack

    def pop(self):
        if not self.isEmpty():
            return self.stack.pop() #`pop` method removes the last element from the list and returns it
        else:
            return "Stack is empty"

    def peek(self):
        if not self.isEmpty():    # checking if the stack is empty
            return self.stack[-1]  # returning the last element from the stack
        else:
            return "Stack is empty"

    def size(self):
        return len(self.stack)   # returning the length of the stack

    def show(self):
        return self.stack   # returning the stack


s = myStack()
s.push('6')
s.push('7')
print(s.pop()) 
print(s.show())  
