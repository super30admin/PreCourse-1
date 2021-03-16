class Node:
    def __init__(self, data):
       self.data = data
       self.next = None

class Stack:
    def __init__(self):
        # Stack as a Linked list
        self.Node = None

    def push(self, data):
        if(self.Node == None):
            self.Node = Node(data)
        else:
            newNode = Node(data)
            self.Node.next = newNode

    def pop(self):
        while(self.Node.next != None):
            traverseNode = self.Node
            self.Node = self.Node.next
        self.Node = traverseNode
        self.Node.next = None

a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()

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
