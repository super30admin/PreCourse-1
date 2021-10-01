class myStack:
  # Please read sample.java file before starting.
  # Kindly include Time and Space complexity at top of each file

  # Time Complexity: push -> O(1) pop -> O(n)
  # Space Complexity: O(n)

    def __init__(self):
        self.items = []  # Initialized empty array to take in stack elements

    def isEmpty(self):
        return self.items == []  # Checking if Stack is empty. Will return boolean

    def push(self, item):
        self.items.append(item)  # Push Item to stack

    def pop(self):
        if self.items == []:
            return -1
        return self.items.pop()  # Pop Item from stack

    def peek(self):
        if self.items == []:
            return -1
        return self.items[-1]

    def size(self):
        if self.items == []:
            return -1
        return len(self.items)

    def show(self):
        print(self.items)


s = myStack()
s.push('1')
s.push('2')
# print(s.pop())
print(s.show())
print(s.peek())
