# Time Complexity :O(1) for all the methods 
# Space Complexity : O(N) for the worst case where N is the size of the linkedlist 
# Did this code successfully run on Leetcode : I tried in VS code 
# Any problem you faced while coding this :No


# Your code here along with comments explaining your approach
# In __init__ method I am intializing the head as none for the linkedlist
# In push I am adding the element to the top of the stack by using a new_head which will point to the current head
# In pop I am first checking if the stack is empty or not if not then removing the element from the top of the stack
# In peek I am checking if the stack is empty or not if not then removing the element at the top of the stack
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None

    def push(self, data):
        new_head = Node(data)
        new_head.next = self.head
        self.head = new_head
    def pop(self):
        if self.head is None:
            return None
        pop_head = self.head
        self.head = self.head.next
        return pop_head.data
        
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