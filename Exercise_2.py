# Exercise_2 : Implement Stack using Linked List.

# time and space complexity will be O(1) because we are pushing and popping from the front of the list (head) so we
# don't need to traverse the list
# Time Complexity : O(1). Space Complexity : O(1).
# Did this code successfully run on Leetcode : could not find the question on Leetcode
# Any problem you faced while coding this : N/A


class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        # initialize head to be none
        self.head = None

    def push(self, data):
        # if head is pointing to none/null, there isn't a list yet. So create a node with the passed data
        # and point head to it
        if self.head is None:
            self.head = Node(data)
        # else if head is not none, there is at least one node.  So create a new node in front of the existing node
        # and point head to this new node. This is the TOS.
        else:
            new = Node(data)
            new.next = self.head
            self.head = new

    def pop(self):
        # if head is pointing to none/null, there is no list yet. Return null/none
        if self.head is None:
            return None
        # else: save the addr of head in temp variable and move head one node ahead.
        # return popped node data using temp var
        temp = self.head
        self.head = self.head.next
        return temp.data


a_stack = Stack()
while True:
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    # print('push <value>')
    # print('pop')
    # print('quit')
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
