
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        # Initialising the head of linked list
        self.head =None
        
    def push(self, data):
        # Adding new element to linkedlist and updating the head of linkedlist
        newNode = Node(data)
        newNode.next = self.head
        self.head = newNode
        
    def isEmpty(self):
        # Checks if head of linkedlist is None or not
        return self.head == None
    
    def pop(self):
        # Removes and returns top element of linked list and updates the head
        if self.isEmpty():
            print("empty list")
            return None
        else:
            temp = self.head
            self.head = self.head.next
            return temp.data
        
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

# Time Complexity: O(1) for all the operations
# Space Complexity : O(n), where n is size of stack