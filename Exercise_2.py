"""
  # Time Complexity : O(1) 
  # Space Complexity : O(n) as we have declare the Linked List for the n elements for the stack

  # Your code here along with comments explaining your approach
  We have two approaches here to perform push and pop :
    1. push and pop the data from tail end of the Linked List
    2. push and pop the data from the start of the Linked List

    Time complexity for the option 1 is O(n) for both push and pop operation as we need to traverse through the complete Linked List. But the time complexity for the 2nd approach is O(1) as we can push and pop the Last In data from the head/top pointer.
"""
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.__top = None
        
    def push(self, data):
        newNode = Node(data)
        newNode.next = self.__top
        self.__top = newNode

    def pop(self):
        temp = self.__top.next
        self.__top = temp
        temp = None
    
    def display(self):
        temp = self.__top
        while temp:
            print(temp.data)
            temp = temp.next

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

a_stack.display()
