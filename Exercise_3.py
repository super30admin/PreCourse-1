# Time Complexity : O(n) for all given functions
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
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
        if self.head == None:
            self.head = ListNode(data)

        else:
            add = ListNode(data)
            temp = self.head
            while(temp.next):
                temp = temp.next
            temp.next = add
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head == None:
            return None
        else:
            temp = self.head
            while(temp):
                if temp.data == key:
                    return temp.data # returning the value in the node instead of the node itself for better look
                temp = temp.next
            return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == None:
            return None
        
        else:
            if self.head.data == key: # if found at the beginning
                temp = self.head
                self.head = self.head.next
                temp.next = None
                return temp.data
                
            elif self.find(key) == None:
                return None

            else:
                temp = self.head
                while(temp):
                    if temp.data == key:
                        slow = self.head
                        while(slow.next != temp):
                            slow = slow.next
                        slow.next = slow.next.next
                        temp.next = None
                        return temp.data
                    temp = temp.next
                return None

list = SinglyLinkedList()
list.append(10)
list.append(20)
list.append(30)
print("Found " + str(list.find(20))) # Found
print("Found " + str(list.find(10))) # Found
print("Found " + str(list.find(40))) # Not Found 
print("Removed " + str(list.remove(30))) # Removed
print("Found " + str(list.find(30))) # Not Found as not found
print("Removed " + str(list.remove(10))) # Removed
print("Removed " + str(list.remove(40))) # Not Removed as not found
