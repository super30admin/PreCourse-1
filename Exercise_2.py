#Time Complexity: 
# push: O(1)
# pop: O(1)
# peek: O(1)
# isEmpty(): O(1)
# size: O(1)
# show: O(n)
#Space Complexity: for all operations O(n) where n is the number of elements
#Yes the code ran on Leetcode

class Node:
    """Node class for Linked List"""
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        """Initialize an empty stack using a linked list"""
        self.head = None
        self._size = 0
        
    def push(self, data):
        """Insert a new element on top of stack using linked list"""
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node
        self._size +=1
        
    def pop(self):
        """Return the popped element from stack and return none if its empty"""
        if self._size==0:
            return None
        popped = self.head.data
        self.head = self.head.next
        self._size -= 1
        return popped
        
        
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
