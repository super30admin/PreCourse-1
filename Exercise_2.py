# Time Complexity : O(1) for push and pop
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : No exact match on LeetCode
# Any problem you faced while coding this : No

# Approach: The head of the linked list is the top of the stack.
# push creates a new node and links it in front of the current head,
# then makes it the new head. pop removes the head node and returns
# its data, making the next node the new head. Both only touch the
# head, so they are O(1) with no shifting or resizing.


# Exercise_2 : Implement Stack using Linked List.

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head=None
        
    def push(self, data):
        new_node= Node(data)
        new_node.next=self.head
        self.head=new_node
        
    def pop(self):
        if self.head is None:
            return None
        popped =self.head.data
        self.head=self.head.next
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


