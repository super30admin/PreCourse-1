#TC = O(1)
#SC = O(N)

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.root = None
    
    def isEmpty(self):
        return True if self.root is None else False
    
    def push(self, data):
        newNode = Node(data)
        newNode.next = self.root
        self.root = newNode
        print("% d added to stack" % (data)) 

    def pop(self):
        if (self.isEmpty()):
            print("Stack Underflow") 
            return 0 
        temp = self.root 
        self.root = self.root.next
        popped = temp.data 
        return popped
        
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
