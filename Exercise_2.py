# Time Complexity :
# push = O(1)
# pop = O(1)

# Space Complexity : O(n)

# Any problem you faced while coding this:
# Initially, I implemented the push operation by adding elements at the end of the linked list. While writing
# time complexity, I realized that the time complexity of the push operation is O(n) because I was
#  adding elements at the end. Then I implemented the push operation by adding elements 
# at the beginning of the linked list. 

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
    
    def push(self, data):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node
        
    def pop(self):
        if self.head is None:
            return None
        else:
            last_data = self.head.data
            self.head = self.head.next
            return last_data
        
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
