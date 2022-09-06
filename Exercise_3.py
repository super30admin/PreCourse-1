'''
Time Complexity
    - append : O(N)
    - find : O(N)
    - remove : O(N)


Space Complexity: O(N)

'''
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
        temp = ListNode(data= data)
        if(self.head):
            dummy = self.head
            while(dummy):
                if(not dummy.next):
                    dummy.next = temp
                    break
                dummy = dummy.next
        else:
            self.head = temp
            
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        dummy_node = self.head
        while(dummy_node):
            if(dummy_node.data == key):
                return dummy_node
                break
            dummy_node = dummy_node.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        dummy_node = self.head
        while(dummy_node.next):
            if(dummy_node.next.data == key):
                dummy_node.next = dummy_node.next.next
                break
            dummy_node = dummy_node.next
        return self.head  

    def showdata(self):
        dummy_node = self.head
        while(dummy_node):
            print(dummy_node.data)
            dummy_node = dummy_node.next

s = SinglyLinkedList()
s.append(1)
s.showdata()
s.append(2)
s.showdata()
s.remove(2)
s.showdata()
print(s.find(3))

