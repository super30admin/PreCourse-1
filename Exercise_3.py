# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : N/A
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
        #Create a new node
        new_node = ListNode(data)
        if(self.head == None):
            #set new node as head
            self.head = new_node
        else:
            #traverse to the end of linked list and append it to end
            node = self.head
            while(node.next != None):
                node = node.next
            node.next = new_node

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        node = self.head
        #if node = key then returning node else pointing it to the next node
        while(node.next != None):
            if(node.data == key):
                return node
            else:
                node = node.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        #if head = key so pointing current head to next node
        if(self.head.data == key):
            self.head = self.head.next
        node = self.head
        #Traversing through linked list and if key is found then pointing it's previous node to it's next node
        while(node.next != None):
            if(node.next.data == key):
                node.next = node.next.next
                node.next.next = None
                break
            node = node.next

mylinkedlist = SinglyLinkedList()
mylinkedlist.append(4)
mylinkedlist.append(6)
mylinkedlist.append(8)
mylinkedlist.append(10)
print(mylinkedlist.find(8))
mylinkedlist.remove(8)
mylinkedlist.find(8)