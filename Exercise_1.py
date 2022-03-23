from Exceptions import Empty


class myStack:
  # Please read sample.java file before starting.
  # Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self._data = []

    def __len(self):
        return len(self._data)

    def isEmpty(self):
        return len(self._data) == 0

    def push(self, item):
        self._data.append(item)

    def pop(self):
        if self.isEmpty():
            raise Empty("Sorry the Stack is empty")
        return self._data.pop()

    def peek(self):
        if self.isEmpty():
            raise Empty("Sorry the stack is empty")
        return self._data[-1]

    def size(self):
        if self.isEmpty:
            raise Empty("No data in the Stack")
        return self.__len()

    def show(self):
        return self._data


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
