# Time Complexity: O(1)
# Space Complexity: O(n)
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
        self.head = ListNode(None)
        self.tail=self.head

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        #Time Complexity: O(1)
        newnode=ListNode(data)
        self.tail.next=newnode
        self.tail=self.tail.next

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        index=0
        tmpNode=self.head
        while tmpNode:
            if tmpNode.data==key:
                return index
            index+=1
            tmpNode=tmpNode.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        tempnode=ListNode(0,self.head)
        while tempnode.next:
            if tempnode.next.data and tempnode.next.data==key:
                tempnode.next=tempnode.next.next
                return
            tempnode=tempnode.next
        return None

s = SinglyLinkedList()
s.append(1)
s.append(2)
s.append(3)
s.append(4)
s.append(5)
print(s.find(3))
print(s.remove(5))
print(s.find(1))