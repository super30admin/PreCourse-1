class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None
        self.head = None
        
    def push(self, data):
       
        listnode = Node(data)
        if self.top :
            self.top.next = listnode
        self.top = listnode
        if not self.head:
            self.head = listnode
            

        
    def pop(self):
        temp = self.head
        if not self.top:
            return None

        prevnode = None
        while temp.next:
            prevnode = temp
            temp = temp.next

        temp1 = self.top.data
        if not prevnode:
            self.head = None
            self.top = None
        else:
            prevnode.next = None
            self.top = prevnode
        return temp1


    def show(self):
        temp = self.head
        while temp:
            print(temp.data)
            temp = temp.next




        
a_stack = Stack()
print(a_stack.pop())
a_stack.push(10)
a_stack.push(12)


a_stack.push(13)
a_stack.push(14)
#print(a_stack.pop())

a_stack.show()


