#Time Complexity :
# Push, pop O(N) ,  N = size of list 

#Space Complexity :
# O(N), N is the number of elements in the array

#Did this code successfully run on Leetcode :
#No - I did not find this problem on leetcode. I ran this on local test cases

#Any problem you faced while coding this :
#No. Only problem was that I did not find it on leetcode and hence have tested it only locally



class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        #If head is empty, that is where we need to add data, else, we need to 
        #go to the end of the linked list and create a new node there
        if self.head == None :
            self.head = Node(data)
        else : 
            current = self.head
            while current.next != None :
                current = current.next
            current.next = Node(data)
            #self.head = self.head.next
            
    def pop(self):
        #If head is None, no elements in list, return None
        if self.head == None :
            return None
            
        current = self.head
        #If next is None directly, then only 1 element, remove it from the list and return it 
        if current.next == None :
            value = self.head.data
            self.head = None
            return value
        else :
            # If there are more than one element, then look until a point where 2 steps ahead is none
            # Then it means the next element is the last one and needs to be removed and returned
            while (current.next.next) != None :
                current = current.next
            value = current.next.data
            current.next = None
            return value
            
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
