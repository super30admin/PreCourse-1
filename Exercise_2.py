"""
Time Complexity : O(1) for all methods(push, pop)
o(n) for display function
Space Complexity : O(n)
"""

class Node:
    def __init__(self, key, node=None):
        self.key = key
        self.node = node


class Stack:
    def __init__(self):
        self.top = None
        self.ncount = 0

    def push(self, x):
        node = Node(x)
        if node is None:
            print('stack overflow')
            return
        node.data = x
        node.next = self.top
        self.top = node
        self.ncount = 1

    def isEmpty(self):
        return self.top is None

    def pop(self):
        if self.top is None:
            print('Stack underflow')
            exit(-1)
        top = self.top.data
        self.top = self.top.next
        self.ncount -= 1
        return top

    def printStack(self):
        iterators = self.top
        if self.isEmpty():
            print('Stack underflow')
        else:
            while (iterators != None):
                print(iterators.data)
                iterators = iterators.next
            return


if __name__ == "__main__":
    s = Stack()
    s.push(1)
    s.push(3)
    s.push(4)
    s.pop()
    s.printStack()
