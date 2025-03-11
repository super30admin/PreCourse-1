# Time Complexity : O(1) for push as well as pop
# Space Complexity : O(n) where n is no of elements in the stack.
# Did this code successfully run on Leetcode : On Online GDB yes
# Any problem you faced while coding this : 

# Your code here along with comments explaining your approach


class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top=None  #top variable points to the top of the node
        self._size=0   # _size is created to keep track of how many numbers are added. 
        
    def push(self, data):
        new_node = Node(data) # new node is created
        new_node.next = self.top # the next pointer is set to the current top 
        self.top = new_node # top is updated to point to this new node
        self._size += 1 # _size variable is incremented by one to keep count

        
    def pop(self):
        if self.top is None:
            return None
        popped = self.top.data
        self.top = self.top.next
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
