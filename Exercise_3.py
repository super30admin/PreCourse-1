#Time Complexity O(n)
#Space Complexity O(1)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No 
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
        
    def print_sll(self):
        if self.head is None:
            print("Linked list is empty")
        else:
            current=self.head
            print("\n")
            while current is not None:
                print(current.data, "--->", end=" ")
                current=current.next

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        
        if self.head is not None:
            node=ListNode(data)
            current=self.head
            while current.next != None:
                current=current.next
            current.next=node
        else:
            node=ListNode(data)
            self.head=node
    
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current is not None:
            if current.data == key:
                break
            current = current.next
        return current
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            print("Linked list is empty")
            return
        elif key==self.head.data:
            self.head=self.head.next
            return
        else:
            current=self.head
            while current.next is not None:
                if key==current.next.data:
                    break
                current=current.next
            if current is None:
                print("Key not found")
                return
            else:
                current.next=current.next.next
ssl=SinglyLinkedList()
ssl.print_sll()
ssl.append(20)
ssl.append(10)
ssl.print_sll()
ssl.remove(10)
ssl.print_sll()
ssl.append(30)
print("\n")
print(ssl.find(30))
