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
        if self.head is None:
            self.head=ListNode(data)
            return
        temp=self.head
        while temp.next:
            temp=temp.next
        temp.next=ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp=self.head
        while temp:
            if temp.data==key:
                return temp.data
            temp=temp.next
        return "None"
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = ListNode(-1)
        temp.next = self.head
        prev = temp
        curr = self.head
        if temp.next:#if node to be removed is present at head
            if temp.next.data==key:
                self.head=temp.next.next
                return
        
        while curr:#otherwise
            if curr.data == key:
                prev.next = curr.next
                break
            else:
                prev = curr
            curr = curr.next
        
    # def printS(self):
    #     temp=self.head
    #     while temp:
    #         print(temp.data, end="->")
    #         temp=temp.next
            

# s=SinglyLinkedList()
# s.append(5)
# s.append(4)
# s.append(3)
# s.append(10)


# print(s.find(6))