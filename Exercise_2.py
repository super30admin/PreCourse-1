
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.stack = None

    def push(self, data):
        if self.stack is None:
            self.stack = Node(data)
        else:
            curr = self.stack
            while curr.next:
                curr = curr.next
            curr.next = Node(data)

    def pop(self):
        curr = self.stack
        prev = None
        temp = None
        if curr is None:
            return None
        elif curr.next is None:
            temp = curr.data
            curr.data = None
            curr.next = None
            return temp
        while curr.next:
            prev = curr
            curr = curr.next
        prev.next = None
        return curr.data


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
