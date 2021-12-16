
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
    
    #we need this while popping
    def empty(self):
        if self.head == None:
            return True
        return False
        
    def push(self, data):
        if self.head is None:
            self.head = Node(data)
        else:
            Newnode = Node(data)
            Newnode.next = self.head
            self.head = Newnode
        
    def pop(self):
        if self.empty():
            return
        else:
        #happens only on the top of the stack so remove item at the end of the linked list
            poppedItem = self.head
            self.head = self.head.next
            poppedItem.next = None
            return poppedItem.data

        
a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
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
