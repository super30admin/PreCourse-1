
# Time Complexity : O(1) for push and pop
# Space Complexity : O(n) where n is number of elements in the stack
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : No issues


class Node:
    def __init__(self, data):
        # storing the value and a link to the next node
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        # head points to the top of the stack
        self.head = None
        
    def push(self, data):
        # making a new node
        new_node = Node(data)
        # linking it to the old head
        new_node.next = self.head
        # updating head to the new node
        self.head = new_node 


    def pop(self):
        # if there’s nothing to pop, return None
        if self.head is None:
            return None
        # grab the top node’s data
        popped_val = self.head.data
        # move head down one node
        self.head = self.head.next
         # return what we stored
        return popped_val

if __name__ == "__main__":        
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
