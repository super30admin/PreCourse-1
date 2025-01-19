""" 
Exercise_2 : Implement Stack using Linked List.

# Time Complexity :
- push(): O(1) - inserting at head of linked list
- pop(): O(1) - removing from head of linked list
- Both operations are true O(1)

# Space Complexity :
- O(n) where n is the number of elements in the stack
- Each node requires extra space for next pointer compared to array implementation

# Did this code successfully run on Leetcode :
- Ran successfully on local machine with interactive input:

❯ python3 Exercise_2.py 
push <value>
pop
quit
What would you like to do? push 10
push <value>
pop
quit
What would you like to do? push 20
push <value>
pop
quit
What would you like to do? pop
Popped value:  20
push <value>
pop
quit
What would you like to do? pop
Popped value:  10
push <value>
pop
quit
What would you like to do? pop
Stack is empty.
push <value>
pop
quit
What would you like to do? quit

# Any problem you faced while coding this :
- No
"""

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        if self.head is None:
            self.head = Node(data)
        else:
            new_node = Node(data)
            new_node.next = self.head
            self.head = new_node
        
    def pop(self):
        if self.head is None:
            return None  
        else:
            popped = self.head
            self.head = self.head.next
            popped.next = None
            return popped.data

# Interactive test implementation
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