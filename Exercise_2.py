class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.root = None
        
    def push(self, data):
        if self.root == None:
            self.root = Node(data)
        else:
            newNode = Node(data)
            newNode.next = self.root
            self.root = newNode

    def pop(self):
        if not self.root:
            return None
        else:
            cur = self.root
            self.root = self.root.next
            cur.next = None
            return cur.data

 
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
