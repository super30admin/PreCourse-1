class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None
        
    def push(self, data):
        new_node = Node(data)
        if self.top is not None:
            new_node.next = self.top
        self.top = new_node
        
    def pop(self):
        if self.top is None:
            return None
        else:
            del_val = self.top.data
            del_node = self.top
            self.top = self.top.next
            del_node = None
            return del_val
        
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
