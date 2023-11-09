## Time Complexity : O(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode :

# Any problem you faced while coding this :


# Your code here along with comments explaining your approach 


#Node already defined
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
    #this fucntion to be used in pop fucntion    
    def isempty(self):
        #if list is empty
        if self.head == None:
            return True
        else:
            return False    
    def push(self, data):
        #if list is empty
        if self.head ==None:
            self.head = Node(data)
        else:
            #Start the head from new node which will be the top of the stack
            newnode = Node(data)
            newnode.next = self.head
            self.head = newnode

    def pop(self):
        #if list is empty
        if self.isempty():
            return None
        else:
            #Remove head and then move head to the next element
            popnode = self.head
            self.head = self.head.next
            popnode.next = None
            return popnode.data

        
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
