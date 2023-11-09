
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.root = Node(0)
        
    def push(self, data):
        temp = Node(data)
        if(not self.root.next):
            self.root.next = temp
        else:
            t = self.root.next
            while(t.next):
                t = t.next
            t.next = temp

    def pop(self):
        if(not self.root.next):
            return None
        prev = self.root
        curr = self.root.next
        while(curr.next):
            prev = curr
            curr = curr.next
        prev.next = None
        return curr.data
               
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
