class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
 
class Stack:
    def __init__(self):
        self.head = Node(-1)
        self.prev = self.head
        self.curr = self.head
    # Time: O(1)  
    def push(self, data):
        temp = Node(data)
        self.curr.next = temp
        if self.prev != self.curr:
            self.prev = self.curr
        self.curr = temp
        
    # Time: O(1)    
    def pop(self):
        if self.curr == self.head:
            return None
        else:
            ret = self.curr.data
            self.prev.next = None
            self.curr = self.prev
            return ret
            
        
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
