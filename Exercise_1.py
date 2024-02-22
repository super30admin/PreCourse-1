class myStack:

    # time Complexity = O(1), Space compexity = O(1)
    def __init__(self):
        self.array = []  # Intilized stack

    def isEmpty(self):
        return len(self.array) == 0  # Check if stack is empty

    def push(self, item):
        self.array.append(item)  # Push item to stack

    def pop(self):  # Pop item from stack
        if len(self.array) == 0:
            return None
        else:
            top = self.array[-1]
            self.array = self.array[:-1]
            return top

    def peek(self):  # Get the last item from the stack
        if len(self.array) == 0:
            return None
        else:
            return self.array[-1]

    def size(self):  # return the size of stack
        return len(self.array)

    def show(self):  # Display stack
        print(self.array)


s = myStack()
s.push("1")
s.push("2")
s.push("3")
print(s.pop())
print(s.show())
print(s.isEmpty())
