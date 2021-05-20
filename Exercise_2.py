class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.root = None
        
    def push(self, data):
        new_node = Node(data)
        new_node.next = self.root
        self.root = new_node
    
    def isEmpty(self):
        return self.root ==None
        
    def pop(self):
        if(self.isEmpty()):
            return None
        temp = self.root
        self.root = self.root.next
        popped = temp.data
        return popped
        
a_stack = Stack()
while True:
    print('\npush <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
 
    operation = do[0].strip().lower()
    if operation == 'push':
        a_stack.push(int(do[1]))
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.\n')
        else:
            print('Popped value:',  int(popped))
    elif operation == 'quit':
        break
