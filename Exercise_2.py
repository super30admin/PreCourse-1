
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None
        self.height = 0
        
    def push(self, data):
        new_node = Node(data)
        if(self.height == 0):
            self.top = new_node
            self.height+=1
            self.top.next = None
        temp = self.top
        self.top = new_node
        self.top.next = temp
        self.height +=1
        print(self.top.data)

        
    def pop(self):
        if(self.height == 0):
            return None
        temp = self.top
        self.top = self.top.next
        temp.next = None
        self.height -=1
        return temp.data
        
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
