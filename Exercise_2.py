# Time and space complexity is O(1)
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
class LinkedList:
    def __init__(self):
        self.head = None
class Stack:
    def __init__(self):
        self.LinkedList = LinkedList()
    
    def isEmpty(self):
        if self.LinkedList.head == None:
            return True
        else:
            return False
        
    def push(self, data):
        node = Node(data)
        node.next = self.LinkedList.head
        self.LinkedList.head = node
            
    def pop(self):
        if self.isEmpty():
            return "The Linked list stack is empty"
        else:
            node = self.LinkedList.head.data
            self.LinkedList.head = self.LinkedList.head.next
            return node
        
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
