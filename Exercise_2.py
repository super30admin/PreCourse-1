class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.a= None #a is head of the linked list
        
    def push(self, data):
        if self.a == None:
            self.a = Node(data)
        else:
            newnode = Node(data)
            newnode.next= self.a
            self.a = newnode
    def pop(self):
        if self.a == None:
            return None
        else:
            pop_elem=self.a
            self.a =pop_elem.next
            pop_elem.next =None
            return pop_elem.data
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
        print(a_stack.a.data)
        break
