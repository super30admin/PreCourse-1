class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        # check if empty
        new_node = Node(data)
        if self.head == None:
            self.head = new_node
            print("Pushed ", self.head.data)
        else:
            new_node.next = self.head
            self.head = new_node
            print("Pushed ", self.head.data)

    def pop(self):
        if self.head == None:
            # Stack underflow
            return None
        else:
            pop_node = self.head
            self.head = self.head.next
            return pop_node.data
        
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
        popped_node = a_stack.pop()
        if popped_node is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped_node))
    elif operation == 'quit':
        break
