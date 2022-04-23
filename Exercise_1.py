from operator import le


class myStack:
  # Please read sample.java file before starting.
  # Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.stk = []

    """
        Check if stack is empty.
        Takes O(1) time.
    """

    def isEmpty(self):
        if len(self.stk) == 0:
            return True
        else:
            return False

    """
        Push element to stack.
        Takes O(1) time.
    """

    def push(self, item):
        self.stk.append(item)

    """
        Push element from stack.
        Takes O(1) time.
    """

    def pop(self):
        self.stk.pop()

    """
        Peek element from stack.
        Takes O(1) time.
    """

    def peek(self):
        return self.stk[len(self.stk) - 1]

    """
        Check size of the stack
        Takes O(1) time.
    """

    def size(self):
        return len(self.stk)

    """
        Show all elements in the stack
        Takes O(1) time.
    """

    def show(self):
        return self.stk


s = myStack()
print(s.isEmpty())
s.push('1')
s.push('3')
s.push('2')
print(s.pop())
print(s.show())
print(s.size())
print(s.peek())
print(s.isEmpty())
