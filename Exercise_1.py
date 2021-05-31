class myStack:
    s_array = []
    max = 1000

    def __init__(self):
        self.s_array = []

    def isEmpty(self):
        return len(self.s_array) == 0

    def push(self, item):
        if len(self.s_array) >= self.max:
            print("Stack Overflow")
        else:
            self.s_array.append(item)
        print("Pushed", item)

    def pop(self):
        if self.isEmpty():
            print("Stack Underflow")
        else:
            self.s_array.pop()

    def peek(self):
        if self.isEmpty():
            print("Stack Underflow")
        else:
            self.s_array[(len(self.s_array)) - 1]

    def size(self):
        return len(self.s_array)

    def show(self):
        return self.s_array


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

