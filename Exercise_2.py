class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        
class Stack:
    # variable to maintain top pointer for stack
    def __init__(self):
        self.top = None
    
    # creating a new node, making the new nodes next to element before it and then pointing top to new node 
    def push(self, data):
        new_node = Node(data)
        new_node.next = self.top
        self.top = new_node
        print("Pushed ", data, "onto Stack")
    
    # check id the stack is empty if not return the topmost element and return the data 
    # then point the top to next(below) element
    def pop(self):
        if self.top is None:
            return None
        popped = self.top.data
        self.top = self.top.next
        return popped
        
a_stack = Stack()
while True:
    print('push 1')
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
