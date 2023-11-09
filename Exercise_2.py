## push() TC: O(1) SC:O(1)
## isempty() TC: O(1) SC:O(1)
## pop() TC: O(1) SC:O(1)

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None

    # To insert element into the stack    
    def push(self, data):
        if self.head == None:
            self.head = Node(data)
        else:
            nwnode = Node(data)
            nwnode.next = self.head
            self.head = nwnode

    # Checks if the stack is empty
    def isempty(self):
        if self.head == None:
            return True
        else:
            return False
    # To remove element from the stack
    def pop(self):
        if self.isempty():
            return None
        else:
            # Removes the head node and makes the preceding node the new head
            popnd = self.head
            self.head = self.head.next
            popnd.next = None
            return popnd.data   
        
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
