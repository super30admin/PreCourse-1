class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.top = None  # initializing an empty stack

    def push(self, data):
        new_Node = Node(data)
        new_Node.next = self.top
        self.top = new_Node

    def pop(self):
        if self.top is None:
            raise IndexError("pop from empty stack")

        data = self.top.data
        self.top = self.top.next
        return data

    def peek(self):
        if self.top is None:
            raise IndexError("peek from empty stack")
        return self.top.data

    def is_empty(self):
        return self.top is None

    def size(self):
        count = 0
        current = self.top
        while current is not None:
            count += 1
            current = current.next
        return count

    def show(self):
        current = self.top
        while current is not None:
            print(current.data)
            current = current.next


a_stack = Stack()
a_stack.push(5)
a_stack.push(10)
a_stack.push(15)
a_stack.push(20)
a_stack.push(25)

print("Stack size:", a_stack.size())
print("Top element:", a_stack.peek())

popped_item = a_stack.pop()
print("Popped item:", popped_item)

print("Is the stack empty?", a_stack.is_empty())

print("Stack elements:")
a_stack.show()
