class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.size = 0
        self.top = None

    def isEmpty(self):
        return self.size==0

    def push(self, data):
        if(self.size==0):
            self.top = Node(data)
        else:
            newNode = Node(data)
            newNode.next = self.top
            self.top = newNode
        self.size += 1    

    def pop(self):
        if(self.size==0):
            return None
        else:
            item = self.top
            self.top = self.top.next
            self.size -= 1    
        return item.data

    def peek(self):
        if(self.size):
            return self.top.data
        else:
            return None

    def show(self):
        cur_node = self.top
        while(cur_node and cur_node.next):
            print(cur_node.data)                

a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
 
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
