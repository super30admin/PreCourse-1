"""
Init class with head with null 
Push will add the node to the top of the list
Pop will point the pointer to the next node
Time complexity O(1)
Space O(n)
"""
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        temp = Node(data)
        temp.next = self.head
        self.head = temp
        
    def pop(self):
        if self.head == None:
            return None

        temp = self.head
        self.head = temp.next
        return temp.data
    
    def show(self):
        temp = self.head
        while temp:
            print(temp.data, end=" -> ")
            temp = temp.next
        print("None")
        
a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')
    print('print')
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
    elif operation == 'print':
        print(a_stack.show())
    elif operation == 'quit':
        break
