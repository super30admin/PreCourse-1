# Time Complexity : Basically stack is all about pushing items one above 
# the other. Using linked list we can push or pop an item or data in O(1)
# Space Complexity : O(n)

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None
        
    def push(self, data):
        newNode = Node(data)     #create a new node and update the address/reference
        newNode.next = self.top  
        self.top = newNode        
    
    def is_empty(self):
        return self.top is None

    def pop(self):
        if self.is_empty :
            print("Stack is empty")
        data = self.top.data
        self.top = self.top.next
        return data

        
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

