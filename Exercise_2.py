# Exercise_2 : Implement Stack using Linked List
# Time Complexity: O(1)
# Space Complexity: O(N), N = number of nodes
# Successful Run on Leetcode: N/A
# Challenges: None

class Node:
    def __init__(self, data):
       self.data = data # value of the node
       self.next = None # pointer to the next node
 
class Stack:
    def __init__(self):
        # initialize the head to None, empty stack/start of stack
        self.head = None
        
    def push(self, data):
        # if the head is None, set the data node as the head
        if not self.head:
            self.head = Node(data)
        # else intialize a new node and link it to the head of the stack, and set the new head to be the new node
        else:
            newNode = Node(data)
            newNode.next = self.head
            self.head = newNode
            
        
    def pop(self):
        # if the head is None, there is no node to pop from the linked list
        if not self.head:
            return None
        # else, pop the value of the head and assign the next node as the head
        else:
            val = self.head.data
            self.head = self.head.next
            return val
        
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
