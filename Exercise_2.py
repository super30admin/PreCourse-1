#  Time Complexity : O(1)
#  Space Complexity : O(n)

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None

        
    def is_empty(self):
        if self.head == None:
            return True
        else:
            return False
    def push(self, data):
        if self.head == None:
            self.head = Node(data=data)
        else:
            new_node = Node(data=data)
            new_node.next = self.head
            self.head = new_node
        
        
    def pop(self):
        if self.is_empty():
            return None
        else:
            item_popped = self.head
            self.head = self.head.next
            item_popped.next = None
            return item_popped.data
            
        

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
