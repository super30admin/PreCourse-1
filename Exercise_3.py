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

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        node=ListNode(data,None)
        if self.head==None:
            self.head=node
        else:
            temp=self.head
            while(temp.next!=None):
                temp=temp.next
            temp.next=node
        return "node inserted"

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head==None:
            return None
        else:
            temp=self.head
            while(temp.data!=None):
                if temp.data==key:
                    return temp.data
                temp=temp.next
            return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head

        if (temp is not None):
            if (temp.data == key):
                self.head = temp.next
                temp = None
                return "Node deleted"

        while (temp is not None):
            if temp.data == key:
                break
            prev = temp
            temp = temp.next

        if (temp == None):
            return "Node deleted"

        prev.next = temp.next

        temp = None



        return "Node deleted"
                    

singly=SinglyLinkedList()

print(singly.append(1))
print(singly.append(2))
print(singly.append(1))
print(singly.remove(2))
print(singly.remove(1))
print(singly.remove(1))
