""""// Time Complexity : -
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach"""


class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.root = None

    def push(self, data):
        newNode = Node(data)
        #attaching the new node at first
        newNode.next = self.root
        self.root = newNode
        print("% d pushed to stack" % (data))

    def isEmpty(self):
        return True if self.root is None else False

    def pop(self):
        if (self.isEmpty()): #Deleting the last node
            return float("-inf")
        temp = self.root
        self.root = self.root.next
        popped = temp.data
        return popped


a_stack = Stack()
while True:
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')
    do = input().split()
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