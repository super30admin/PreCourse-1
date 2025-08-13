# Time Complexity : O(len(LinkedList)) = O(N) -- Append(), Find() and Remove() takes O(N) time
# Space Complexity : O(len(LinkedList)) = O(N) = Non-Contiguous space of O(N). Each node stores data and reference to the next node.
# Did this code successfully run on Leetcode : I could not find the Leetcode link for this
# Any problem you faced while coding this : No

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
        newNode = ListNode(data=data)
        if(not self.head):
            self.head = newNode
        else:
            curr = self.head
            while(curr.next):
                curr = curr.next
            curr.next = newNode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if(not self.head):
            return
        curr = self.head
        while(curr):
            if(curr.data == key):
                return curr
            curr = curr.next
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if(not self.head):
            return
        
        if(self.head.data == key):
            self.head = self.head.next
        else:            
            curr = self.head.next
            prev = self.head
            while(curr):
                if(curr.data == key):
                    prev.next = curr.next
                    curr.next = None
                    break
                prev = curr
                curr = curr.next

# Added function to print the LinkedList. O(N) time complexity
    def printLinkedList(self):
        if(not self.head):
            return
        curr = self.head
        while(curr):
            print(curr.data, end="")
            if(curr.next):
                print(" -> ", end="")
            curr = curr.next

        print()

# For testing purpose
linkedList = SinglyLinkedList()
print(linkedList.find(20))
linkedList.append(11)
linkedList.append(21)
linkedList.append(22)
linkedList.append(20)
linkedList.append(22)
print(linkedList.find(20).data)
print(linkedList.find(16))
linkedList.append(16)
linkedList.printLinkedList()
print(linkedList.find(16))
linkedList.remove(16)
linkedList.printLinkedList()
print(linkedList.find(22))
linkedList.remove(22)
linkedList.printLinkedList()
linkedList.remove(11)
linkedList.printLinkedList()