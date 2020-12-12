class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.ll = None
        
    def push(self, data):
        if(self.ll == None):
            # create LL
            self.ll = Node(data)
        else:
            # create reverse LL with head at last (LIFO manner)
            node = Node(data)
            node.next = self.ll
            self.ll = node

    def pop(self):
        if(self.ll == None):
            return None
        val = self.ll.data
        self.ll = self.ll.next
        return val


        
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
