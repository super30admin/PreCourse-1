#  Time Complexity :
#  - push() = > O(n) as need to traverse to end of the list and append a Node.
#  - pop() = > O(n) as need to traverse to end of the list and remove the last None.
#  Space Complexity : O(n) to store all the Nodes in a Linked List.
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        if(self.head):
            current = self.head
            # Iterate till end of the Linked List and create a new Node to insert.
            while(current.next!= None):
                current = current.next
            current.next = Node(data)
        else:
            self.head = Node(data) # make head point to the new data node created.
        
    def pop(self):
        if(self.head == None):
            return None # return None if no nodes present in Linked List.
        if(self.head.next == None): # when only one node is present in Linked List.
            data = self.head.data
            self.head = None
            return data
        current = self.head
        previous = current
        while(current.next != None): # Current and previous points to the current node and previous nodes respectively. when current.next is None, remove the current element.
            previous = current
            current = current.next
        previous.next = None
        return current.data
        
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
