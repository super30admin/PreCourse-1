
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.node = None
        
    def push(self, data):
        if self.node:
            flag = True
            last_node = self.node
            while(flag):
                if not last_node.next:
                    last_node.next = Node(data)
                    flag = False 
                else:
                    last_node = last_node.next
        else:
            self.node = Node(data)
        print('Data is added %s'%data)
        
    def pop(self):
        popped_val = None
        if self.node:
            flag = True
            last_node = self.node
            while(flag):
                if not last_node.next:
                    popped_val = last_node.data
                    self.node = None
                    flag = False 
                elif not last_node.next.next:
                    popped_val = last_node.next.data
                    last_node.next = None
                    flag = False 
                else:
                    last_node = last_node.next
        return popped_val
        
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
