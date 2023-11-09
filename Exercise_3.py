class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=None
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None
        self.tail=self.head
        self.length=0

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        newnode=ListNode(data)
        if self.head==None:     #if list is empty 
            self.head=newnode
            self.tail=self.head
        else:                   #if list is not empty 
            self.tail.next=newnode
            self.tail=newnode
        self.length=self.length+1

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        node=self.head
        while node.data!=key: #loop through the list until you find the matching element, if not found return None
            if node.next==None:
                return None
            else:
                node=node.next
            
        return node.data

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        newnode=self.head
        #case-1 if list is empty
        if self.head==None:
            print('list is empty')
            return 
        #case-2 if key is first element (key is the head)
        if newnode.data==key:
            self.head=self.head.next
            if self.head==None or self.head.next==None:
                self.tail=self.head
            self.length=self.length-1
            return
        #case-3 if key is any element other than first one
        while newnode.next!=None and newnode.next.data!=key:
            newnode=newnode.next
        if newnode.next!=None: 
            newnode.next=newnode.next.next
            if newnode.next==None: #if last node is removed (key is last node)
                self.tail=newnode
            self.length=self.length-1
            return
        else:
            print('The given value is not found')

    def show_list(self):
        show_list=[]
        currentnode=self.head
        for i in range(self.length):
            show_list.append(currentnode.data)
            currentnode=currentnode.next
        return show_list


a_list=SinglyLinkedList()
a_list.append(10)
a_list.append(20)
a_list.append(30)
a_list.append(40)
print(a_list.show_list())
a_list.remove(30)
a_list.append(60)
a_list.append(70)
print(a_list.find(40))
print(a_list.show_list())
a_list.remove(10)
a_list.remove(20)
a_list.remove(40)
a_list.remove(30)
a_list.remove(60)
print(a_list.show_list())
print(a_list.head.data)

            




