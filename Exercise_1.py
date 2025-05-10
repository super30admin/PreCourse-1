'''
Time Complexity

1) isEmpty - O(1) [Calculating length of a given list is a constant time operation in python]
2) push - O(1) [Appending to end of a list in python is constant operation. 
                Though occassional resizing may occur, python optimizes it
                and on average it is O(1)]
3) pop - O(1) [Removing from the end of the list is a constant time operation]
4) peek - O(1) [Accessing the last element is a direct lookup and a constant time operation]
5) size - O(1) [Calculating length of a given list is a constant time operation in python]
6) show - O(n) [Creating a copy of the list takes linear time proportional to the list]

'''


class myStack:
    def __init__(self):
        self.stack = []

    def isEmpty(self):
        return len(self.stack) == 0

    def push(self, item):
        return self.stack.append(item)

    def pop(self):
        if self.isEmpty():
            raise IndexError("Invalid Operation: Popping from an empty stack")
        else:
            return self.stack.pop()

    def peek(self):
        if self.isEmpty():
            raise IndexError(
                "Invalid Operation: Cannot peek from an empty stack")
        else:
            return self.stack[-1]

    def size(self):
        return len(self.stack)

# Creating a copy and returning so that the user cannot modify the original array
    def show(self):
        return self.stack.copy()


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
