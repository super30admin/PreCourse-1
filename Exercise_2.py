
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        """
        Initializes an empty stack
        Time Complexity: O(1)
        Space Complexity : O(1)
        """
        self.head = None

    def isEmpty(self):
        """
        Checks whether stack is empty or not
        Time Complexity: O(1)
        Space Complexity : O(1)
        """
        return self.head is None
        
    def push(self, data):
        """
        Adding new element to the stack
        Time Complexity: O(1)
        Space Complexity : O(1)
        After creating a new node,we point new node next to the current head and we point the head to the new node
        """
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node
        
    def pop(self):
        """
        If stack is empty, we return none else we point the head pointer to the next node
        Time Complexity: O(1)
        Space Complexity : O(1)
        """
        if self.isEmpty():
            return None
        #in python garbage collection, objects without reference will be deleted automatically
        popped_data =  self.head.data
        self.head = self.head.next
        return popped_data
    
    def peek(self):
        """
        If stack is empty we return none else we return top element value
        Time Complexity: O(1)
        Space Complexity : O(1)
        """
        if self.isEmpty():
            return None
        return self.head.data
    
    def show(self):
        """
        We traverse the entire linkedlist and prints the elements
        Time Complexity: O(N)
        Space Complexity : O(N)
        """
        elements = []
        current = self.head
        while current:
            elements.append(current.data)
            current = current.next
        return elements
        
        
a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('peek')
    print('empty')
    print('show')
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
    elif operation == 'empty':
        if a_stack.isEmpty():
            print('Stack is empty.')
        else:
            print('Stack is not empty.')
    elif operation == 'peek':
        top = a_stack.peek()
        if top is None:
            print('Stack is empty.')
        else:
            print('Top value:', top)
    elif operation == 'show':
        print('Stack elements:', a_stack.show())
    elif operation == 'quit':
        break
    else:
        print("Invalid Command")
