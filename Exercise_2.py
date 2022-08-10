
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def isempty(self):
        if self.head == None:
            return True
        else:
            return False
        
    def push(self, data):
        if self.head == None:
            self.head=Node(data)
              
        else:
            newnode = Node(data)
            newnode.next = self.head
            self.head = newnode
            
    def pop(self):
        if self.isempty():
            return None        
        else:
            poppednode = self.head
            self.head = self.head.next
            poppednode.next = None
            return poppednode.data
        
    def display(self):
        iternode = self.head
        if self.isempty():
            print("Stack Underflow")
        else:
            while(iternode != None): 
                print(iternode.data,"->",end = " ")
                iternode = iternode.next
            return
        
a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')
    print('display')
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
    elif operation == 'display':
        if a_stack.head == None:
            print('Stack is Empty')
        else:
            print('Present Stack is: ', a_stack)
    elif operation == 'quit':
        break
