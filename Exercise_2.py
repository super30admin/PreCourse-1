class Node:
    def __init__(self, data):
       self.data = data
       self.next = None

class Stack:
    def __init__(self):
        self.head = None
    def push(self, data):
        # Update head to point to the first Node in the Linked List
        if self.head is None:
            self.head = Node(data)
        # Append the node to the beginning of the list [Time Complexity:  O(1)]  
        else:
            temp = Node(data)
            temp.next = self.head
            self.head = temp
        
    def pop(self):
        # Return None when the stack is empty
        if self.head is None:
            return None
        # Return the value of node that is on top of the stack i.e head, and then update the head   [Time complexity: O(1)] 
        self.poppedValue = self.head.data
        self.head = self.head.next
        return self.poppedValue    
        
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
