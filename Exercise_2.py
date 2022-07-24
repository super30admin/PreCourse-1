# Time Complexity : push -> O(1), pop -> O(1)
# Space Complexity : 0(n) where n is number of integers pushed (nodes added)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Minor bugs


class Node():
    def __init__(self, data):
        self.data = data
        self.next = None

class Stack():
    def __init__(self):
        # two reference nodes to track recently added node and the one preceding it
        self.curr=Node(None)
        self.prev=Node(None)
        
    def push(self, data):
        # curr node shifted to new node and prev becomes curr
        new_node=Node(data)
        self.curr.next=new_node
        self.prev=self.curr
        self.curr=self.curr.next
        
    def pop(self):
        # we use prev's next reference here to delete (pop) the last added node
        if not self.prev.next:
            return None
        val=self.prev.next.data
        self.prev.next=None
        return val
        
        

a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
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
