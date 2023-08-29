class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = None
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None

    def append(self, data):
        newNode = ListNode(data)
        if self.head==None:
            self.head = newNode
            return
        temp = self.head
        while temp.next!=None:
            temp = temp.next
        temp.next = newNode


        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        
    def find(self, key):
        if self.head is None:
            return "None"
        temp = self.head
        while temp!=None:
            if temp.data == key:
                return key
            else:
                temp=temp.next
        return False

        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        
    def remove(self, key):
        if self.head is None:
            return "None"
        if self.head.data == key:
            print("check")
            self.head = self.head.next
            return key
        temp=self.head
        while temp.next!=None:
            if temp.next.data == key:
                if temp.next.next is None:
                    temp.next = None
                else:
                    temp.next = temp.next.next
                return key
                
            temp=temp.next
        return False
            
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
    def printList(self):
        if self.head is None:
            print("List is empty")
        temp = self.head
        while temp!=None:
            print(temp.data)
            temp=temp.next

list = SinglyLinkedList(); 
list.append(1)
list.append(2)
list.append(3)
list.append(4)
list.append(5)
print("Found",list.find(0))
print("Found",list.find(1))
print("Found",list.find(5))
print("Found",list.find(7))
list.printList()

print("Remove",list.find(0))
print("Remove",list.find(1))
print("Remove",list.find(5))
print("Remove",list.find(7))
list.printList()

