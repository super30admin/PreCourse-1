# Time complexity:
# Space complexity:O(n)

# Did this code successfully run on Leetcode :Sucessfully runs on loca (self tested)
# Any problem you faced while coding this :No


class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.val=data
        self.next=next
    
class SinglyLinkedList:
    
    # Time complexity:O(1)
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None

    # Time complexity:O(n)
    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        newNode=ListNode(data)
        # check if the linked list is empty
        if self.head is None:
            self.head=newNode
            return
            # return self.head
        #move the pointer till the end to add new node with data
        tail=self.head
        while tail.next:
            tail=tail.next
        tail.next=newNode
        # return self.head
        # return



    # Time complexity:O(n)
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        pointer = self.head
        # starts from the head to find the key
        while pointer:
            if pointer.val==key:
                #  if key is found return key or true
                return pointer
            pointer=pointer.next
        # if not found return none
        return None

    # Time complexity:O(n)        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # if head is the key move the head pointer ahead and return
        pointer=self.head
        if pointer.val==key:
            self.head=pointer.next
            # pointer.next=None
            # pointer.val=None
            return self.head
        prev=pointer
        pointer=pointer.next
        # two pointers to get the previous element
        while pointer:
            if pointer.val==key:
                # if key is found link the previous pointer to the next to next pointer
                prev.next=pointer.next 
                return self.head
            prev=pointer
            pointer=pointer.next
    
    def printing(self):
        p=self.head
        while p:
            print(p.val)
            p=p.next
        return




x=SinglyLinkedList()
x.append(5)
x.append(6)
x.append(7)
x.append(8)
x.append(9)
x.append(10)
print(x.printing())
# print(x.find(5).val)
# print(x.find(6).val)
# print(x.remove(6))
# print(x.remove(10))
# print(x.remove(5))
# print(x.printing())
# print(x.find(5).val)