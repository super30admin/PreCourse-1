# Time complexity of push, pop : o(1)
# Space complexity : o(1)

class Node:
    def __init__(self, data= None):
       self.data = data
       self.next = None
    def setData(self,data):
      self.data= data
    def getData(self):
      return self.data
    def setNext(self,next=None):
      self.next=next
    def getNext(self):
      if self.hasNext():
        return self.next
    def hasNext(self):
      return self.next!=None 
 
class Stack:
    def __init__(self, data=None):
      self.head=Node
      if data: 
        for data in data:
          self.push(data)
        
    def push(self, data):
      temp=Node()
      temp.setData(data)
      temp.setNext(self.head)
      self.head=temp
        
    def pop(self):
      if self.head is None:
        print("Underflow")
      temp = self.head.getData()
      self.head = self.head.getNext()
      return temp
        
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
