class myStack:
    '''
    Time Complexity:
    isEmpty() - O(1) as it is just checking the length and returning a boolean
    push() - O(1) as we are just appending the item at the end
    pop() - O(1) as we are removing the last item
    peek() - O(1) as we are just returning the last item from the stack
    size() - O(1) as we are just checking the length
    show() - O(1) as we are just displaying the stack 

    Space Complexity:
    O(n) as there are n elements in the stack


    '''

    def __init__(self):
        self.stack = []

    def isEmpty(self):
        return len(self.stack) == 0

    def push(self, item):
        self.stack.append(item)

    def pop(self):
        if not self.isEmpty():
            del(self.stack[-1])

    def peek(self):
        if self.isEmpty():
            return None

        return self.stack[-1]

    def size(self):
        return len(self.stack)

    def show(self):
        return self.stack


s = myStack()
s.push('1')
s.push('2')
s.push('3')
print(s.pop())
print(s.show())
print(s.isEmpty())
print(s.peek())
print(s.size())
