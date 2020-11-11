class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):   # time - O(n)
        if self.head is None:
            self.head = Node(data)
        else:
            temp = self.head 
            while temp.next is not None:
                temp = temp.next
            temp.next = Node(data)

    def pop(self):          # time - O(n)
        if self.head is None:
            return

        else:
            temp = second_last = self.head
            while temp.next is not None:
                second_last = temp
                temp = temp.next

            second_last.next = None
        return temp.data
                
        
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
