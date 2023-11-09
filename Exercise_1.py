"""
Rasika Sasturkar
Time complexity: O(1)
Space complexity: O(n), n is no. of elements in the array
"""

class myStack:
    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.stk = []

    def isEmpty(self):
        return len(self.stk) == 0

    def push(self, item):
        self.stk.append(item)

    def pop(self):
        if self.stk:
            return self.stk.pop()
        return

    def peek(self):
        if self.stk:
            return self.stk[-1]
        return

    def size(self):
        return len(self.stk)

    def show(self):
        return self.stk


def main():
    s = myStack()
    s.push('1')
    s.push('2')
    print(s.pop())  # returns '2'
    print(s.show())  # prints ['1']


if __name__ == "__main__":
    main()
