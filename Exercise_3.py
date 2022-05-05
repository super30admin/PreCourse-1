# Time complexity of appeend remove find O(N) as we have to traverse the link list
# Space Complexity is also O(N) depending on incoming data nodes
class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=next
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        node = ListNode(data,None)
        if self.head==None:
            self.head=node
            return
        cur= self.head
        while cur.next:
            cur=cur.next
        cur.next= node
            
        
            
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        cur=self.head
        while cur:
            if cur.data==key:
                return cur.data
            cur=cur.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head==None:
            return "LinkList is Empty"
        if self.head.data==key: 
            if self.head.next:
                delnode=self.head
                self.head=self.head.next
                delnode.next=None
                return delnode.data
            else:
                delnode=self.head
                self.head=None
                return delnode.data

        cur=self.head
        while cur.next and cur.next.data==key:
            delnode=cur.next
            cur.next=cur.next.next
            return delnode.data
        return None
     
    def printlinklist(self):

        if self.head==None:
            print("Linklist is empty")
            return
        cur= self.head
        list1=""
        
        while cur:
            list1=list1+(str(cur.data)+ "--->")
            cur=cur.next
        print(list1)
    
linklist= SinglyLinkedList()
linklist.append("5")
linklist.append("8")
linklist.append("9")
linklist.append("3")
linklist.append("6")
linklist.printlinklist()
print(linklist.find("5"))
print(linklist.remove("8"))
print(linklist.remove("9"))
print(linklist.remove("5"))
print(linklist.remove("3"))
print(linklist.remove("6"))
linklist.printlinklist()

