# Exercise_2 : Implement Stack using Linked List.
# // Time Complexity : push = O(1), pop = O(1)
# // Space Complexity : O(n), n-> number of elements in stack
# // Did this code successfully run on Leetcode : No
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.head = None

    def push(self, data):
        # creating a new node with provided data
        new_node = Node(data)
        # check if stack is empty
        if not self.head:
            # if empty then set the new_node as head
            self.head = new_node
        # Otherwise
        else:
            # make the new node the new head
            new_node.next = self.head
            # point it to the previous head
            self.head = self.head.next

    def pop(self):
        # check if stack is empty
        if not self.head:
            # return None if empty
            return None
        # saving the data of current head into popped_data
        popped_data = self.head.data
        # updating head, effectively removing the current head
        self.head = self.head.next
        # return popped node
        return popped_data


a_stack = Stack()
while True:
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
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
