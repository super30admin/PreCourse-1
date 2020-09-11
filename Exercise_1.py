# Exercise_1 : Implement Stack using Array.


class MyStack:
    def __init__(self):
        # define stack as a list
        self.holder = []

    def isEmpty(self):
        # if size is zero, return true
        return self.size() == 0

    def push(self, item):
        # Add new item in the list
        self.holder.append(item)
        return True

    def pop(self):
        # Remove top element of stack i.e. last element of a list
        popped = self.holder.pop()
        return popped

    def peek(self):
        # If stack is empty i.e. stack underflow, raise exception.
        if self.isEmpty():
            raise Exception("Stack Empty!")
        # Else return top element of stack i.e. last element of list
        return self.holder[-1]

    def size(self):
        # return length of the stack
        return len(self.holder)

    def show(self):
        # return the list as stack
        return self.holder


# Driver code
stackObj = MyStack()
print("Is stack empty? ",stackObj.isEmpty())
print("Push 1 to stack ", stackObj.push('1'))
print("Push 2 to stack ", stackObj.push('2'))
print("Push 3 to stack ", stackObj.push('3'))
print("Peek element: ", stackObj.peek())
print("Show stack: ", stackObj.show())
print("Pop an element: ", stackObj.pop())
print("Size of a stack: ", stackObj.size())
print("Show stack: ", stackObj.show())
print("Is stack empty? ", stackObj.isEmpty())
