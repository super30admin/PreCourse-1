class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  # Time complexity - t(1)
  # Space Complexity - s(1)

    def __init__(self):
        self.stac = []

    def isEmpty(self):
        return False if len(self.stac) else True

    def push(self, item):
        self.stac.append(item)

    def pop(self):
        return self.stac.pop()

    def peek(self):
        return self.stac[0]

    def size(self):
        return len(self.stac)

    def show(self):
        return self.stac


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
