

# Class to create Node for linked-list
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

# Class to create Stack


class Stack:

    # Constructor
    def __init__(self):
        self.head = None

# Push
    def push(self, data):

        if self.head == None:
            self.head = Node(data)
        else:
            # set the `.next` pointer of the new node to point to the current
            # head node of the list
            newNode = Node(data)
            newNode.next = self.head
            newNode.head = self.head
            self.head = newNode

    def pop(self):
        popped = self.head
        self.head = self.head.next
        popped.next = None
        return popped.data


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
