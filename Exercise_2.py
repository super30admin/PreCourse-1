class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack: #this is the class inside the class Node
    def __init__(self):
        self.head = Node('node')
        self.size = 0
    
    def isEmpty():
        if self.size==0:
            return False

    def push(self, data):
        n1 = Node(data)
        n1.next = self.head.next
        self.head.next=n1
        self.size =+ 1
        
    def pop(self):
        if not isEmpty:
            self.head.next=self.head.next.next
            self.size -= 1
        else:
            print("Stack is empty")


        
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
