class myStack:
    stack_array = []
    max_size = 10000

    def __init__(self):
        self.stack_array = []

    def isEmpty(self):
        return len(self.stack_array) == 0

    def push(self, item):
        if len(self.stack_array) <= self.max_size:
            self.stack_array.append(item)
        else:
            print("Stack Full!!")

    def pop(self):
        if (len(self.stack_array) != 0):
            return self.stack_array.pop()
        else:
            print("Stack is Empty!!")

    def peek(self):
        # check if empty
        if len(self.stack_array) == 0:
            print("Stack is Empty")
        else:
            return self.stack_array[len(self.stack_array) - 1]

    def size(self):
        return len(self.stack_array)

    def show(self):
        return self.stack_array


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
