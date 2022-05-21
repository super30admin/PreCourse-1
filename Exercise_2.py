# Time Complexity : O(1) Maintain a reference to top of stack lets us add and delete elements in constant time
# Space Complexity : O(N) where N is the number of elements in stack
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this : At first implemented ti as regular linked list but it was giving time complexity of O(n),
# as I was iterating over the list for each push and pop operation. This is when head node is maintained at the beginning of the list.
# Changed the implementation to point to the top of the stack so we don't have to iterate over the list and time complexity improves to O(1)

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        # Creating Node that points to the top of stack
        self.top = None
        
    def push(self, data):
        if not self.top:
            self.top = Node(data)
        else:    
            newNode = Node(data)
            newNode.next = self.top
            self.top = newNode
        
    def pop(self):
        if not self.top:
            return None
        else:
            popnode = self.top
            self.top = self.top.next
            popnode.next = None
            return popnode.data

        
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
