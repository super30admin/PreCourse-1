#Time-Complexity: O(n)
#Space-Complexity: O(n)

class Node:
    def __init__(self, data):   
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):   
        self.head = None
        self.count = 0

    def push(self, data):
        node = Node(data)
        current=self.head
        if self.head==None:
            self.head = node
        
        else:
            while current.next!=None:   
                current=current.next   
            current.next=node
            
    def pop(self):
        if self.head is None:           
            return None
              
        else:
            current = self.head
            previous = None
            while current.next!=None:   
                previous = current
                current = current.next

            if previous is None:
                return None
            
            previous.next=current.next   
            return current.data
    
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
