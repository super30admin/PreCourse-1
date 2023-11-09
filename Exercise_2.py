#Time Complexity-->O(1) for both push and pop operations.
#Space Complexity-->O(1) for both push and pop operations.
#yes the program has executed in leetcode
#stack using Linkedlist has a node which has data and address of the next node,creating link between nodes using push and pop operations 

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head=None
        
    def push(self, data):
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
        else:
            new_node.next = self.head
            self.head = new_node
        
    def pop(self):
        if self.head is None:
            return None
        else:
            popped_value = self.head.data
            self.head = self.head.next
            return popped_value
        
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
