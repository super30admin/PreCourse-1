class myStack:
    '''
       Time Complexity : push - O(1), pop - O(1)

       Space Complexity : O(n) ; n --> items present in the stack

    '''

    def __init__(self):
        self.my_stack = []

    def isEmpty(self):
        return len(self.my_stack) <= 0

    def push(self, item):
        return self.my_stack.append(item)

    def pop(self):
        return self.my_stack.pop()

    def peek(self):
        if not self.my_stack:
            return None
        return self.my_stack[-1]

    def size(self):
        return len(self.my_stack)

    def show(self):
        return self.my_stack


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
