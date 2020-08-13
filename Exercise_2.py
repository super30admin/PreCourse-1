class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.res = None
        
    def push(self, data):
        if self.res is None:
            self.res = Node(data)
        else:
            new_res = Node(data)
            new_res.next = self.res
            self.res = new_res

            # 3->4->5->None = original list
            # 55->None = new node
            # 55->3->4->5->None = appended to the front

    def pop(self):
        if self.res:
            val = self.res
            self.res = self.res.next
            val.next = None
            return val.data
        return None

    
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
