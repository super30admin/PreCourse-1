# Time Complexity: Push - O(1), Pop - O(1), Peek - O(1), isEmpty - O(1)
# Space Complexity: O(n), where n is the capacity of the stack
class myStack:

    def __init__(self, capacity):  # __init__ is a constructor
        self.capacity = capacity  # maximum size of the stack
        self.top = -1  # Index of the topmost element; -1 means stack is empty
        self.a = [0] * capacity  # List to hold stack elements, initialized to 0

    def isEmpty(self):
        return self.top < 0

    def push(self, item):
        if self.top >= self.capacity - 1:  # Check if the stack is already full
            print("Stack Overflow")  # Print error message if there's no space
            return False
        self.top += 1  # Increment the top pointer to next position
        self.a[self.top] = item  # Insert the element at the new top position
        return True

    def pop(self):
        if self.top < 0:  # Check if the stack is empty
            print("Stack Underflow")  # Print error if there's nothing to pop
            return 0
        popped = self.a[self.top]  # Get the top element
        self.top -= 1  # Decrease the top pointer (remove element logically)
        return popped

    def peek(self):
        if self.top < 0:  # Check if the stack is empty
            print("Stack is Empty")
            return 0
        return self.a[self.top]  # Return the top element without removing it

    def size(self):
        return self.top + 1

    def show(self):
        if self.isEmpty():
            print("Stack is Empty")
            return
        print("stack contents (botton to top:", end=" ")
        for i in range(self.top + 1):
            print(self.a[i], end=" ")
        print()


s = myStack(5)
s.push('1')
s.push('2')
print(s.pop(), "popped from stack")
print(s.show())
