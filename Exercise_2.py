#time complexity is O(n)
#space complexity is O(n)
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        newNode = Node(data)
        if self.head == None:
            self.head = newNode
            return
        currentNode = self.head
        while currentNode.next:
            currentNode = currentNode.next
        currentNode.next = newNode
        
    def pop(self):
        if self.head == None:
            return 
        currentNode = self.head
        if self.head.next is None:
            value = self.head.data
            self.head = None
            return value
        while currentNode.next.next:
            currentNode = currentNode.next
        value = currentNode.next.data
        currentNode.next = None
        return value
        
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
