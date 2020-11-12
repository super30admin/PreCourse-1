class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        if self.head == None:
            self.head = data        
        else:
            temp = self.head
            while temp.next != None:
                temp = temp.next
            temp.next = data 
        print("New node has been inserted")
        
    def pop(self):
        if self.head == None:
            print("Stack is empty")
            return
        else:
            temp = self.head
            while temp.next.next != None:
                temp = temp.next
            temp.next = None
            print("Node has been popped from the Stack")
        
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
