class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next
    
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
        if self.head is None:
            self.head = ListNode(data)
        else:
            currNode = self.head
            while(currNode.next is not None):
                currNode = currNode.next
            currNode.next = ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        currNode = self.head
        while(currNode is not None):
            if(currNode.data == key):
                return currNode
            currNode = currNode.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if(self.head is None):
            print("List is Empty")
            return False
        if(self.head.data == key):
            self.head = self.head.next
            print("Successfully Removed the element %s" %key)
            return True
        curr = self.head
        while(curr.next is not None):
            if(curr.next.data == key):
                curr.next = curr.next.next
                print("Successfully removed the element %s" %key)
                return True
            curr = curr.next
        print("Key doesn't exist in the List")
        return False
    def __str__(self):
        curr = self.head
        out = []
        while(curr is not None):
            out.append(str(curr.data))
            curr = curr.next
        return " ".join(out)
# Test
myList = SinglyLinkedList()
myList.append(1)
myList.append(2)
myList.append(3)
myList.append(4)
print(myList)
myList.remove(3)
print(myList)
myList.remove(1)
print(myList)