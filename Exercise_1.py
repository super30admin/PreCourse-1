class myStack:

    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file
    # Time Complexity is O(1) and Space Complexity is O(1)

    def __init__(self):
        self.arr = []

    def isEmpty(self):
        if len(self.arr) == 0:
            return True

        else:
            return False


    def push(self, item):
        return self.arr.append(item)


    def pop(self):
        k = self.arr[-1]
        self.arr = self.arr[:-1]
        return k


    def peek(self):
        return self.arr[-1]


    def size(self):
        return len(self.arr)


    def show(self):
        return self.arr


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
