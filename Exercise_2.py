
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = Node(-1)
        self.top = self.head
    
    def push(self, data):
        newNode = Node(data)
        self.top.next = newNode
        self.top = newNode
    
    def pop(self):
        if not self.head.next:
            return None
        
        curr = self.head.next
        prev = self.head

        while curr:
            prev = curr
            curr = curr.next

        prev.next = None
        return curr.data

    def show(self):
        curr = self.head.next
        values = []
        while curr:
            values.append(curr.data)
            curr = curr.next

        print(values)
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
