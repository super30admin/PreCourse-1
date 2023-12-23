# Time Complexity - using class Stack, to perform push operation or pop, it takes O(n) everytime as I'm iterating towards the end everytime
# Space Complexity - O(n) space required for the creation of stack using linkedlist. 

# Did this code successfully run on Leetcode : This run sucessfully on my vscode
# Any problem you faced while coding this : No, I did not face any problem while coding this
# Utilited the Node class, for the push, and pop operations, iterated towards the end to peform the operation of add a new node to the end of linkedlist or removing from the end of linked list.

# Time Complexity - using class newStack, to perform push operation or pop, it takes O(1) everytime as I'm iterating adding the new node to the start of the linked list and pointing its next to the head of curr list.
# for pop operation, I'm removing the first element and making head as head's next.
# Space Complexity - O(n) space required for the creation of stack using linkedlist. 

# Did this code successfully run on Leetcode : This run sucessfully on my vscode
# Any problem you faced while coding this : No, I did not face any problem while coding this
# Utilited the Node class, for the push, and pop operations, inserted and removed the node from the starting of linkedList.


class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.stack = Node(0)
        
    def push(self, data):
        nn = Node(data)
        head = self.stack
        while head.next is not None:
            head = head.next
        head.next = nn
        return

    def pop(self):
        head = self.stack
        prev = head
        if head.next is None:
            return None
        while head.next is not None:
            prev = head
            head = head.next
        prev.next = None
        return head.data

class newStack:
    def __init__(self):
        self.head = None
    
    def push(self, data):
        nn = Node(data)
        if self.head is None:
            self.head = nn
            return
        nn.next = self.head
        self.head = nn
        return
        
    def pop(self):
        if self.head is None:
            return None
        pop_node = self.head
        self.head = self.head.next
        return pop_node.data

a_stack = newStack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push 10')
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
