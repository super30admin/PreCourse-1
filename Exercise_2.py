#Time Complexity: O(1)
#Space Complexity: O(n), where n is the number of nodes or elements

class Node:
    def __init__(self, data): 
       self.data = data #Data will hold the value of the element
       self.next = None #Next will have the link to the next node
 
class Stack:
    def __init__(self):
        self.head = None #Depicts start of the linked list stack
        
    def push(self, data):
        if self.head == None: #If the stack is empty, make this node the head
            self.head = Node(data)
        else:
            node = Node(data) #Instantiate the node
            node.next = self.head #Link the instantiated node to the head
            self.head = node #The instantiated node will be the new head, because it is last in first out data structure
        
    def pop(self):
        if self.head == None: #Check whether or not the stack is empty
            return None
        else:
            deletedItem = self.head.data #Delete data from the head, because LIFO
            self.head = self.head.next #Node which was previously second will now be the new head
            return deletedItem
        
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
