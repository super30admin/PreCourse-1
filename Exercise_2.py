
'''
// Time Complexity :
    push    : O(1)
    pop     :  O(N) N - Number of elements in LinkedList
// Space Complexity :
    O(N)    - Every push would add a element for LinkedList
// Did this code successfully run on Leetcode :
    Not able to find equivalent problem in Leetcode
// Any problem you faced while coding this :
    - Jumped in coding before whiteboarding solution which took me to roam around
    - Went back to board solved flow later coded, which helped to solve.
// Your code here along with comments explaining your approach
    - See comments in line
'''


# LinkedList Node class to hold every Nodes, each node would have data and pointer to next node
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 


# Stack class implemented with LinkedList
class Stack:
    # Instance variables head and tail added
    def __init__(self):
        self.head=None
        self.tail=None
    
    # Push has following scenarios,
    # 1. Stack is empty
    # 2. Stack is not empty 
    #   2.a Single node - here both head and tail should point the same node 
    #   2.b multiple nodes , add a node to tail.next update tail as prev tail's next
    def push(self, data):
        if self.head is None:
            self.head=Node(data)
            self.tail=self.head
        else:
            self.tail.next=Node(data)
            self.tail=self.tail.next


    # Pop could have following scenarios
    # 1. Stack is empty     : return None
    # 2. Stack is single element    : return HEAD/TAIL set  both None
    # 3. head has next that means , there is tail
        #  Iterate from head, until current node's next.next is empty
            # store current's next.next in tmp
            # set current as  tail , tail's next as None,  return tmp
    def pop(self):
        if self.tail is None:
            return None
        
        if self.head.next is None:
            tmp=self.head
            self.head=None
            self.tail=None
            return tmp.data

        node=self.head
        while node.next.next is not None:
            node=node.next
        
        self.tail=node
        tmp=self.tail.next
        self.tail.next=None
        return tmp.data
        
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
