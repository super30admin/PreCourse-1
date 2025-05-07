# time complexity isEmpty - o(1), push(o(1)), pop(o(1)), peek -(o(1)), size -(o(1)), peek - o(1), show - o(n)
#  Space complexity - o(size or capacity)
class myStack:
  # Please read sample.java file before starting.
  # Kindly include Time and Space complexity at top of each file
    def __init__(self, size=1000):
        self.stackArray = [0]*size
        self.capacity = size
        self.topIndex = -1

    def isEmpty(self):
        return self.topIndex == -1

    def push(self, item):
        if self.topIndex >= self.capacity-1:
            print("Stack is full cannot insert")
            return
        self.topIndex += 1
        self.stackArray[self.topIndex] = item

    def pop(self):
        if self.isEmpty():
            print("Stack is empty cannot pop")
            return -1
        topElement = self.stackArray[self.topIndex]
        self.topIndex -= 1
        return topElement

    def peek(self):
        if self.isEmpty():
            print("Stack is empty cannot peek")
            return -1
        return self.stackArray[self.topIndex]

    def size(self):
        return (self.topIndex)+1

    def show(self):
        if self.isEmpty():
            print("Stack is empty cannot show")
            return
        for i in range(self.size()):
            print(self.stackArray[i])


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
