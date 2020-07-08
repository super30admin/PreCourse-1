class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
class Stack:
    def __init__(self):
        self.top=None
    
    
    def push(self, data):
        if self.top==None:
            self.top=Node(data)
        else:
            new_node = Node(data)
            new_node.next=self.top
            self.top=new_node

def pop(self):
    if self.top==None:
        return None
        else:
            popped = self.top
            self.top=self.top.next
            return popped

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
