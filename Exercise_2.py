# Time Complexity : O(1)
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        # Initailize with none
        self.head = None
        
    def push(self, data):
        #adding node to start of list
        if self.head is None:
            self.head = Node(data)
        else:
            new_ele = Node(data)
            new_ele.next = self.head
            self.head = new_ele
    def pop(self):
        # Pop the top element and make the next element the top
        if self.head is None:
            return None
        else:
            popped = self.head.data
            self.head = self.head.next
            return popped

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
