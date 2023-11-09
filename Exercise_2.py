# Time Complexity : everything is O(N)
# Space Complexity : push O(N) else: O(1)
# Did this code successfully run on Leetcode : Yes and No. 
# successfully run on local device: Yes.
# Any problem you faced while coding this :
# EOF error at input in leet code. When i put input stdin section in leetcode website
# it takes the input and gives accurate output, but when since the input is called in 
# infinite loop (while true) and i only gave limited number of inputs in each line
# after all inputs are used there'll be no other input left and program will be stuck
# waiting for input forever. That's where EOF error comes at rescue and terminates the 
# snippet
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self): 
        self.head = None
        self.counter = 0
        
    def push(self, data):
        # self.stack.append(data)
        newNode = Node(data)
        if self.head == None:
            self.head = newNode
            self.counter += 1
        else:
            curr = self.head
            while(curr.next != None):
                curr = curr.next
            curr.next = newNode
            self.counter += 1
        
    def pop(self):
        if self.counter == 0:
            print("stack is empty therefore pop operation is invalid")
        else:
            curr = self.head
            popVal = 0
            for i in range(self.counter):
                if i == self.counter - 2:
                    popVal =  curr.next.data
                    curr.next.data = None
                    curr.next = None
                    self.counter -= 1
                else:
                    curr = curr.next
        return popVal
        
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
        print(a_stack.show())
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'quit':
        break