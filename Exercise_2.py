### Time Complexity: ###
# push operation: Takes O(1) time as we are inserting new element at the beginning of the linked list
# pop operation: O(1) 

### Space Complexity: ###
# Since we are using a linked list data structure to implement stack 
# space complexity is O(n)

# Did not try to run this code on leetcode as the questions are a litte different on leetcode

# No issues faced while coding this exercise

## Code along with comments explaining my approach
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Stack:
    def __init__(self):
        self.curr = None

    def push(self, data):
        if self.curr == None:               #if initial node(curr node) is empty
            self.curr = Node(data)          #we create the curr node and initialize it with the data
        else:
            nextNode = Node(data)           #if initial node is not empty, then we create a new nextNode with data
            nextNode.next = self.curr       #nextNode's next value is curr Node, which means the new node is getting added at beginning of the Linked List
            self.curr = nextNode            #we set next node as the curr Node making it beginning of Linked list

    def pop(self):
        if self.curr == None:               #if no node exists then we cannot pop hence we return None
            return None
        else:
            temp = self.curr                #we store curr node(first node's) value in temp variable
            self.curr = self.curr.next      #change pointer of curr node to curr.next
            temp.next = None                #change pointer of temp Node pointing to None
            return temp.data                #return the temp node's value
        
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
