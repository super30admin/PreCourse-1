# Time Complexity: Push: O(1) and pop:O(n)
# Space Complexity: O(n) where n is the total number of elements pushed into the stack

class Node:
    def __init__(self, data, next:'Node'=None):
       self.data = data
       self.next = next
 
class Stack:
    def __init__(self):
        #Creating a dummy node
        self.head = Node(-1)
        self.lastNode = self.head
        
    def push(self, data):
        self.lastNode.next = Node(data)
        self.lastNode = self.lastNode.next
        
    def pop(self):
        pointer = self.head
        while pointer and pointer.next != self.lastNode:
            pointer = pointer.next
        if pointer != None:
            pointer.next = self.lastNode.next
            node = self.lastNode
            self.lastNode = pointer
            return node.data
        return None
    
    #Added this function to help test inputs
    def printList(self):
        """
        Print all elements
        Takes O(n) time.
        """
        print_pointer = self.head.next
        while print_pointer:
            print(print_pointer.data)
            print_pointer = print_pointer.next
        print("*************")
        
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