# Time Complexity is O(1)
# Space Complexity is O(n)
class Node:
    def __init__(self, data=None):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = Node()
        
    def push(self, data):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node

    def pop(self):
        if self.head != None:
            top_value = self.head.data
            self.head = self.head.next
            return top_value
        return None
    
    def peek(self):
        return self.head.data if self.head != None else 0 

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
