class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head=None

    def isEmpty(self):
        return self.head==None

    def push(self, data):
        if self.head==None:
            list_node=Node(data)
            self.head=list_node
        else:
            New_node=Node(data)
            New_node.next=self.head
            self.head=New_node

    def pop(self):
        if self.isEmpty():
            return None
        return_node=self.head
        self.head=self.head.next
        return_node.next=None
        return return_node.data
        
        
        
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
