
#Time Complexity: O(n)
#Space Complexity: O(n)
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
        
    def push(self, data):
        new_node = Node(data)
        new_node.next = self.LinkedList.head
        self.LinkedList.head = new_node
        print("The element has been successfully inserted")
        
    def pop(self):
        if self.LinkedList.head is None:
            return None
        else:
            popped = self.LinkedList.head.data
            self.LinkedList.head = self.LinkedList.head.next
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
        # if len(do) < 2:
        #     print('Please enter a number to push.')
        # else:
            
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'quit':
        break
