class myStack:
    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file

    MAX = 1000

    def __init__(self):
        self.st = []

    def isEmpty(self):
        return len(self.st) == 0

    def push(self, item):
        if self.size() == self.MAX:
            print("Stack overflow")
            return False

        self.st.insert(0, item)
        return self.st

    def pop(self):
        if len(self.st) == 0:
            print("Stack Underflow")
            return 0
        return self.st.pop(0)

    def peek(self):
        return self.st[0]

    def size(self):
        return len(self.st)

    def show(self):
        return self.st


s = myStack()
s.push("1")
s.push("2")
print(s.pop())
print(s.show())
