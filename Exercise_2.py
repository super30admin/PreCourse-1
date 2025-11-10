#TC o(1) for push pop elements
#SC o(n) for storing all the elements pushed
#



class Node:
    def __init__(self, data):
       self.data = data
       self.next = None 
 
class Stack:
    def __init__(self):
        self.top = None #set top to none initially

        
    def push(self, data):
        newNode = Node(data) #create a new node that will tka ein your val
        newNode.next = self.top #assing the next of this new node as top val (for easy popping)
        self.top = newNode  #the new top is the latest node added
         
    def pop(self):
        if self.top is None:
            return None #if already empty, then return none
        poppedval = self.top.data #create a variable to store popped val
        self.top = self.top.next #shift the top to next of the current top element
        return poppedval
        

        
a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give inppoppoput like "push 10" or "pop"
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
