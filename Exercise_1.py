# Stack using Array/List
# Time complexity for all the functions O(1) except show() that is O(n) because it is returning all the elements.
# Space complexity here is O(n) as we are storing n elements in the stack.
class myStack:
    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.items = []

    def isEmpty(self):
        return len(self.items) == 0  # check if stack is empty

    def push(self, item):
        self.items.append(item)  # Add an item to the top of the stack

    def pop(self):
        if self.isEmpty():
            raise IndexError("Pop from empty stack")  # raise an error if empty
        return (
            self.items.pop()
        )  # remove/pop and return an item from the top of the stack

    def peek(self):
        if self.isEmpty():
            raise IndexError("Peek from empty stack")  # raise an error if empty
        return self.items[
            -1
        ]  # return an item from the top of the stack without removing

    def size(self):
        return len(self.items)  # return size of the stack

    def show(self):
        return self.items  # returns the list of stack elements


s = myStack()
s.push("1")
s.push("2")
print(s.pop())
print(s.show())
