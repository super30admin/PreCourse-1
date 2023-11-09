# Time Complexity is O(1)
# Space Complexity is O(n) --> no of elements we store in the stack
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.stack = None

    def push(self, data):
        if self.stack:
            self.stack.next = Node(data)
            self.stack = self.stack.next
        else:
            self.stack = Node(data)

    def pop(self):
        if self.stack:
            last = self.stack.data
            self.stack = self.stack.next
            return last
        else:
            print("Empty Stack")


a_stack = Stack()
while True:
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    operation = do[0].strip().lower()
    if operation == 'push':
        a_stack.push(int(do[1]))
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'quit':
        break
