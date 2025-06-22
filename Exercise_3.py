'''
Implement Singly Linked List.
'''

# Time Complexity : O(n) for append, find, and remove operations. O(1) for initialization.
# Space Complexity : O(n) for storing the nodes in the linked list.
# Did this code successfully run on Leetcode : NA
# Any problem you faced while coding this : Yes, the challenging part were to implement find and remove methods correctly, especially handling edge cases like removing the head node or an empty list.

class ListNode: # humne ListNode class banaya hai jo Singly Linked List ke ek node ko represent karta hai (We have created a ListNode class that represents a node in a Singly Linked List)
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None): # humne ListNode class ka constructor banaya hai jo data aur next pointer ko initialize karta hai (We have created a constructor for the ListNode class that initializes the data and next pointer)
        self.data = data # yahaan hum data ko self.data mein store kar rahe hain (Here we are storing the data in self.data)
        self.next = next # yahaan hum next pointer ko self.next mein store kar rahe hain (Here we are storing the next pointer in self.next)
    
class SinglyLinkedList: # humne SinglyLinkedList class banaya hai jo singly linked list ko represent karta hai (We have created a SinglyLinkedList class that represents a singly linked list)
    def __init__(self): # humne SinglyLinkedList class ka constructor banaya hai jo head ko None se initialize karta hai (We have created a constructor for the SinglyLinkedList class that initializes the head to None)
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None # yahaan hum head ko None se initialize kar rahe hain (Here we are initializing the head to None)

    def append(self, data): # humne append method banaya hai jo Singly Linked List ke end mein ek naya element with the value `data` add karta hai (We have created an append method that adds a new element with the value `data` at the end of the Singly Linked List)
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data) # yahaan hum ek naya ListNode class ka object new_node banate hain jo data ko store karta hai (Here we create a new object of the ListNode class, new_node, which stores the data)
        if not self.head: # agar head None hai, toh hum new_node ko head bana dete hain (if the head is None, we set new_node as the head)
            self.head = new_node # yahaan hum head ko new_node se set kar rahe hain (Here we are setting the head to new_node)
            return # agar head None nahi hai, toh hum linked list ke end tak traverse karte hain aur new_node ko last node ke next mein set karte hain (if the head is not None, we traverse to the end of the linked list and set new_node as the next of the last node)
        
        current = self.head # yahaan hum current ko head se initialize karte hain (Here we initialize current to the head)
        while current.next is not None: # jab tak current ka next None nahi hai, tab tak hum current ko next node par set karte hain (while current's next is not None, we set current to the next node)
            current = current.next # yahaan hum current ko next node par set kar rahe hain (Here we are setting current to the next node)
        current.next = new_node # yahaan hum current ka next new_node se set kar rahe hain (Here we are setting current's next to new_node)    
        
        
    def find(self, key): # humne find method banaya hai jo linked list mein pehla element 'key' ke saath match karta hai (We have created a find method that searches for the first element in the linked list that matches 'key')
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head # yahaan hum current ko head se initialize karte hain (Here we initialize current to the head)
        while current is not None: # jab tak current None nahi hai, tab tak hum current ka data check karte hain (while current is not None, we check the data of current)
            if current.data == key: # agar current ka data key ke barabar hai, toh hum current ko return karte hain (if current's data is equal to key, we return current)
                return current # yahaan hum current ko return kar rahe hain (Here we are returning current)
            current = current.next # aur agar nahi hai, toh hum current ko next node par set karte rehte hain jab tak current None nahi ho jata (if not, we keep setting current to the next node until current becomes None)
        return None # agar key nahi milta, toh hum None return karte hain (if the key is not found, we return None)

    def remove(self, key): # humne remove method banaya hai jo linked list se pehla occurrence of `key` ko remove karta hai (We have created a remove method that removes the first occurrence of `key` from the linked list)
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # Case 1: Empty list
        if not self.head: # agar head None hai, toh hum kuch nahi karte (if the head is None, we do nothing)
            return # yahaan hum return karte hain (Here we return)
        
        # Case 2: Head node is the one to remove
        if self.head.data == key: # agar head ka data key ke barabar hai, toh hum head ko next node par set karte hain (if the head's data is equal to key, we set the head to the next node)
            self.head = self.head.next # yahaan hum head ko next node se set kar rahe hain (Here we are setting the head to the next node)
            return # yahaan hum return karte hain (Here we return)
        
        # Case 3: General removal
        prev = None # yahaan hum prev ko None se initialize karte hain (Here we initialize prev to None)
        current = self.head # yahaan hum current ko head se initialize karte hain (Here we initialize current to the head)
        while current is not None: # jab tak current None nahi hai, tab tak hum current ka data check karte hain (while current is not None, we check the data of current)
            if current.data == key: # agar current ka data key ke barabar hai, toh hum current ko remove karte hain (if current's data is equal to key, we remove current)
                prev.next = current.next # yahaan hum prev ka next current ke next se set karte hain (Here we set prev's next to current's next)
                return # yahaan hum return karte hain (Here we return)
            prev = current # yahaan hum prev ko current se set karte hain (Here we set prev to current)
            current = current.next # aur current ko next node par set karte hain (and set current to the next node)
