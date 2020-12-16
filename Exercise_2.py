class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None
        self.head = None
        
    def push(self, data):
        new_top = Node(data)
        if not self.top:
            self.top = new_top
            self.head = self.top
            return
        self.top.next = new_top
        self.top = new_top
    #runtime complexity O(1) 
        
    def pop(self):
        if not self.top:
            return None
        if not self.head.next:
            res = self.top.data
            self.top = None
            self.head = None
            return res

        ptr = self.head
        lag_ptr = self.head
        while ptr.next:
            lag_ptr = ptr
            ptr = ptr.next  
        self.top = lag_ptr
        lag_ptr.next = None
        return ptr.data
    #runtime complexity O(n) 


        
a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
    try:
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
    except:
        print("Enter the complete command")
    
