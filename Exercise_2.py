'''
Time Complexity: 
Push: O(1)
Pop: O(1)

Space Complexity:
O(n)
'''


class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        item = Node(data)
        item.next = self.head
        self.head = item
        

        
    def pop(self):
        if self.head is None:
            print("Attempting to pop from empty stack")
            return
        item = self.head
        self.head = self.head.next
        item.next = None
        return item.data
        
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
