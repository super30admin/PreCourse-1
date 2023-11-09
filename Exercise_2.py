"""
Time Complexity : O(1) for all methods(push, pop)
o(n) for display function

Space Complexity : O(n)

Did this code successfully run on Leetcode : N/A

Any problem you faced while coding this : No
"""
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        #creating stack
        self.top = None

    def push(self, data):
        '''
        create a temp node with data= new_data and next pointer pointing none.
        kept top of stack at head instead keeping at end because
        at head time complexity will be O(1) abd at end it will be O(n)
        '''
        temp_node = Node(data)
        if self.top == None:
            self.top = temp_node
            # self.top.data = data
            # self.top.next = None
        else:
            # temp_node.data = data
            temp_node.next = self.top
            self.top = temp_node

    def pop(self):
        '''
        assigning next pointer of top to next node of top.
        and returning data from old top.(temp_node was used for this)
        '''
        # data = None
        # temp_node = Node()
        if self.top == None:
            return None
        else:
            temp_node = self.top
            self.top = self.top.next
            temp_node.next = None
            return temp_node.data

    def display(self):
      self.t = self.top
      while self.t != None:
        print(self.t.data, "->", end=" ")
        self.t = self.t.next


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
    elif operation == 'dis':
        a_stack.display()
    elif operation == 'quit':
        break
