"""
Time Complexity : O(1) for all operations 
Space Complexity : O(n)
Did this code successfully run on Leetcode : could not find it on leetcode
Any problem you faced while coding this : No


Your code here along with comments explaining your approach

"""
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        self._size = 0

    def is_empty(self):
        """
        returns a boolean, checks if the stack is empty or not
        """
        return self._size == 0
    
    def push(self, data):
        """
        Add an element to the  top of the stack. Starting of the linked list.
        """
        node = Node(data)
        node.next = self.head
        self.head = node
        self._size += 1
        
    def pop(self):
        """
        pop an element to the  top of the stack. Starting of the linked list.
        """
        if self.is_empty():
            print('Stack is empty')
            
        return_data = self.head.data
        self.head = self.head.next
        self._size -= 1
        
        return return_data

        
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
         