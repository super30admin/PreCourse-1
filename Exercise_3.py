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
        
# Time Complexity - O(n)
# Approach : This implementation is same as push in linkedlist
    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        newListNode = ListNode(data,None)
        
        if(self.head is None):
            self.head = newListNode
           
        else:
            cur_val = self.head
            while(cur_val.next is not None):
                cur_val = cur_val.next
            cur_val.next = newListNode
# Time Complexity - O(n)    
#Approach : loop over the nodes and if the key value matches return or return None
    def find(self, key):
        cur_val = self.head
        if(self.head is None):
            print ("list is Empty")
        else:
            while(cur_val is not None):
                if(cur_val.data==key):
                    return cur_val.data
                cur_val = cur_val.next
            return None
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
#Time Complexity - O(n) 
#Approach : if the element to be removed is first element then set the head value accordingly
#For rest, set the prev's node next value to the removing node's next value
# Print element not present is the element not in the linked list is given
    def remove(self, key):
        cur_val = self.head
        if(self.head is None):
            print ("list is Empty")
            return
        else:
             while(cur_val is not None):
                 prev = cur_val
                 if(prev.data == key):
                     self.head = prev.next
                     return
                 cur_val = cur_val.next
                 if(cur_val is not None and cur_val.data==key):                 
                    prev.next = cur_val.next
                    return
                    #print(prev.next)
        print ("Element given is not present in the list")
                    
            
        
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

#Space Complexity for n elements - O(n)
