
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
       self.head = None #Initialize the head pointer to None
    def push(self, data):
        if self.head == None:
            self.head = Node(self,data) #If head pointer is not pointing to any other node then create a New Node
        else:
            newNode = Node(self,data)
            newNode.next = self.head
            self.head = newNode

    def pop(self):
       if self.head == None:
            return None
       else:
           node = self.head
           self.head = self.head.next
           node.next = None
           return node.data

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
