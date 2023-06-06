class Node:
    def __init__(self, key):
        self.key=key
        self.next=None
        
def push(key,curr):
    
    while(curr.next!=None):
        curr=curr.next
    temp=Node(key)
    prev=curr
    curr=temp
    prev.next=curr
        
def pop(curr):
    while(curr.next.next != None):
        curr=curr.next
    prev=curr
    curr.next=None
    prev.next=None

def prnt(s):
    while(s != None):
        print(s.key)
        s=s.next

s=Node(3)
s.next=Node(4)
push(5,s)
push(6,s)
push(7,s)
pop(s)
pop(s)
pop(s)
pop(s)
print(s)




