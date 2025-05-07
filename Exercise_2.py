# Time complexity o(1)- push pop
# space complexity o(n)- n is no of elements in the stact

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.head = None

    def push(self, data):
        element = Node(data)
        element.next = self.head
        self.head = element

    def pop(self):
        if not self.head:
            return None
        poppedElement = self.head.data
        temp = self.head
        self.head = self.head.next
        del temp
        return poppedElement


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
