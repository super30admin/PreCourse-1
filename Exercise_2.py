# Any problem you faced while coding this : No
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None

    def isEmpty(self):
        # Return true is the list is empty
        # Time Complexity: O(1)
        if self.head == None:
            return True
        else:
            return False

    def push(self, data):
        # If the head is None - make the first inserted node head
        # Insert elements in the beginning of the list
        # Time & Space Complexity: O(1)
        if self.head == None:
            self.head = Node(data)
        else:
            newNode = Node(data)
            newNode.next = self.head
            self.head = newNode

    def pop(self):
        # Remove element from the start of the list
        # Time Complexity: O(1)
        if self.isEmpty():
            return None
        else:
            lastNode = self.head
            self.head = self.head.next
            lastNode.next = None
            return lastNode.data
        
a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    operation = do[0].strip().lower()
    # print(operation)
    if operation == 'push':
        a_stack.push(int(do[1]))
    elif operation == 'pop':
        # print("inside pop")
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'quit':
        break