# Time Complexity : O(1) for push, pop
# Space omplexity : O(n) based on size of stack 
# Problems faced : No problems faced 


class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
    
    def isEmpty(self):
        if self.head == None:
            return True
        else:
            return False
        
    def push(self, data):
        if self.head == None:
            self.head = Node(data)
        else:
            newData = Node(data)
            newData.next = self.head
            self.head = newData
        
    def pop(self):
        if self.isEmpty():
            return None
        else:
            removedTopNode = self.head
            self.head = self.head.next
            removedTopNode.next = None
            return removedTopNode.data
        
    def showData(self):
        list = self.head
        while list:
            print(list.data)
            list = list.next


a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give sinput like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    operation = do[0].strip().lower()
    if operation == 'push':
        a_stack.push(int(do[1]))
        print("Pushed Data", a_stack.showData())
    elif operation == 'pop':
        popped = a_stack.pop()
        print("Pushed Data", a_stack.showData())
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'quit':
        break
