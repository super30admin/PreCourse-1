
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:

    def __init__(self):
        self.root = None
        self.lastNode = None
        
    def push(self, data):

        newNode =  Node(data)
        if self.root == None:
            self.root = newNode
            self.lastNode = newNode
        else:
            self.lastNode.next = newNode
            self.lastNode = newNode
        
    def pop(self):
        if self.root == None:
            print("Stack underflow")
            return 0
        if self.root.next==None:
            dataNew = self.lastNode.data
            self.root = None
            self.lastNode = self.root
            return dataNew
        temp = self.root
        while temp.next.next!=None:
            temp = temp.next
        
        dataNew = temp.next.data
        self.lastNode = temp
        self.lastNode.next=None
        return dataNew


        
         

        
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
