'''
===== Submission Details ======
Student Name: Pavan Kumar K. N.
Email       : pavan1011@gmail.com
S30 SlackID : RN32MAY2021
=================================
'''
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.root = None
        
    def push(self, data):
        pushedNode = Node(data)
        pushedNode.next = self.root
        self.root = pushedNode
        print("Pushed {0} to stack.".format(data))
        
    def pop(self):
        if(self.root == None):
            print("Stack Underflow! Cannot pop from stack")
            return 0
        else:
            poppedElement = self.root.data
            self.root = self.root.next
            return poppedElement
        
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
