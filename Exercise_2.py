class Node:
    def __init__(self,value=None):
        self.value=value
        self.next=None


class SLinkedlist:
    def __init__(self):
        self.head=None
        self.tail=None
        #self.size=0

    def __iter__(self):
        node=self.head
        while node:
            yield node
            node=node.next

    def insertnode(self,value,location):
        newnode= Node(value)
        if self.head is None:
            self.head=newnode
            self.tail=newnode
        else:
            if location==0:
                newnode.next=self.head
                self.head=newnode
            elif location==-1:
                #print('Inserting at the end')
                newnode.next=None
                self.tail.next= newnode
                self.tail=newnode
            else:
                tempnode=self.head
                index=0
                while(index<location-1):
                    tempnode=tempnode.next
                    index+=1
                nextnode = tempnode.next
                tempnode.next = newnode
                newnode.next=nextnode
                if self.head==self.tail:
                    self.tail=newnode
    def Slinkedlist_traverse(self):
        if self.head is None:
            print('There are no nodes to traverse')
        else:
            node=self.head
            while node:
                print(node.value)
                node=node.next

    def slinkedlist_search(self,nodevalue):
        if self.head is None:
            print('The linked list is empty')
        else:
            node=self.head
            while node:
                if node.value==nodevalue:
                    return node.value
                node=node.next
            return 'The node does not exist in linked list'

    def Slinkedlist_deletion(self,location):
        if self.head is None:
            print('the linked list doesnt exist')
        else:
            if location==0:
                if self.head==self.tail:
                    self.head=None
                    self.tail=None
                else:
                    self.head=self.head.next
            elif location==-1:
                if self.head==self.tail:
                    self.head=None
                    self.tail=None
                else:
                    prevnode=self.head
                    while prevnode:
                        if prevnode.next==self.tail:
                            break
                        prevnode=prevnode.next
                    prevnode.next=None
                    self.tail=prevnode
            else:
                tempnode=self.head
                index=0
                while index<location-1:
                    tempnode=tempnode.next
                    index+=1
                nextnode=tempnode.next
                tempnode.next=nextnode.next




singlelinkedlist= SLinkedlist()
singlelinkedlist.insertnode(7,-1)
singlelinkedlist.insertnode(3,-1)
singlelinkedlist.insertnode(9,1)
singlelinkedlist.insertnode(4,-1)
singlelinkedlist.insertnode(99,0)
singlelinkedlist.insertnode(100,0)
singlelinkedlist.insertnode(44,0)


print([node.value for node in singlelinkedlist])
#singlelinkedlist.Slinkedlist_traverse()
#print(singlelinkedlist.slinkedlist_search(50))
singlelinkedlist.Slinkedlist_deletion(3)
print([node.value for node in singlelinkedlist])
