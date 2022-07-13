class myStack:
    def __init__(self, max_size: int):
        self._top = -1
        self._a = []
        if max_size <= 0:
            raise ValueError("Dude!!! Stack with -ve or 0 Size is useless, are you lost?")
        self._size = max_size

    def __str__(self):
        if self.isEmpty():
            return "Stack Empty, Nothing to show"
        return "Stack: " + str(self._a)

    def isEmpty(self) -> bool:
        if self._top == -1:
            return True
        return False

    def isFull(self) -> bool:
        if self._size == self._top + 1:
            return True
        return False

    def push(self, item: str) -> (bool, str):
        if self.isFull():
            return False, f"Push Operation: Stack Overflow, item {item} is not pushed onto the stack"
        self._a.append(item)
        self._top += 1
        return True, item

    def pop(self) -> (bool, str):
        if self.isEmpty():
            return False, f"Pop Operation: Stack Underflow, Nothing Popped out of the stack"
        self._top -= 1
        return True, self._a.pop(self._top+1)

    def peek(self) -> (bool, str):
        if self.isEmpty():
            return False, f"Peek Operation: Stack Empty"
        return True, self._a[self._top]

    def size(self) -> int:
        if self.isEmpty():
            return 0
        return self._top+1

    def show(self):
        if self.isEmpty():
            print("Stack Empty, Nothing to show")
            return
        print(self._a)


if __name__ == "__main__":
    s = myStack(3)
    s.push('1')
    s.push('2')
    print(s.size())
    print(s.push('3'))
    print(s.push('4'))
    print(s.size())
    print(s.peek())
    print(s.pop())
    s.show()
