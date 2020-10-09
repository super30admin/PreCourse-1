#Time Complexity : O(1)
#Space Complexity : O(n)
#Did this code successfully run on Leetcode : No, I did not run it on leetcode
#Any problem you faced while coding this : I am not sure on the complexity particularly space complexity


#Your code here along with comments explaining your approach
class Node:
    #Each node in a single linked list
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def isempty(self):
        #checking weather head is None or not
        # head == None implies that the linked list is empty
        return self.head == None
    
    def push(self, data):             
        # we add the node at the start of the linkedlist and make it self.head
        new_node = Node(data) 
        new_node.next = self.head 
        self.head = new_node
        
    
    def pop(self):
        # if linked list is empty we return None
        if self.isempty():
            return None
        
        #else we traverse through the list and remove the first node from linked list and return that node 
        else:
            pop_node = self.head 
            self.head = self.head.next
            pop_node.next = None
            return pop_node.data
        
        
a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
 
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
