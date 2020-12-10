#Exercise_2 : Implement Stack using Linked List.
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None 
        
    def push(self, data):  #[] -> [1] -> [1 <- 2]
        if not self.head:
            self.head = Node(data)
        else: 
            node = Node(data)
            node.next = self.head
            self.head = node 
            
    def pop(self):
        if not self.head:
            return None 
        else:                   #[1 <- 2]
            curr = self.head 
            self.head = self.head.next 
            curr.next = None 
        return curr.data 
        
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
