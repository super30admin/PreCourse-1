class Node:
    def __init__(self, key):
        self.key=key
        self.next=None

def add(key,pos, curr):
    c=0
    temp=curr
    temp1=Node(key)
    while(c<=pos):
        if(temp!=None):
            succ=temp.next
            temp.next=temp1
            temp1.next=succ
            break
        c+=1

def remove(key,curr):
    while(curr !=None):
        if(curr.next.key==key):
            prev=curr.next
            curr.next=curr.next.next
            prev=None
            break
        curr=curr.next



curr=Node(1)
curr.next=Node(2)
curr.next.next=Node(3)
curr.next.next.next=Node(4)

add(2, 2, curr)
remove(2, curr)
t=curr
while(t!=None):
    print(t.key)
    t=t.next
