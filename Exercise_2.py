# Time Complexity : O(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Ran it on VS code
# Any problem you faced while coding this : No

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.head = None

    def push(self, data):
        new_node = Node(data)
        # if there is no elements in the stack
        # mark the new_node as head and next as none
        if not self.head:
            self.head = new_node
        # make the new node as the head
        else:
            new_node.next = self.head
            self.head = new_node
        return True

    def pop(self):
        # if there are no elements to pop
        if not self.head:
            return None
        # remove the head , make head.next as new head
        # return
        pop_node = self.head
        val = pop_node.data
        self.head = self.head.next
        del(pop_node)
        return val


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
