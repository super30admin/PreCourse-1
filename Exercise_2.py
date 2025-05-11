# Space: O(1)
# Push: O(1)
# Pop: O(1)
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None
        self.length = 0
    def push(self, data):
        n = Node(data)
        n.next = self.top
        self.top = n
        self.length += 1
        
    def pop(self):
        if self.top is None:
            return None
        t = self.top.data
        self.top = self.top.next
        
        return t
    
    def show(self):
        head = self.top
        while head is not None:
            print(head.data, end='->')
            head=head.next
        print("NULL")
        
        
a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('show list(s)')
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
    elif operation == 's':
        a_stack.show()
    elif operation == 'quit':
        break
