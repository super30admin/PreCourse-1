
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None        
 
class Stack:
    def __init__(self):
        self.ll = None
        self.count = 0
    
    def __repr__(self):
        while self.ll:
            print(self.ll.data)
        pass

    def push(self, data):
        if self.ll is None:
            self.ll = Node(data)
            self.count += 1
            return data
        new_node = Node(data)
        new_node.next = self.ll
        self.ll = new_node
        self.count += 1

    def pop(self):
        print(self.ll)
        if self.ll is None:
            return None
        popped_value = self.ll.data
        self.ll = self.ll.next
        self.count -= 1

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
        print(a_stack.count)
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'quit':
        break
