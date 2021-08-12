
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
    
    def __str__(self):
        return "Node data: {}, node next: {}".format(self.data, self.next)
 
class Stack:
    def __init__(self):
        self.head = None
        self.top = 0
        Node(None)
        self.max = 100
    
    def isFull(self):
        if self.top == self.max:
            return True
        return False
    
    def isEmpty(self):
        if self.top == 0:
            return True
        return False

    def push(self, data):

        if self.isFull():
            return "Stack Overflow"
        
        data = Node(data)
        if self.head == None:
            self.head = data
        
        else:
            data.next = self.head
            self.head = data
        
        self.top += 1

    def pop(self):
        # Check is stack is not empty
        if self.isEmpty():
            return None

        popped_element = None
        if self.head == None:
            return None
        popped_element = self.head.data
        self.head = self.head.next
        self.top -= 1

        return popped_element
        
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

