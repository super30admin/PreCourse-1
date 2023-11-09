#Time Complexity : O(n) for append,find,remove
class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next= next
    
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
        new_node = ListNode(data)
        if self.head != None:
            itr = self.head
            while itr.next != None:
                itr = itr.next
            itr.next = new_node
        else:
            self.head = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        found = False
        itr = self.head
        while itr != None:
            if itr.data == key:
                found = True
                return itr.data
            itr = itr.next
        if not found:
            return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        found = False
        prev = self.head
        next_n = prev.next
        # if key present at head node
        if prev != None and prev.data == key:
            found = True
            #if more
            if prev.next != None: 
                self.head = prev.next
                prev.next = None
                return 1
            else:
                self.head = None
                return 1
        # if key present at intermediate/end node
        while prev != None and next_n != None:
            if next_n.data == key:
                found = True
                if next_n.next == None:
                    prev.next = None
                    next_n = None
                    return 1
                else:
                    prev.next = next_n.next
                    next_n = None
                    return 1
            prev = prev.next
            next_n = next_n.next
        if not found:
            return None

#ll = SinglyLinkedList()
#ll.append(10)
#ll.append(20)
#ll.append(30)
#pos =ll.find(40)
#rem = ll.remove(30)
#print('Found at ',pos)
#if rem == 1:
    #print('Removed successfully')
