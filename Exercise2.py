'''
Time complexity 
push --> O(1)
pop --> O(n) since need to loop throght the second last node and make this as tail

Space Complexity 
O(n) for linkedList
'''


class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        self.tail = None
        
    def push(self, data):
        newNode = Node(data)
        if self.head == None:
            
            self.head = newNode
            self.tail = newNode
        else:
            self.tail.next = newNode
            self.tail = newNode
            
            


        
    def pop(self):
        if self.head == None:
            return None
        if self.head == self.tail:
            v = self.head.data
            self.head = None
            self.tail = None
            return v
        curr = self.head
        print(curr.data)
        while curr.next!=self.tail:
            curr = curr.next
        v = self.tail.data
        curr.next = None
        self.tail = curr
        return v
            
            
        
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