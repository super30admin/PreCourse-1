""" 
Implement Stack using Linked List

Time Complexity:
push() - O(1)
pop() - O(1)

Space Complexity:
O(n) - where n is the number of elements in stack

Notes:

-> while working with stack, we use top as pointer variable.
-> check conditions related to top.
-> push() - add new node to the top
-> pop() - remove node (if available) from top
"""

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None
        
    def push(self, data):
        # create new node to push
        new_node = Node(data)

        # check if stack is empty
        if self.top is None:
            # assign new node to top
            self.top = new_node
            self.top.next = None

        else:
            # create a link betweem new_node and current top
            new_node.next = self.top
            # make new_node as top - so top is updated now
            self.top = new_node
        
    def pop(self):

        # Stack is empty
        if self.top is None:
            return

        # If stack has only one element
        elif self.top.next is None:
            popped_value = self.top.data
            # top becomes None
            self.top = None
            return popped_value
        # Stack has more than one element
        else:
            # create temp variable
            temp = self.top
            popped_value = self.top.data

            # update top
            self.top = temp.next

            # delete element
            temp = None
            return popped_value

    def display(self):
        # check if stack is empty
        if self.top is None:
            print("Stack is empty")
            return

        temp = self.top
        print("Stack elements:")
        while temp:
            print(temp.data)
            temp = temp.next
        return
        
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
    elif operation == 'display':
            a_stack.display()