#Time Complexity : O(n)
#Space Complexity : O(n)
#Did this code successfully run on Leetcode :
#Any problem you faced while coding this :
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        self.second_last = None
        self.last = None
    def push(self, data):
        if self.head is None:
            node = Node(data)
            self.head = node
            self.last = node
            self.second_last = node
        elif self.head == self.last:
            node = Node(data)
            self.last = node
            self.head.next = self.last
        else:
            node = Node(data)
            self.second_last = self.last
            self.last = node
            self.second_last.next = self.last
            
    def pop(self):
        if self.head.next is None:
            popped_value = self.head.data
            self.head = None
            return popped_value
        current_node = self.head
        if current_node == self.second_last:    #if there are only two elements in the stack
            popped_value = self.last.data
            self.head.next = None
            self.last = self.head
            self.second_last = self.head
            return popped_value
        while current_node.next != self.second_last:
            current_node = current_node.next
        popped_value = self.last.data
        self.second_last.next = None
        self.last = self.second_last
        self.second_last = current_node
        return popped_value
        
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
