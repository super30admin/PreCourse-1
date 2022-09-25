
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None #since 1st we initialize head to none
        
    def push(self, data):
        if self.head == None: #ie if the LL is blank then this we become the 1st elem
            self.head=Node(data)
            return

        itr = self.head
        while itr.next: #push to the end of list
            itr= itr.next

        itr.next = Node(data)
    
    def pop(self):
        if self.head is None: #ie if the LL is blank then this we become the 1st elem
            return None

        itr = self.head
    
        while itr.next:
            if itr.next.next == None: #we have reached 2nd last element
                pop = itr.next.data
                itr.next = None
                return pop
            itr = itr.next
        
        pop=itr.data
        self.head=None
        return pop
        
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