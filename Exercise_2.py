class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.list1 = None
        
    def push(self, data):
        #push an element to the stack  : O(1)
        if self.list1 == None:
            self.list1 = Node(data)
        else:
            temp_node = Node(data)
            temp_node.next = self.list1
            self.list1 = temp_node
        
    def pop(self):
        #pop top from stack : O(1)
        if self.list1 == None:
            return None
        value = self.list1.data
        self.list1 = self.list1.next
        return value
        
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
