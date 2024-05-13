#Time Complexity: O(1)
#space Complexity: O(1)
#did not do on leetcode
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head=None
        
    def push(self, data):
        # Create a new node and point its next node to the current head then update the head to the new node
        new_node=Node(data)
        new_node.next=self.head
        self.head=new_node

        
    def pop(self):
        #check if node is empty
        if self.head is None:
            return None 
        else:
            #take the data node of head and change head tode to the next one
            pop_node=self.head.data
            self.head=self.head.next
            return pop_node


        
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

#pop operation was not working correctly because I did not check if it is empty