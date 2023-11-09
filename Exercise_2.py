class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.root = None

    #Time Complexity: O(1)
    def isEmpty(self):
        return self.root is None

    #Time Complexity: O(1)
    def push(self, data):
        #Create the new node
        newNode = Node(data)

        #Make the newNode our new root node
        newNode.next = self.root
        self.root = newNode

    #Time Complexity: O(1)
    def pop(self):
        # Nothing to pop on an empty linked list
        if self.isEmpty():
            return None
        
        #Save the root node to a temporary node
        #in order ot return it's value
        tmp = self.root

        #Move root to next node in linked list
        self.root = self.root.next

        return tmp.data

        
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
